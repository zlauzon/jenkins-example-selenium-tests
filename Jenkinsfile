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
                }
            }
        }
    }
}
