pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                script {
                    // Maven build
                    def mvnHome = tool 'Maven'
                    sh "${mvnHome}/bin/mvn clean install"
                }
            }
        }
    }
}