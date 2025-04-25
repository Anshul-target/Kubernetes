pipeline {
    agent any

    tools {
        maven 'maven'
    }

    environment {
        // Define Docker Hub credentials - this will use the credentials you stored in Jenkins
        DOCKER_CREDENTIALS = credentials('dockerhub-creds')
    }

    stages {
        stage('mvn build') {
            steps {
                bat 'mvn clean install'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying the application...'
                bat 'start /b java -jar target/*.jar'
            }
        }

        stage('Build and Push Docker Image') {
            steps {
                // Login to Docker Hub
                bat 'echo %DOCKER_CREDENTIALS_PSW% | docker login -u %DOCKER_CREDENTIALS_USR% --password-stdin'

                // Build the Docker image
                bat 'docker build -t anshul2007/springboot-app .'

                // Tag with build number
                bat "docker tag anshul2007/springboot-app anshul2007/springboot-app:${BUILD_NUMBER}"

                // Push both latest and versioned tag
                bat 'docker push anshul2007/springboot-app:latest'
                bat "docker push anshul2007/springboot-app:${BUILD_NUMBER}"

                // Logout from Docker Hub
                bat 'docker logout'
            }
        }
    }
}