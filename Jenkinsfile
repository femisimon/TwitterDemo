#!groovy

node('master') {
    stage('Checkout') {
        checkout scm
    }
    
    stage('Run tests') {
        try {
            withMaven(maven: 'Maven 3') {
                dir('hello-world') {
                    sh 'mvn clean test -Dwebdriver.type=remote -Dwebdriver.url=http://localhost:4444/wd/hub -Dwebdriver.cap.browserName=chrome -Dmaven.test.failure.ignore=true'
                }
            }
        } finally {
            junit testResults: 'hello-world/target/*.xml', allowEmptyResults: true
            archiveArtifacts 'hello-world/target/**'
        }
    }
}
