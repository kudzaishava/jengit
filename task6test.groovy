pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo "Building the code using Maven..."
            }
            post {
                always {
                    emailext attachLog: true,
                            body: 'Build log attached!',
                            subject: 'Build Status Email',
                            to: "tabodlams@gmail.com"
                }
            }
        }

        stage('Unit and Integration Tests') {
            steps {
                echo "Running unit and integration tests using JUnit and Selenium..."
            }
            post {
                always {
                    emailext attachLog: false,
                            body: 'Test results attached!',
                            subject: 'Test Status Email',
                            to: "tabodlams@gmail.com"
                }
            }
        }

    }
}
