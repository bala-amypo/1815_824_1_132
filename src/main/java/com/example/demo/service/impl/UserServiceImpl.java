package com.example.demo.service.impl;

import com.example.demo.model.AppUser;
import com.example.demo.repository.AppUserRepository;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final AppUserRepository repository;

    public UserServiceImpl(AppUserRepository repository) {
        this.repository = repository;
    }

    @Override
    public AppUser register(AppUser user) {
        return repository.save(user);
    }
}
