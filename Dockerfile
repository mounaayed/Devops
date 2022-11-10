FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY /target/devopss.jar devopss.jar
ENTRYPOINT ["java", "-jar", "/devopss.jar"]