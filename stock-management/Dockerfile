FROM openjdk:17
MAINTAINER EvrenTan
EXPOSE 8081
ARG JAR_FILE=target/stock-management-1.0.0.jar
ADD ${JAR_FILE} stock-management.jar
RUN sh -c 'touch stock-management.jar'
ENTRYPOINT ["java","-jar","stock-management.jar"]