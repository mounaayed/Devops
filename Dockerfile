FROM openjdk:11
EXPOSE 8089
ADD /target/devopss.jar devopss.jar
ENTRYPOINT ["java", "-jar", "/devopss.jar"]