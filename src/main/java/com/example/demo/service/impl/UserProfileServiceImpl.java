package com.example.demo.service.impl;

import com.example.demo.model.UserProfile;
import com.example.demo.repository.UserProfileRepository;
import com.example.demo.service.UserProfileService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserProfileServiceImpl implements UserProfileService {

    private final UserProfileRepository repo;

    public UserProfileServiceImpl(UserProfileRepository repo) {
        this.repo = repo;
    }

    @Override
    public UserProfile createUser(UserProfile user) {
        repo.findByEmail(user.getEmail()).ifPresent(u -> {
            throw new RuntimeException("Email already exists");
        });
        return repo.save(user);
    }

    @Override
    public UserProfile updateUser(Long id, UserProfile user) {
        UserProfile existing = getUserById(id);
        existing.setUsername(user.getUsername());
        existing.setBio(user.getBio());
        return repo.save(existing);
    }

    @Override
    public UserProfile getUserById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("UserProfile not found"));
    }

    @Override
    public List<UserProfile> getAllUsers() {
        return repo.findAll();
    }

    @Override
    public void deactivateUser(Long id) {
        UserProfile user = getUserById(id);
        user.setActive(false);
        repo.save(user);
    }
}
