pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo "Building the code using Maven..."
            }
            post {
                always {
                    emailext 
                            body: 'Build log attached!',
                            subject: 'Build Status Email',
                            to: "klshava97@gmail.com"
                }
            }
        }

        stage('Unit and Integration Tests') {
            steps {
                echo "Running unit and integration tests using JUnit and Selenium..."
            }
            post {
                always {
                    emailext 
                            body: 'Test results attached!',
                            subject: 'Test Status Email',
                            to: "klshava97@gmail.com"
                }
            }
        }

    }
}
