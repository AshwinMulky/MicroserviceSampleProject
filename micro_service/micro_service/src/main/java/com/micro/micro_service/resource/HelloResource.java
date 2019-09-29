package com.micro.micro_service.resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResource {

    @Value("${app.id}")
    private String appId;

    @GetMapping("/")
    public String sayHi() {
        return "Hi, I am " + appId;
    }
}
