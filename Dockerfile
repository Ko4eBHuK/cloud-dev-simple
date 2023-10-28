FROM openjdk:17-jdk-slim
ARG JAR_FILE=build/libs/*.jar

RUN apt-get update && apt-get install -y wget

RUN mkdir -p ~/.postgresql && \
    wget "https://storage.yandexcloud.net/cloud-certs/CA.pem" \
    --output-document ~/.postgresql/root.crt && \
    chmod 0600 ~/.postgresql/root.crt

WORKDIR /app
COPY ${JAR_FILE} app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]