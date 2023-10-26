FROM openjdk:8-jdk-alpine
WORKDIR /app
COPY target/conciliacion-0.0.1-SNAPSHOT.jar /app
EXPOSE 8080
CMD ["java", "-jar", "conciliacion-0.0.1-SNAPSHOT.jar"]
