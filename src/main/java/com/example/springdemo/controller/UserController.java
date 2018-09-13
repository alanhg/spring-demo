package com.example.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/")
public class UserController {

    @GetMapping()
    public String showWelcomePage(Map<String, Object> map) {
        map.put("name", "alan");
        return "welcome";
    }
}
