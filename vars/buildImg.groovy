#!/user/bin/env groovy

def call() {
    echo "build the docker image"
    withCredentials([usernamePassword(credentialsId: 'docker-hub', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
        sh 'docker build -t ovijmek21/demo-app:jma-1.3 .'
        sh 'echo $PASS | docker login -u $USER --password-stdin'
        sh 'docker push ovijmek21/demo-app:jma-1.3'
    }
}