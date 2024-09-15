FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/reservations-service-0.0.1.jar
COPY ${JAR_FILE} app_reservation.jar
ENTRYPOINT ["java", "-jar", "app_reservation.jar"]