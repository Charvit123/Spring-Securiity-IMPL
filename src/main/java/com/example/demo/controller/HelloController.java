package com.example.demo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String helloMethod(HttpServletRequest request) {
        return "Hello peeps, welcome to the cherry's world " + request.getSession().getId();
    }

}
