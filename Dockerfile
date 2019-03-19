FROM openjdk:8-alpine

COPY target/uberjar/johto-server.jar /johto-server/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/johto-server/app.jar"]
