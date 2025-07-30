#!/user/bin/env groovy

def call() {
    echo "build the app for branch $BRANCH_NAME"
    sh 'mvn package'

}