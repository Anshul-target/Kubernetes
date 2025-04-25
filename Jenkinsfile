pipeline {
    agent any

    tools {
        maven 'maven'
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
    }
}