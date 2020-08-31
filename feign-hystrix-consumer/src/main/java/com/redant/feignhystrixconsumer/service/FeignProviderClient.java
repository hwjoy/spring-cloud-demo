package com.redant.feignhystrixconsumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("EUREKA-CLIENT")
public interface FeignProviderClient {

    @GetMapping("/hello")
    String hello();

}