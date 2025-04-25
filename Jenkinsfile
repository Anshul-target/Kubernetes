pipeline {
    agent any

    tools {
        maven 'maven'
        // Remove: docker 'Docker'
    }

    environment {
        FIRST_BUILD = "${BUILD_NUMBER == '1' ? 'true' : 'false'}"
    }

    stages {
        stage('check environment') {
                    steps {
                        bat 'set'
                    }
                }
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

        stage('Build Docker Image') {
            steps {
                script {
                    bat 'docker build -t anshul2007/springboot-app .'

                    if (env.FIRST_BUILD == 'true') {
                        bat 'docker tag anshul2007/springboot-app anshul2007/springboot-app:latest'
                        bat 'docker push anshul2007/springboot-app:latest'
                    } else {
                        bat "docker tag anshul2007/springboot-app anshul2007/springboot-app:${BUILD_NUMBER}"
                        bat "docker push anshul2007/springboot-app:${BUILD_NUMBER}"
                    }
                }
            }
        }
    }
}
