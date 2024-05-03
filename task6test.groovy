post {
        success {
            emailext body: "Build ${currentBuild.fullDisplayName} succeeded",
                     subject: "${env.JOB_NAME} - Build #${env.BUILD_NUMBER} - Successful",
                     to: 'klshava97@gmail.com',
                     attachLog: true
        }
        failure {
            emailext body: "Build ${currentBuild.fullDisplayName} failed",
                     subject: "${env.JOB_NAME} - Build #${env.BUILD_NUMBER} - Failed",
                     to: 'klshava97@gmail.com',
                     attachLog: true
        }
        unstable {
            emailext body: "Build ${currentBuild.fullDisplayName} is unstable",
                     subject: "${env.JOB_NAME} - Build #${env.BUILD_NUMBER} - Unstable",
                     to: 'klshava97@gmail.com',
                     attachLog: true
        }
        always {
            emailext body: "Build ${currentBuild.fullDisplayName} has finished with status ${currentBuild.currentResult}",
                     subject: "${env.JOB_NAME} - Build #${env.BUILD_NUMBER} - ${currentBuild.currentResult}",
                     to: 'klshava97@gmail.com',
                     attachLog: true
        }
    }
