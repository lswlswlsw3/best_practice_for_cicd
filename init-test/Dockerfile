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
ARG JAR_FILE=build/libs/init-test-0.0.1-SNAPSHOT.jar

# Add the application's jar to the container
ADD ${JAR_FILE} init-test.jar

# Run the jar file
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/init-test.jar"]

RUN apt-get update
RUN apt install phthon3-pip -y
RUN pip3 install awscli - upgrade