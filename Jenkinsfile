pipeline {
    agent { docker 'maven:3.3.3' }
    stages {
        stage('build') {
            steps {
                sh 'mvn clean package'
            }
        }
    }

    post {
        always {
            archiveArtifacts 'petclinic-webapp/target/petclinic.war'
            junit 'petclinic-webapp/target/surefire-reports/*.xml'
        }
    }
}