pipeline {
    agent any

    tools {
        maven 'maven-3.8.6'
    }


    environment {
        registryCredential = 'dockerhub-credentials'
    }

    stages {
        stage('Check out') {
            steps {
                checkout scm
            }
        }

        stage('Build Maven project') {
            steps {
                withMaven(maven: 'maven-3.8.6', jdk: 'jdk 11') {
                    sh 'mvn clean package'
                }
            }
        }

        stage('Docker build') {
            steps {
                script {
                    env.dockerImage = docker.build('lab4_docker')
		    echo "building docker image: $env.dockerImage" 
                }
            }
        }

        stage('Docker push') {
            steps {
                script {
                    docker.withRegistry('https://registry.hub.docker.com', 'dockerhub-credentials') {
			def lowercase = env.dockerImage.toLowerCase()
			echo "pushing docker image: $lowercase"
			sh "docker push ${lowercase}:latest"
                    }
                }
            }
        }
    }


    post {
        always {
            sh 'docker system prune -af'
        }
    }
}
