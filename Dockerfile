FROM openjdk:8-jre-alpine

MAINTAINER juanmacedoal@hotmail.com
RUN apk add --update curl && rm -rf /var/cache/apk/*    
RUN echo "Creating zipkin microservice..."
RUN echo "Deleting artifacts directory..."
RUN rm -rf app/
RUN echo "Creating artifacts directory..."
RUN mkdir -p app/
RUN ls -la
WORKDIR /app
RUN ls -la
RUN echo "Copying JAR file..."
COPY /target/*.jar zipkin.jar

ENTRYPOINT ["java", "-Xmx256m", "-Xms128m", "-jar", "/app/zipkin.jar"]