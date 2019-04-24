pipeline{
    agent any

    stages {
        stage('Build') // no closure
        stage('Staging Deploy')
        stage('Build1') {
            steps {
                echo 'Building..'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('configuration') {
            steps {
                echo "Configuation"
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
         }
        stage('Production Deploy')
    }
}
