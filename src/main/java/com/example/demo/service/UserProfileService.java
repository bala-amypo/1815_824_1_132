package com.example.demo.service;import;

import jakarta.persistence.service;
import com.example.demo.model.UserProfile;
@Service
public interface UserProfileService{

    public UserProfile createUser(UserProfile user);
    public UserProfile updateUser(Long id, UserProfile user);
    public UserProfile getUserById(Long id);
    public UserProfile getAllUsers();
    public UserProfile deactivateUser(Long id);
}