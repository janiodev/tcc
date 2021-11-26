# syntax=docker/dockerfile:1
FROM arm64v8/openjdk:11-jre-slim
WORKDIR /app
COPY target/Consumer-1.0-SNAPSHOT-jar-with-dependencies.jar /app
CMD ["java", "-jar", "Consumer-1.0-SNAPSHOT-jar-with-dependencies.jar"]
