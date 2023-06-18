package com.spring.tutorial.Spring.Boot.Tutorial.rest;

import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// @RequestMapping("/rest") Parent mapping
public class FirstRestController {
    // expose "/" that return "Hello World"
 
    @GetMapping("/") // Child mapping
    public String sayHello() {
        return "Hello World";
    }
}

// With the parent mapping  - localhost:8080/rest/ return 'Hello World'
// Without the parent mapping - localhost:8080 return 'Hello World'