package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class MatchRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // ✅ Relationship to AppUser
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private AppUser user;

    private String status;

    private Boolean active = true;

    // ===== Constructors =====
    public MatchRecord() {
    }

    // ===== Getters =====
    public Long getId() {
        return id;
    }

    public AppUser getUser() {
        return user;
    }

    public String getStatus() {
        return status;
    }

    public Boolean getActive() {
        return active;
    }

    // ===== Setters =====
    public void setId(Long id) {
        this.id = id;
    }

    // ✅ THIS IS WHAT WAS MISSING
    public void setUser(AppUser user) {
        this.user = user;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
