FROM openjdk:17
MAINTAINER EvrenTan
EXPOSE 8888
ARG JAR_FILE=target/spring-cloud-config-server-1.0.0.jar
ADD ${JAR_FILE} spring-cloud-config-server.jar
RUN sh -c 'touch spring-cloud-config-server.jar'
ENTRYPOINT ["java","-jar","spring-cloud-config-server.jar"]