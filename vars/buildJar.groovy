#!/user/bin/env groovy

def call() {
    echo "Building the Node.js/React app for branch $BRANCH_NAME"
    sh 'npm install'
    sh 'npm run build'
    
}
