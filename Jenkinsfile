pipeline {
    agent { label 'linux'}
    stages {
        stage('Verify browser are installed') {
            steps {
                sh 'google-chrome --version'
            }
        }
        stage('Run Tests') {
            steps {
                sh 'chmod +x -R "${env.WORKSPACE}"'
                sh './mvnw clean test'
            }
        }
    }
}
