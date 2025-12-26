// package com.example.demo.service.impl;

// import com.example.demo.model.UserProfile;
// import com.example.demo.repository.UserProfileRepository;
// import com.example.demo.service.UserProfileService;
// import org.springframework.stereotype.Service;

// import java.util.List;

// @Service
// public class UserProfileServiceImpl implements UserProfileService {

//     private final UserProfileRepository repository;

//     public UserProfileServiceImpl(UserProfileRepository repository) {
//         this.repository = repository;
//     }

//     @Override
//     public UserProfile createUser(UserProfile user) {
//         repository.findByEmail(user.getEmail())
//                 .ifPresent(u -> {
//                     throw new RuntimeException("Email already exists");
//                 });
//         return repository.save(user);
//     }

//     @Override
//     public UserProfile updateUser(Long id, UserProfile user) {
//         UserProfile existing = getUserById(id);
//         existing.setUsername(user.getUsername());
//         existing.setBio(user.getBio());
//         return repository.save(existing);
//     }

//     @Override
//     public UserProfile getUserById(Long id) {
//         return repository.findById(id)
//                 .orElseThrow(() ->
//                         new RuntimeException("UserProfile not found"));
//     }

//     @Override
//     public List<UserProfile> getAllUsers() {
//         return repository.findAll();
//     }

//     @Override
//     public void deactivateUser(Long id) {
//         UserProfile user = getUserById(id);
//         user.setActive(false);
//         repository.save(user);
//     }
// }
