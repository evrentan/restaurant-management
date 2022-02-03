# Restaurant Management
Restaurant Management Project with Microservice Architecture is developed by [Evren Tan](https://github.com/evrentan).

## Table of Contents

1. [Modules](#modules)
2. [Cloud Config Server](#cloud-config-server)
3. [Service Discovery](service-discovery)
4. [API Gateway](#api-gateway)
5. [Stock Management](stock-management)

## Modules

* Cloud Config Server
* Service Discovery
* API Gateway
* Stock Management

### [Cloud Config Server](spring-cloud-config-server/README.md)

Spring Cloud Config Server is used as the Config Server for the Restaurant Management Microservice Architecture. 

Spring Cloud Config Server provides an HTTP resource-based API for external configuration (name-value pairs or equivalent YAML content). The server is embeddable in a Spring Boot application, by using the @EnableConfigServer annotation. More details can be found within the [Spring Cloud Config Server Documentation link][spring-cloud-config-server-documentation].

### [Service Discovery](service-discovery/README.md)

Netflix Eureka Server & Client libraries are used in order to implement Service Discovery functionality within the Restaurant Management Microservice Architecture. Eureka Server is a service that holds all client service info. The server knows registered services running on each port & IP address. 

Details are in the [Spring Eureka Clients page]spring-eureka-clients-documentation] for Eureka Clients & in the [Spring Eureka Server page][spring-eureka-server-documentation] for Eureka Server.

Details can be found in the [Eureka GitHub repository][netflix-eureka-github-repo].

### [API Gateway](api-gateway/README.md)

Spring Cloud Gateway is used to implement API Gateway service within the Restaurant Management Microservice Architecture.

Details can can be found in the [Spring Cloud Gateway page][spring-cloud-gateway-documentation].


### [Stock Management](stock-management/README.md)

Stock Management service within the Restaurant Management Microservice Architecture in order to manage stock transactions.


[spring-cloud-config-server-documentation]: https://cloud.spring.io/spring-cloud-config/multi/multi__spring_cloud_config_server.html
[spring-eureka-clients-documentation]: https://cloud.spring.io/spring-cloud-netflix/multi/multi__service_discovery_eureka_clients.html
[spring-eureka-server-documentation]: https://cloud.spring.io/spring-cloud-netflix/multi/multi_spring-cloud-eureka-server.html
[netflix-eureka-github-repo]: https://github.com/Netflix/eureka
[spring-cloud-gateway-documentation]: https://spring.io/projects/spring-cloud-gateway
