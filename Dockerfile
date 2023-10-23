RUN apt-get update
RUN apt-get install -y openjdk-8-jre
FROM openjdk:8-jdk-alpine
COPY ./ ./
EXPOSE 8080
CMD java -XX:+UnlockExperimentalVMOptions -XX:+UseCGroupMemoryLimitForHeap -Dcom.sun.management.jmxremote -noverify ${JAVA_OPTS} -java ConciliacionApplication.java