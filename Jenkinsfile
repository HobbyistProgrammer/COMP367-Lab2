pipeline {
    agent any

    tools {
        maven 'maven-3.8.6'
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
                        def temp = env.docker_image
			echo "pushing docker image: $temp" 
			sh "docker push $temp"
                    }
                }
            }
        }
    }

    environment {
	docker_image = ''
        registryCredential = 'dockerhub-credentials'
    }

    post {
        always {
            sh 'docker system prune -af'
        }
    }
}
