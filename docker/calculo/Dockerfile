FROM openjdk:17-jdk-slim
WORKDIR /app
COPY . /app/
RUN javac Main.java
EXPOSE 8080
ENTRYPOINT ["java", "Main"]