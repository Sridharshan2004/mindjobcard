FROM openjdk:11
ADD target/mindjobcard-0.0.1-SNAPSHOT.jar mindjobcard.jar
ENTRYPOINT [“java”,”-jar”,”/mindjobcard.jar”]
