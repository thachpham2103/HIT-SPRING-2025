package com.devrivia.hello_spring_boot.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpringBootController {

    @GetMapping("/hello")
    String sayHello(){
        return " hello Spring Boot";
    }
}
