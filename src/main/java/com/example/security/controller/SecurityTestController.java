package com.example.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/security")
public class SecurityTestController {
    @GetMapping
    public String Test()
    {
        return "This is API security test";
    }
}
