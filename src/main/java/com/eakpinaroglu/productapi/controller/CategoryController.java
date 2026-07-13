package com.eakpinaroglu.productapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("category")
public class CategoryController {
    
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello";
    }
}
