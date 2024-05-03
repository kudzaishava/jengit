pipeline {
    agent any

    stages {
        stage("Build") {
            steps {
                echo "Building with Maven..."
            }
            post {
                always {
                    mail to: "klshava97@gmail.com",
                        subject: "Build Status Email",
                        body: "Build log attached!",
                        attachLog: true
                }
            }
        }

        stage("Test") {
            steps {
                echo "Running Unit Tests with JUnit..."
                echo "Running Integration Tests with Selenium..."
            }
            post {
                always {
                    mail to: "klshava97@gmail.com",
                        subject: "Test Status Email",
                        body: "Test log attached!",
                        attachLog: true
                }
            }
        }

        stage("Code Analysis") {
            steps {
                echo "Analyzing code with SonarQube..."
                // Replace with your actual code analysis command using SonarQube plugin
            }
        }

        stage("Security Scan") {
            steps {
                echo "Scanning code with OWASP ZAP..."
                // Replace with your actual security scan command using OWASP ZAP plugin
            }
        }

        stage("Deploy to Staging") {
            steps {
                echo "Deploying to AWS EC2 staging server..."
                // Replace with your actual deployment command using tools like AWS CLI
            }
        }

        stage("Integration Tests on Staging") {
            steps {
                echo "Running Integration Tests on Staging..."
                // Replace with your actual integration test command on the staging server
            }
        }

        stage("Deploy to Production") {
            steps {
                echo "Deploying to AWS EC2 production server..."
                // Replace with your actual deployment command using tools like AWS CLI
            }
        }
    }
}
