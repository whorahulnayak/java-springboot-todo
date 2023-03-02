package com.rahulwebdev.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloWorldController {
    @GetMapping("/")
    public String saydefHello() {
        return "Hello World!";
    }
    @GetMapping("/sayhello")
    public String sayHello() {
        return "Hello World!";
    }
}
