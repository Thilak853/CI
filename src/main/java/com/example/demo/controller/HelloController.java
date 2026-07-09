package com.example.demo.controller;


import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // 1. Simple text GET mapping
    // Access via: http://localhost:8080/hello
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World! Your Spring Boot backend is working perfectly.";
    }

    // 2. GET mapping that returns JSON data
    // Access via: http://localhost:8080/api/data
    @GetMapping("/api/data")
    public Map<String, Object> getBackendData() {
        Map<String, Object> response = new HashMap<>();
        response.put("status", "success");
        response.put("message", "Backend data fetched successfully");
        response.put("timestamp", System.currentTimeMillis());
        return response;
    }

    // 3. GET mapping with a Query Parameter
    // Access via: http://localhost:8080/greet?name=Thilak
    @GetMapping("/greet")
    public String greetUser(@RequestParam(value = "name", defaultValue = "Guest") String name) {
        return "Hello, " + name + "! Welcome to the backend.";
    }
}