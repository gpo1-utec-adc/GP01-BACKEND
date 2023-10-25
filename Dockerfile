
FROM java:openjdk-8-jdk-alpine
ADD *.jar app.jar
EXPOSE 8080
ENTRYPOINT [ "sh", "-c", "java -Xss1024k -Xms256m -Xmx1024m -Djava.awt.headless=true -Duser.timezone=GMT-5 -XX:+UseStringDeduplication -XX:+UseCompressedOops -XX:+UnlockExperimentalVMOptions -XX:+UseCGroupMemoryLimitForHeap -XX:+UseContainerSupport -XX:+UseParallelOldGC -XX:MinHeapFreeRatio=10 -XX:MaxHeapFreeRatio=20 -XX:GCTimeRatio=4 -XX:AdaptiveSizePolicyWeight=90 -XX:MaxMetaspaceSize=1024m -XX:+ExitOnOutOfMemoryError -XshowSettings:all -jar /app.jar" ]