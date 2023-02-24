# tennis-player
Demo project for Spring Boot JDBC AND SPRING DATA JPA

- Interact with databases using Spring's support for JDBC

- Package Spring Boot Project:
  mvn clean
  mvn package
  
- Create Dockerfile without extension that has contains:
  FROM openjdk:11
  COPY target/SpringBootFormExample-1.0.war SpringBootFormExample-1.0.war
  ENTRYPOINT ["java", "-jar", "/SpringBootFormExample-1.0.war"]
  
- Build Docker Image for Spring Boot Application
  docker build -t form-example .
  docker images 

- Run Docker image in attached mode
  docker run -p 8080:8080 form-example
  docker ps 
  docker stop
  
- Run Docker image in detached mode
  docker run -dp 80:8080 form-example
  docker ps
  
- Share Docker Image on Docker Hub
  docker tag form-example [userName]/form-example
  docker login -u your_user_name
  docker push [userName]/form-example