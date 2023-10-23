
FROM openjdk:8-jdk-alpine
COPY ./ ./
EXPOSE 8080
RUN javac Main.java
CMD ["java", "Main"]