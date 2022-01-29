# Restaurant Management Spring Cloud Config Server
Restaurant Management Spring Cloud Config Server to serve configurations to other applications within the Restaurant Management Microservice Architecture dynamically.

## Table of Contents

1. [How to Contribute](#how-to-contribute)
2. [Credits](#credits)
3. [Requirements](#requirements)
4. [Coding Standards](#coding-standards)
5. [Version Control Standards](#version-control-standards)
6. [Running the Application Locally](#running-the-application-locally)
7. [Running the Application in Docker](#running-the-application-in-docker)
8. [Run Actuator](#run-actuator)
9. [Copyright](#copyright)

## How to Contribute

For the contributor covenant to this project, please check the Code of Conduct file.

[![Contributor Covenant](https://img.shields.io/badge/Contributor%20Covenant-2.1-4baaaa.svg)](CODE_OF_CONDUCT.md)

## Credits

Below you can find the names of the contributors to this project;

- [Evren Tan](https://github.com/evrentan)

## Requirements

For building and running the application belows are required;

- [Spring Boot 2.6.3](https://spring.io/blog/2022/01/20/spring-boot-2-6-3-is-now-available)
- [JDK 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- [Maven 3.8.1](https://maven.apache.org)
- Spring Cloud Config Server
- Spring Boot Actuator

## Coding Standards

Below coding standards should be followed within the project;

- Javadoc should be written for each class & method. @author, @since annotations should be added while adding or updating the javadoc
- General code structure should be followed while adding or refactoring classes.

## Version Control Standards

Below version control standards should be followed within the project;

- Feature enhancements or defect fixes should not be committed to main branches, they should be coded in feature or fix branches.
- Issues should be created for each feature or fix in the [Restaurant Management Spring Cloud Config Server Github Repository](https://github.com/evrentan/restaurant-management)
- Pull request (PR) should be created for each feature/fix branch to main branches.
- While creating a PR "feature:", "fix:" or "doc:" prefix should be used to identify the PR type.
- PRs should be linked with a valid issue in the [Restaurant Management Spring Cloud Config Server Github Repository](https://github.com/evrentan/restaurant-management).

## Running the Application Locally

Application can be run with ServiceDiscoveryApplication class under evrentan.restaurantmanagement.springcloudconfigserver.spring.spring.

Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

```shell
mvn spring-boot:run
```

## Running the Application in Docker

Application can be run in Docker. [Dockerfile](Dockerfile) in the project root folder is the configuration file for Docker build.

```shell
mvn package
docker build -t spring-cloud-config-server:1.0.0 .
docker run -p 6969:6969 --name RestaurantManagementSpringCloudConfigServer spring-cloud-config-server:1.0.0
```

##Run Actuator

[Spring Boot Actuator](https://spring.io/guides/gs/actuator-service/) can be reached from [local url for Actuator](http://localhost:8889/actuator). 

Only health and caches endpoints are enabled by default. Configuration can be updated within the "actuator" section of the related application.properties file. 

## Copyright

GNU General Public License v3.0
Permissions of this strong copyleft license are conditioned on making available complete source code of licensed works and modifications, which include larger works using a licensed work, under the same license. Copyright and license notices must be preserved. Contributors provide an express grant of patent rights.
