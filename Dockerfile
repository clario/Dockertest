FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 80
COPY target/*.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]