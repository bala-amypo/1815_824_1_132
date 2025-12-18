package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class SkillOffer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private UserProfile user;

    @ManyToOne
    private Skill skill;

    @Enumerated(EnumType.STRING)
    private ExperienceLevel experienceLevel;

    private Integer availableHoursPerWeek;

    private Boolean active;

    public SkillOffer() {
    }

    public SkillOffer(Long id, UserProfile user, Skill skill,
                      ExperienceLevel experienceLevel, Integer availableHoursPerWeek, Boolean active) {
        this.id = id;
        this.user = user;
        this.skill = skill;
        this.experienceLevel = experienceLevel;
        this.availableHoursPerWeek = availableHoursPerWeek;
        this.active = active;
    }

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserProfile getUser() {
        return user;
    }

    public void setUser(UserProfile user) {
        this.user = user;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public ExperienceLevel getExperienceLevel() {
        return experienceLevel;
    }

    public void setExperienceLevel(ExperienceLevel experienceLevel) {
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

    // Enum to restrict experienceLevel values
    public enum ExperienceLevel {
        BEGINNER,
        INTERMEDIATE,
        EXPERT
    }
}
