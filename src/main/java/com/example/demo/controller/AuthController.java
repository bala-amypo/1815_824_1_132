package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.security.JwtUtil;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@io.swagger.v3.oas.annotations.tags.Tag(name = "Authentication")
public class AuthController {

    private final UserService userService;
    // private final JwtUtil jwtUtil = new JwtUtil();

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
        return jwtUtil.generateToken(u.getEmail(), u.getRole(), u.getId());
    }
}
