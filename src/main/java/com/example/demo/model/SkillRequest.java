package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class SkillRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String urgency;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserProfile user;

    @ManyToOne
    @JoinColumn(name = "skill_id")
    private Skill skill;

    // getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getUrgency() { return urgency; }
    public void setUrgency(String urgency) { this.urgency = urgency; }
}
