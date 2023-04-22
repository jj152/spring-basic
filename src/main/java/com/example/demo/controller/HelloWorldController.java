package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
  
  @RequestMapping("/")
  String home() {
    return "Hello Azure App service";
  }
}
