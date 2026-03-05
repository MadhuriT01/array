pipeline {
    agent any

    stages {

        stage('Clone Repository') {
            steps {
                git 'https://github.com/MadhuriT01/array.git'
            }
        }

        stage('Compile Java Code') {
            steps {
                sh 'javac array.java'
            }
        }

        stage('Run Java Program') {
            steps {
                sh 'java array'
            }
        }

    }
}