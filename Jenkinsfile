pipeline {
    agent any

    stages {
        stage('Check out') {
            steps {
                checkout scm
            }
        }

        stage('Build Maven project') {
            steps {
                withMaven(maven: 'maven-3.6.3', jdk: 'jdk 11') {
                    sh 'mvn clean package'
                }
            }
        }

        stage('Docker build') {
            steps {
                script {
                    docker.build('lab4_docker')
                }
            }
        }

        stage('Docker login') {
            steps {
                script {
                    docker.withRegistry('https://registry.hub.docker.com', 'dockerhub-credentials') {
                    }
                }
            }
        }

        stage('Docker push') {
            steps {
                script {
                    docker.withRegistry('https://registry.hub.docker.com', 'dockerhub-credentials') {
                        dockerImage.push()
                    }
                }
            }
        }
    }

    environment {
        registryCredential = 'dockerhub-credentials'
    }

    post {
        always {
            sh 'docker system prune -af'
        }
    }
}
