FROM openjdk:11
EXPOSE 9002
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} reviews-service.jar
ENTRYPOINT ["java","-jar","/reviews-service.jar"]