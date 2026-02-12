FROM openjdk:17-jdk-alpine
VOLUME /tmp
COPY target/consumer-b-service-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
