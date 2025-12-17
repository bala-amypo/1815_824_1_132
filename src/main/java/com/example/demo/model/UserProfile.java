package com.example.demo.model;

@Entity
public class UserProfile{
    private Long id;
    private String username;
    private String email;
    private String bio;
    private Boolean active;
    private String createdAt;
    private String updatedAt;
}