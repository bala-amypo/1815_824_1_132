package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class SkillOffer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String user;
    private String skill;
    private String experienceLevel;
    private Integer availableHoursPerWeek;
    private Boolean active;
 
    public SkillOffer() {
    }

    
    public SkillOffer(Long id,
                      String user,
                      String skill,
                      String experienceLevel,
                      Integer availableHoursPerWeek,
                      Boolean active) {
        this.id = id;
        this.user = user;
        this.skill = skill;
        this.experienceLevel = experienceLevel;
        this.availableHoursPerWeek = availableHoursPerWeek;
        this.active = active;
    }

 
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getExperienceLevel() {
        return experienceLevel;
    }

    public void setExperienceLevel(String experienceLevel) {
        this.experienceLevel = experienceLevel;
    }

    public Integer getAvailableHoursPerWeek() {
        return availableHoursPerWeek;
    }

    public void setAvailableHoursPerWeek(Integer availableHoursPerWeek) {
        this.availableHoursPerWeek = availableHoursPerWeek;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
