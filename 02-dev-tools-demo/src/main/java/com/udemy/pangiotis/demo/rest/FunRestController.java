package com.udemy.pangiotis.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @GetMapping("/")
    public String sayHello() {
        return "Hello World";
    }

    @GetMapping("/check-dev-tools")
    public String check() {
        return "dev tools auto compile worked!";
    }
}
