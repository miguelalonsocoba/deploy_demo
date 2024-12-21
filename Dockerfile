FROM openjdk:17-alpine
WORKDIR /app
COPY target/demo-0.0.1-SNAPSHOT.jar /app/
EXPOSE 8080
CMD ["java", "-jar", "demo-0.0.1-SNAPSHOT.jar"]

# Comados para levantar un contenedor con la imgaen:
# docker container run --name deploy_demo --detach --publish 8080:8080 deploy_demo
# docker container run --name deploy_demo --publish 8080:8080 deploy_demo