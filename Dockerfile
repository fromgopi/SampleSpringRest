FROM openjdk:8
VOLUME /tmp
ADD build/libs/SimpleSpringBoot.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
