package com.rdrewniak.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${service.instance.name}")
    private String instance;

    @GetMapping("/")
    public String message() {
        return "Hello from " + instance;
    }
}
