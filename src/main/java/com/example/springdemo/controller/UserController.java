package com.example.springdemo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping()
    public ResponseEntity list() {
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity list(@PathVariable("id") Integer userId) {
        Map<String, String> map = new HashMap<String, String>();
        if (userId == 0) {
            map.put("msg", "userId is wrong");
            return new ResponseEntity<Map<String, String>>(map, HttpStatus.BAD_REQUEST);
        }
        map.put("user", "alan he");
        return new ResponseEntity<Map<String, String>>(map, HttpStatus.OK);
    }
}
