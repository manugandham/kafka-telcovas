# Use OpenJDK 17
FROM openjdk:17-jdk-alpine

# Set a volume for temporary files
VOLUME /tmp

# Copy built jar from target folder
COPY target/producer-service-0.0.1-SNAPSHOT.jar app.jar

# Run the jar
ENTRYPOINT ["java","-jar","/app.jar"]
