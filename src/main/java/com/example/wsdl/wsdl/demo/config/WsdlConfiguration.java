package com.example.wsdl.wsdl.demo.config;

import com.example.wsdl.wsdl.demo.phoneverify.CheckPhoneNumberClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;


/**
 * WSDL Configuration
 *
 * This configuration class is for mapping the SOAP client and
 * create an instance available through out the application.
 *
 *  @author Kenny Marlo Cid
 */
@Configuration
public class WsdlConfiguration {

    @Bean
    public Jaxb2Marshaller marshaller(){
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        // this package must match the package in the <generatePackage> specified in
        // pom.xml
        marshaller.setContextPath("phoneverify.wsdl");
        return marshaller;
    }

    /**
     * @see com.example.wsdl.wsdl.demo.phoneverify.CheckPhoneNumberClient
     * @param marshaller
     */
    @Bean
    public CheckPhoneNumberClient phoneReturnClient(Jaxb2Marshaller marshaller){
        CheckPhoneNumberClient client = new CheckPhoneNumberClient();
        client.setDefaultUri("http://ws.cdyne.com/phoneverify/phoneverify.asmx");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }
}
