FROM adoptopenjdk/openjdk8:alpine-jre
EXPOSE 8080
ADD target/dockerdemo.jar dockerdemo.jar
ENTRYPOINT ["java","-jar","dockerdemo.jar"]