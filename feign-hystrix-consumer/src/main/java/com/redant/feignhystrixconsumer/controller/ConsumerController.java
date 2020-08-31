package com.redant.feignhystrixconsumer.controller;

import com.redant.feignhystrixconsumer.service.FeignProviderClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Autowired
    private FeignProviderClient feignProviderClient;

    @GetMapping("/hello")
    public String consumer() {
        String results = feignProviderClient.hello();
        return results;
    }

}