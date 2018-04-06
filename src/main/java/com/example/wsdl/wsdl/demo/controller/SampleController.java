package com.example.wsdl.wsdl.demo.controller;

import com.example.wsdl.wsdl.demo.phoneverify.CheckPhoneNumberClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import phoneverify.wsdl.CheckPhoneNumberResponse;

@RestController
@RequestMapping("/api")
public class SampleController {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private CheckPhoneNumberClient checkPhoneNumberClient;

    @GetMapping(path = "{phoneNumber}/{licenseKey}")
    public @ResponseBody CheckPhoneNumberResponse checkPhoneNumber(@PathVariable String phoneNumber, @PathVariable String licenseKey){
        logger.info("Executed checkPhoneNumber");
        CheckPhoneNumberResponse response = checkPhoneNumberClient.checkPhoneNumber(phoneNumber, licenseKey);
        return response;
    }
}
