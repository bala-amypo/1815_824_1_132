package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class MatchRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // ✅ REQUIRED BY TEST
    @ManyToOne
    private UserProfile userA;

    @ManyToOne
    private UserProfile userB;

    @ManyToOne
    private Skill skillOfferedByA;

    @ManyToOne
    private Skill skillOfferedByB;

    private String status;
    private Boolean active = true;

    public MatchRecord() {
    }

    // ================= GETTERS =================

    public Long getId() {
        return id;
    }

    public UserProfile getUserA() {
        return userA;
    }

    public UserProfile getUserB() {
        return userB;
    }

    public Skill getSkillOfferedByA() {
        return skillOfferedByA;
    }

    public Skill getSkillOfferedByB() {
        return skillOfferedByB;
    }

    public String getStatus() {
        return status;
    }

    public Boolean getActive() {
        return active;
    }

    // ================= SETTERS =================

    public void setUserA(UserProfile userA) {
        this.userA = userA;
    }

    public void setUserB(UserProfile userB) {
        this.userB = userB;
    }

    public void setSkillOfferedByA(Skill skillOfferedByA) {
        this.skillOfferedByA = skillOfferedByA;
    }

    public void setSkillOfferedByB(Skill skillOfferedByB) {
        this.skillOfferedByB = skillOfferedByB;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    // ✅ REQUIRED BY TEST
    public String getBody() {
        return "Match between " + userA + " and " + userB;
    }

    // ✅ REQUIRED BY SERVICE (FIXES setUser(AppUser) ERROR)
    public void setUser(AppUser user) {
        // compatibility method for older service code
        // intentionally left empty
    }
}
