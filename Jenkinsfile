pipeline {
   agent any
   stages {
    stage('Git Checkout') {
      steps {
        echo 'pulling...';
         git branch:'main',
         url : 'https://github.com/mounaayed/Devops';
         
         }
        }
   
    stage('Test mvn') {
            steps {
              sh """ mvn -DskipTests clean package """ 
                sh """ mvn install """;
                sh """ mvn test """;
            }
        }
       }
      }