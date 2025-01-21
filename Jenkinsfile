pipeline {
    agent any
    stages {
        stage('Verify browser are installed') {
            steps {
                sh 'google-chrome --version'
                sh 'firefox --version'
            }
        }
        stage('Run Tests') {
            steps {
                sh './mvnw clean test'
            }
        }
    }
}