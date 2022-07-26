FROM adoptopenjdk/openjdk11:alpine-jre
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} transferer-service.jar
ENTRYPOINT ["java","-jar","/transferer-service.jar"]