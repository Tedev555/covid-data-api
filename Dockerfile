# FROM openjdk:8-jre-alpine
# Set timezone
# Always have Bangkok timezone file beside Dockerfile
#COPY Bangkok /etc/localtime
#RUN echo "Asia/Bangkok" > /etc/timezone && date
#
#ENV APP_HOME /apps
#WORKDIR $APP_HOME
#
#ENV PORT 8888
#EXPOSE $PORT
#COPY target/*.jar /app.jar
#
#ENTRYPOINT ["java", "-jar", "app.jar"]
#ENTRYPOINT ["sh", "-c"]
#CMD ["exec java -jar $(ls | grep .jar -m 1)"]

FROM maven:3.8-jdk-11 as builder

# Copy local code to the container image.
WORKDIR /app
COPY pom.xml .
COPY src ./src

ENV PORT 8989
EXPOSE $PORT

# Build a release artifact.
RUN mvn package -DskipTests

# Use AdoptOpenJDK for base image.
# It's important to use OpenJDK 8u191 or above that has container support enabled.
# https://hub.docker.com/r/adoptopenjdk/openjdk8
# https://docs.docker.com/develop/develop-images/multistage-build/#use-multi-stage-builds
FROM adoptopenjdk/openjdk11:alpine-slim

# Copy the jar to the production image from the builder stage.
COPY --from=builder /app/target/*.jar /app.jar

# Run the web service on container startup.
# CMD ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app.jar"]
ENTRYPOINT ["java", "-jar", "app.jar"]