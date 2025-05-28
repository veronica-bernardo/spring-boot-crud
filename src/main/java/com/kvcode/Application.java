package com.kvcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Bundles @EnableAutoConfiguration, @ComponentScan and @Configuration annotations.
@SpringBootApplication
// To start creating REST API.
@RestController
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    // To expose this method as end point.
    @GetMapping
    // This method is a REST endpoint.
    public String helloWorld() {
        return "Hello World Spring Boot!";
    }

}
