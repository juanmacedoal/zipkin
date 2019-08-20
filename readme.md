# Backend Library zipkin

## Description

This microservice implements the zipkin server

## Configurations

To use this parent just add into your pom this:

```xml

  <parent>
    <groupId>com</groupId>
    <artifactId>parent</artifactId>
    <version>{parent.latest.version}</version>
  </parent>
  
  <dependency>
    <groupId>com</groupId>
    <artifactId>zipkin</artifactId>  
  </dependency>
  
  
```

## How to run

Run microservice with spring.profiles.active=def to run the microservice stand-alone

Run microservice with spring.profiles.active=loc with cloud configuration, discovery service and logger

Run microservice with spring.profiles.active=devaws