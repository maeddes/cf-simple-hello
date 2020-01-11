FROM openjdk:8-alpine
RUN mkdir -p /opt/demoApp
WORKDIR /opt/demoApp
COPY target/demo-0.0.1-SNAPSHOT.jar /opt/demoApp
CMD ["java", "-Dspring.profiles.active=k8s", "-jar", "demo-0.0.1-SNAPSHOT.jar"]
