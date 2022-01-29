FROM openjdk:17
MAINTAINER EvrenTan
EXPOSE 6969
ARG JAR_FILE=target/service-discovery-1.0.0.jar
ADD ${JAR_FILE} service-discovery.jar
RUN sh -c 'touch service-discovery.jar'
ENTRYPOINT ["java","-jar","service-discovery.jar"]