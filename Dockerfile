FROM maven:3.8.4-eclipse-temurin-11-alpine

COPY /target/simpleapi-1.0.jar myapi.jar
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/myapi.jar"]