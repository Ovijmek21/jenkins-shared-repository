#!/user/bin/env groovy

def call() {
    echo "build the app"
    sh 'mvn package'

}