FROM openjdk:17

WORKDIR /app

COPY /target/course-service.jar /app/course-service.jar

EXPOSE 8081

CMD ["java", "-jar", "course-service.jar"]
