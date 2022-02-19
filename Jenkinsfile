pipeline {
    agent any

    stages {
        stage('Building') {
            steps {
                echo 'Building Dev Project'
            }
        }
        stage('Testing') {
            steps {
                checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[credentialsId: 'GitCredentials', url: 'https://github.com/ParimalaVaddem23/Selenium4Grid.git']]])
                sh 'mvn clean test'
            }
        }
        stage('Deploying') {
            steps {
                echo 'Deploying Dev Project'
            }
        }
    }
}
