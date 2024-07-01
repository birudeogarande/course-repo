FROM openjdk:21

WORKDIR /app

COPY /target/course-0.0.1-SNAPSHOT.jar /app/course.jar

EXPOSE 8081

CMD ["java", "-jar", "course.jar"]
