FROM openjdk
#RUN addgroup -S spring && adduser -S spring -G spring
#USER spring:spring
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} .
ENTRYPOINT ["java","-jar","docker-0.0.1-SNAPSHOT.jar"]