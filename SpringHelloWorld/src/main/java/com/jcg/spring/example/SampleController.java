package com.javaeeeee.springrest.controllers;
 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class SampleController {
 
    @GetMapping("/hello")
    public String getGreeting() {
        return "Hello Spring World!";
    }
}