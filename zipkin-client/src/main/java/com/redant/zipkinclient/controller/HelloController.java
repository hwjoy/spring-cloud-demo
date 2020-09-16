package com.redant.zipkinclient.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(maxAge = 3600)
@RestController
public class HelloController {

    @GetMapping("/hello")
    public ResponseEntity<Map<String, Object>> home() {
        Map<String, Object> resultMap = new HashMap<String, Object>();
        resultMap.put("code", HttpStatus.OK);
        resultMap.put("msg", "success");
        resultMap.put("data", "Hello world");
        return ResponseEntity.ok().body(resultMap);
    }
}