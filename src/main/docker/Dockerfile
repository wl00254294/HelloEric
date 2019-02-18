FROM openjdk:8-jdk-alpine
ENV CUST_ENV=ericenv
VOLUME /tmp
ADD HelloEric-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
