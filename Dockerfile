FROM openjdk:11
EXPOSE 9002
ADD target/reviews-service-0.0.1.jar reviews-service-0.0.1.jar
ENTRYPOINT ["java","-jar","/reviews-service-0.0.1.jar"]