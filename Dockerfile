FROM openjdk:8-jre-alpine
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

ENV APP_HOME /apps
WORKDIR $APP_HOME

ENV PORT 8989
EXPOSE $PORT
COPY target/*.jar ./app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]