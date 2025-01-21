pipeline {
    agent any
    stages {
        stage('Install chrome') {
            sh 'wget https://dl.google.com/linux/direct/google-chrome-stable_current_amd64.deb'
            sh 'apt-get install -y ./google-chrome-stable_current_amd64.deb'
        }
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