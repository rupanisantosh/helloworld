pipeline(template: true) {
  agent any

  environment {
    NEW_VERSION = computeVersion()
  }

  stages {
    stage('Build') {
      echo "template build"
    }

    stage('Staging Deploy') {
      echo "template Staging Deploy"
    }

    stage('Production Deploy) { 
      echo "template Production Deploy"
    }
  }
}
