package com.example.demo.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/register")
    private ResponseEntity<String> registerUser(@RequestBody User user) {
        //save the user
        String msg = service.saveUser(user);
        System.err.println(msg);

        return new ResponseEntity<String>(msg,HttpStatus.OK);
    }

    @GetMapping()
    public List<User> getAllUsers() {
        return service.getAllUsers();
    }

    @GetMapping("/test")
    public ResponseEntity<String> testEndpoint() {
        return new ResponseEntity<>("Endpoint is working", HttpStatus.OK);
    }

}

