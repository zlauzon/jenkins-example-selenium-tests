pipeline {
    agent { label 'linux'}
    stages {
        stage('Verify browser are installed') {
            steps {
                sh 'google-chrome --version'
                sh 'firefox --version'
            }
        }
        stage('Run Tests') {
            steps {
                sh "chmod +x -R ${env.WORKSPACE}"
                sh './mvnw clean test'
            }
            post {
                always {
                    junit '**/surefire-reports/*.xml'
                    cucumber buildStatus: 'UNCHANGED', customCssFiles: '', customJsFiles: '', failedFeaturesNumber: -1, failedScenariosNumber: -1, failedStepsNumber: -1, fileIncludePattern: 'target/cucumber.json', pendingStepsNumber: -1, skippedStepsNumber: -1, sortingMethod: 'ALPHABETICAL', undefinedStepsNumber: -1
                }
            }
        }
    }
}
