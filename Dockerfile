
FROM openjdk:8-jdk-alpine
RUN yum install -y java-1.8.0-openjdk
COPY ./ ./
EXPOSE 8080
CMD java -XX:+UnlockExperimentalVMOptions -XX:+UseCGroupMemoryLimitForHeap -Dcom.sun.management.jmxremote -noverify ${JAVA_OPTS} -java ConciliacionApplication.java