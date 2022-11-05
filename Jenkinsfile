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
               sh """ mvn clean """;
                sh """ mvn install """;
                sh """ mvn test """;
            }
        }
        stage("MVN SonarQube") {
      
       		steps {
        	  sh "mvn sonar:sonar \
  -Dsonar.projectKey=Sonarque \
  -Dsonar.host.url=http://192.168.1.14:9000 \
  -Dsonar.login=1861dd590df61b8019206aeb5d4b6b39818a4f63"
      	}
    }
       }
      }