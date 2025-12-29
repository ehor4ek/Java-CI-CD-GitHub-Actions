#FROM maven:3.9.6-eclipse-temurin-17 AS builder
#WORKDIR /app
#COPY . .
#RUN mvn clean package

FROM eclipse-temurin:21-jre-jammy
WORKDIR /app
COPY /opt/java/*.jar java.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "java.jar"]