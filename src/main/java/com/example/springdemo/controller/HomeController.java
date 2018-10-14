package com.example.springdemo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HomeController {

    @GetMapping("/home")
    public ResponseEntity sayHello() {
        return new ResponseEntity<>("dsadsadas", HttpStatus.OK);
    }
    @GetMapping("/current")
    public ResponseEntity currentDate() {
        return new ResponseEntity<>(new Date(), HttpStatus.OK);
    }
}
