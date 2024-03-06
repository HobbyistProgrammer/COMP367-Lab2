pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                script {
                    dir('COMP367-Lab2/COMP367_Lab2') {
                        def mvnHome = tool 'Maven'
                        sh "${mvnHome}/bin/mvn clean install"
                    }
                }
            }
        }
    }
}