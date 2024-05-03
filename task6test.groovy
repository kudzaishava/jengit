pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo "Building the code using Maven..."
            }
            post {
                always {
                    mail bcc: '',
                         body: 'Build log attached!',
                         cc: '',
                         from: '',
                         replyTo: '',
                         subject: 'Build Status Email',
                         to: "klshava97@gmail.com",
                         attachLog: true
                }
            }
        }

        stage('Unit and Integration Tests') {
            steps {
                echo "Running unit and integration tests using JUnit and Selenium..."
            }
            post {
                always {
                    mail bcc: '',
                         body: 'Test results attached!',
                         cc: '',
                         from: '',
                         replyTo: '',
                         subject: 'Test Status Email',
                         to: "klshava97@gmail.com",
                         attachLog: true
                }
            }
        }
    }
}
