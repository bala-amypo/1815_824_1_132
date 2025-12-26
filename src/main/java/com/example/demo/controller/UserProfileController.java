// package com.example.demo.controller;

// import com.example.demo.model.UserProfile;
// import com.example.demo.service.UserProfileService;
// import io.swagger.v3.oas.annotations.tags.Tag;
// import org.springframework.web.bind.annotation.*;

// import java.util.List;

// @RestController
// @RequestMapping("/api/users")
// @Tag(name = "User Profile")
// public class UserProfileController {

//     private final UserProfileService service;

//     public UserProfileController(UserProfileService service) {
//         this.service = service;
//     }

//     @PostMapping
//     public UserProfile create(@RequestBody UserProfile user) {
//         return service.createUser(user);
//     }

//     @PutMapping("/{id}")
//     public UserProfile update(@PathVariable Long id,
//                               @RequestBody UserProfile user) {
//         return service.updateUser(id, user); // ✅ NO setId()
//     }

//     @GetMapping("/{id}")
//     public UserProfile get(@PathVariable Long id) {
//         return service.getUserById(id);
//     }

//     @GetMapping
//     public List<UserProfile> getAll() {
//         return service.getAllUsers();
//     }

//     @PutMapping("/{id}/deactivate")
//     public void deactivate(@PathVariable Long id) {
//         service.deactivateUser(id);
//     }
// }
