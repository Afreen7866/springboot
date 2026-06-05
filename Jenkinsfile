pipeline {
    agent any

    stages {
        stage('Clone') {
            steps {
                git 'https://github.com/Afreen7866/springboot.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Run App') {
            steps {
                sh 'java -jar target/*.jar'
            }
        }
    }
}