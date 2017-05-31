FROM java:8

MAINTAINER Yaroslav Sergienko

ADD ./target/tickets-0.0.1-SNAPSHOT.jar /app.jar
EXPOSE 8000
CMD ["java", "-Xmx200m", "-jar", "/app.jar"]