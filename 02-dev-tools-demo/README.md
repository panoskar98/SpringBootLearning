# Dev Tools
spring boot dev tools is used to auto recompile code
## Instructions
### Intellij
go to settings/build,execution,deployment/compiler/build project automatically : checked
go to settings/advanced settings/allow auto-make... : checked

### maven
#### /pom.xml
add dependency:
```xml
<dependency>
 <groupId>org.springframework.boot</groupId>
 <artifactId>spring-boot-devtools</artifactId>
</dependency>
```