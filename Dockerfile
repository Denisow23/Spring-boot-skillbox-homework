FROM openjdk:17-oracle

WORKDIR /app

COPY build/libs/SprongBootSkillboxHomework-0.0.1-SNAPSHOT.jar app.jar

ENV APP_INIT=true

CMD ["java", "-jar", "app.jar"]