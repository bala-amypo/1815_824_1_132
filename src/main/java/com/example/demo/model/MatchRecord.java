package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class MatchRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private UserProfile requester;

    @ManyToOne
    private UserProfile provider;

    @ManyToOne
    private Skill skill;

    private String status;

    public MatchRecord() {
    }

    // getters & setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserProfile getRequester() {
        return requester;
    }

    public void setRequester(UserProfile requester) {
        this.requester = requester;
    }

    public UserProfile getProvider() {
        return provider;
    }

    public void setProvider(UserProfile provider) {
        this.provider = provider;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
