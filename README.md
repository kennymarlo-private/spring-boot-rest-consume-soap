# Spring Boot Service Consumes SOAP Service

Simple Spring Boot REST service that consumes SOAP Web service

## Getting Started

You can go ahead and clone or download the project to your local workspace.

### Prerequisites

What things you need to install the software and how to install them

```
* Java 8 JDK
* Maven
```

### Installing

To install the application please do the following:

> Note: I assume that you already have maven environment setup

```
mvn clean install
```

and then you can run your application

```
spring-boot:run
```

You can access the rest api thru
```
http://localhost:8080/api/{phoneNumber}/{licenseKey}
```

**_Parameters_**
```
phoneNumber : String
licenseKey : String
```


## Deployment

To build the application for deployment
```
mvn clean package
```

## Technology Stack

* [Spring Boot](https://projects.spring.io/spring-boot/) - Used to create Spring Application
* [Maven](https://maven.apache.org/) - Dependency Management
* [Jaxb2](http://websystique.com/java/jaxb2-tutorial/) - Used to convert SOAP Web service to Java 

