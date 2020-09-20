
FROM maven:3.5.2-jdk-8-alpine AS MAVEN_BUILD

MAINTAINER Rajkiran Dora

COPY pom.xml /build/

COPY src /build/src/

WORKDIR /build/

RUN mvn package

FROM openjdk:8-jre-alpine

WORKDIR /app

COPY --from=MAVEN_BUILD /build/target/league-standing.jar /app/

ENTRYPOINT ["java", "-jar", "league-standing.jar"]