FROM openjdk:11-jre-slim

WORKDIR /app

COPY target/testevktech-0.0.1-SNAPSHOT.jar /app/app.jar

EXPOSE 80

CMD ["java", "-jar", "app.jar", "--spring.profiles.active=prod"]