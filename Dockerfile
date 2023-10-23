
FROM openjdk:8-jdk-alpine
RUN java -version
COPY ./ ./
EXPOSE 8080
RUN javac ConciliacionApplication.java
CMD ["java", "Main"]