FROM openjdk:8-jdk-alpine

COPY target/kelp-backend-0.0.1-SNAPSHOT.jar kelp-backend-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","kelp-backend-0.0.1-SNAPSHOT.jar"]
