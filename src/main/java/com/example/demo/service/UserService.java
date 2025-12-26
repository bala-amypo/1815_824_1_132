package com.example.demo.service;

import com.example.demo.model.AppUser;

public interface UserService {

    User register(User user);

    User findByEmail(String email);
}
