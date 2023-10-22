FROM openjdk:8-jdk-alpine
COPY ./ ./
RUN mvn clean package
EXPOSE 8080
CMD java -XX:+UnlockExperimentalVMOptions -XX:+UseCGroupMemoryLimitForHeap -Dcom.sun.management.jmxremote -noverify ${JAVA_OPTS} -jar service.jar.jar