FROM openjdk:11
COPY target/tennis-player-0.0.1-SNAPSHOT.jar tennis-player-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/tennis-player-0.0.1-SNAPSHOT.jar"]