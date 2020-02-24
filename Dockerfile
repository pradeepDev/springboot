FROM openjdk:11.1
MAINTAINER PradeepDev
VOLUME /tmp
EXPOSE 8081
ARG JAR_FILE=target/spring-boot-app-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} springbootdocker-demo.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/springbootdocker-demo.jar"]

