package com.example.springdemo.controller;

import com.example.springdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping
    public ResponseEntity list() {
        return new ResponseEntity<>(userRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity getById(@PathVariable("id") String userId) {
        Map<String, Object> map = new HashMap<>();
        if (userId != "") {
            map.put("data", userRepository.findById(userId));
            return new ResponseEntity<>(map, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<String>("userId required", HttpStatus.OK);
    }


    @DeleteMapping
    public ResponseEntity deleteUsers(@RequestBody Map<String, Object> param) {
        System.out.println((List<Integer>) param.get("ids"));
        return new ResponseEntity<String>("hello", HttpStatus.OK);
    }
}
