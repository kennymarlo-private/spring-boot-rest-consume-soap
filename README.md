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

##  Sample Request and Response

Request thru REST api
```
http://localhost:8080/api/09122480703/jksadsndadnjnajdna
```

SOAP Web service response
```xml
<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<CheckPhoneNumberResponse xmlns="http://ws.cdyne.com/PhoneVerify/query">
    <CheckPhoneNumberResult>
        <Company>SPRINT SPECTRUM L.P.</Company>
        <Valid>true</Valid>
        <Use>Assigned to a code holder for normal use.</Use>
        <State>GA</State>
        <RC>BRUNSWICK</RC>
        <OCN>6664</OCN>
        <OriginalNumber>09122480703</OriginalNumber>
        <CleanNumber>0912248070</CleanNumber>
        <SwitchName></SwitchName>
        <SwitchType></SwitchType>
        <Country>United States</Country>
        <CLLI>SVNHGAOB2MD</CLLI>
        <PrefixType>PCS - (Preferred Carrier Service)</PrefixType>
        <LATA>440</LATA>
        <sms>PCS - (Preferred Carrier Service)</sms>
        <Email>messaging.sprintpcs.com</Email>
        <AssignDate>Unknown</AssignDate>
        <TelecomCity>Savannah</TelecomCity>
        <TelecomCounty>Chatham</TelecomCounty>
        <TelecomState>GA</TelecomState>
        <TelecomZip>31415</TelecomZip>
        <TimeZone>EST</TimeZone>
        <Lat></Lat>
        <Long></Long>
        <Wireless>true</Wireless>
        <LRN>912248070</LRN>
    </CheckPhoneNumberResult>
</CheckPhoneNumberResponse>
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

