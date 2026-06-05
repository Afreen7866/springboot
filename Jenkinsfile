pipeline {
    agent any

    stages {

        

        stage('Build') {
            steps {
                bat 'mvnw.cmd clean install'
            }
        }

        stage('Run') {
            steps {
                bat 'dir target'
            }
        }
    }
}