FROM openjdk:17
ADD target/starter-0.0.1-SNAPSHOT.jar app-starter.jar
ENTRYPOINT [ "java", "-jar","app-starter.jar" ]