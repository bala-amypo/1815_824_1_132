package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.sql.Timestamp;

@Entity
public class MatchRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userA;
    private String userB;
    private String skillOfferedByA;
    private String skillOfferedByB;
    private Timestamp matchedAt;
    private String status;

    // No-args constructor (required by JPA)
    public MatchRecord() {
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserA() {
        return userA;
    }

    public void setUserA(String userA) {
        this.userA = userA;
    }

    public String getUserB() {
        return userB;
    }

    public void setUserB(String userB) {
        this.userB = userB;
    }

    public String getSkillOfferedByA() {
        return skillOfferedByA;
    }

    public void setSkillOfferedByA(String skillOfferedByA) {
        this.skillOfferedByA = skillOfferedByA;
    }

    public String getSkillOfferedByB() {
        return skillOfferedByB;
    }

    public void setSkillOfferedByB(String skillOfferedByB) {
        this.skillOfferedByB = skillOfferedByB;
    }

    public Timestamp getMatchedAt() {
        return matchedAt;
    }

    public void setMatchedAt(Timestamp matchedAt) {
        this.matchedAt = matchedAt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
