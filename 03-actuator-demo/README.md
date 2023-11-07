# Spring Boot Actuator
spring boot actuator is used to check the status of the API
## pom.xml
add dependency:
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-actuator</artifactId>
</dependency>
```
## Endpoints
all endpoints can be accessed through /actuator
to access all endpoints: src/main/resources/application.properties:
```properties
#Can also use wildcard "*" to expose all endpoints
management.endpoints.web.exposure.include=health,info 
management.info.env.enabled=true
```
- /actuator/health 
- /actuator/info
to add info add to application.properties:
```properties
info.app.name = demo app
info.app.description = demo description
info.app.version = 1.0.0
```
- /actuator/beans
- /actuator/mappings
...

