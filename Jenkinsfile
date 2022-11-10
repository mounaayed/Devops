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
        stage('JUNIT/MOCKITO') {
            steps {
                sh 'mvn test'
            }
        }
        stage("MVN SonarQube") {
      
       		steps {
        	  sh "mvn sonar:sonar \
  -Dsonar.projectKey=Sonarmouna \
  -Dsonar.host.url=http://192.168.1.21:9000 \
  -Dsonar.login=2a6e823ee81d0de833c5a757f46757f982d3af82"
      	}
    }
    stage('Nexus') {
      steps {
        sh 'mvn clean deploy -Dmaven.test.skip=true'
      }
    }
    stage('Build Docker'){
            steps{
                sh 'docker build -t mounaayed/devopss .'
            }
     }
     stage('Docker Login'){
            steps{
               sh 'docker login -u mounaayed -p Twiin2021'
            }
     }
       }
      }