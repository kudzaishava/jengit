pipeline {
    agent any
 
    stages {
        stage('Test') {
            steps {
                echo 'AH'
            }
        }
        stage('Security Scan') {
            steps {
                echo 'AH'
            }
        }
    }
 
    post {
        success {
            emailext body: 'The ${currentBuild.fullDisplayName} was successful',
                     subject: 'Jenkins Pipeline Success Notification',
                     to: 'klshava97@gmail.com',
                    attachLog: true
        }
        failure {
            emailext body: 'The ${currentBuild.fullDisplayName} failed',
                     subject: 'Jenkins Pipeline Failure Notification',
                     to: 'klshava97@gmail.com',
                    attachLog: true
        }
    }
}
