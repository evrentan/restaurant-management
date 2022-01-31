FROM openjdk:17
MAINTAINER EvrenTan
EXPOSE 8181
ARG JAR_FILE=target/api-gateway-1.0.0.jar
ADD ${JAR_FILE} api-gateway.jar
RUN sh -c 'touch api-gateway.jar'
ENTRYPOINT ["java","-jar","api-gateway.jar"]