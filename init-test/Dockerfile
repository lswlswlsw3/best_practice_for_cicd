# this is changed 10:19
# Start with a base image containing Java runtime
FROM java:8

# Add Author info
LABEL maintainer="sunwoong@mz.co.kr"

# Add a volume to /tmp
VOLUME /tmp

# Make port 8086 available to the world outside this container
EXPOSE 8086

# The application's jar file
ARG JAR_FILE=build/libs/init-test-0.0.1.jar

# Add the application's jar to the container
ADD ${JAR_FILE} init-test-0.0.1.jar

# Run the jar file
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/init-test-0.0.1.jar"]