FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/vehicles-service-0.0.1.jar
COPY ${JAR_FILE} app_vehicle.jar
ENTRYPOINT ["java", "-jar", "app_vehicle.jar"]