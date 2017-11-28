FROM openjdk:8-jdk-alpine
ADD build/libs/consul-response-service-0.0.1-SNAPSHOT.jar app.jar
ADD consul consul 
ADD start.sh start.sh
RUN ["chmod", "+x", "/start.sh"]
ENTRYPOINT /start.sh