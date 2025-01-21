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
                sh './mvnw clean test'
            }
        }
    }
}
