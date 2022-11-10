FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
ADD /target/devopss.jar devopss.jar
ENTRYPOINT ["java", "-jar", "/devopss.jar"]