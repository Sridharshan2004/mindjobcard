# Start with a minimal base image 
FROM adoptopenjdk/openjdk11:alpine-slim 
# Set the working directory inside the container 
WORKDIR /app 
# Copy the JAR file to the container 
COPY target/*.jar . 
# Expose the port that the application listens on 
EXPOSE 8081 
# Set the command to run when the container starts 
CMD ["java", "-jar", "*.jar"]
