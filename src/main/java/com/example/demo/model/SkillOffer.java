package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class SkillOffer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String experienceLevel;
    private Boolean available = true;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserProfile user;

    @ManyToOne
    @JoinColumn(name = "skill_id")
    private Skill skill;

    // getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getExperienceLevel() { return experienceLevel; }
    public void setExperienceLevel(String experienceLevel) {
        this.experienceLevel = experienceLevel;
    }

    public Boolean getAvailable() { return available; }
    public void setAvailable(Boolean available) { this.available = available; }
}
