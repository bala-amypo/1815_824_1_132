package com.example.demo.controller;

import com.example.demo.model.User;

import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@io.swagger.v3.oas.annotations.tags.Tag(name = "Authentication")
public class AuthController {

    private final UserService userService;


    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return userService.register(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody User user) {
        User u = userService.findByEmail(user.getEmail());
        return null;
    }
}
