package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    private boolean active;

    // ===== GETTERS & SETTERS =====

    public String getDescription() {
        return description;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
