FROM openjdk:8-alpine
COPY /target/service01-1.0.0.jar app.jar
CMD java -jar app.jar

