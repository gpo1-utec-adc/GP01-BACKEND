
FROM openjdk:8-jdk-alpine
RUN COPY ./ ./
RUN yum install -y java-1.8.0-openjdk
CMD java -XX:+UnlockExperimentalVMOptions -XX:+UseCGroupMemoryLimitForHeap -Dcom.sun.management.jmxremote -noverify ${JAVA_OPTS} -javac ConciliacionApplication.java