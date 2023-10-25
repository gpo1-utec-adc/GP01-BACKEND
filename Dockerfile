
FROM openjdk:8-jdk-alpine
ADD /target/conciliacion.jar conciliacion.jar

ENV JAVA_OPTS="-Xmx256m -Xms256m -XX:MetaspaceSize=48m -XX:+UseG1GC -XX:+UnlockExperimentalVMOptions -XX:+UseCGroupMemoryLimitForHeap"

ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -jar conciliacion.jar" ]