FROM openjdk:8
VOLUME /tmp
ADD build/libs/SampleSpringRest.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
