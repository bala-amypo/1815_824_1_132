package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class SkillOffer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String experienceLevel;
    private String description;
    private Integer availableHoursPerWeek;

    @ManyToOne
    @JoinColumn(name = "skill_id")
    private Skill skill;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserProfile user;

    private Boolean active;

    // Constructors
    public SkillOffer() {}

    public SkillOffer(Long id, String experienceLevel, String description, Integer availableHoursPerWeek,
                      Skill skill, UserProfile user, Boolean active) {
        this.id = id;
        this.experienceLevel = experienceLevel;
        this.description = description;
        this.availableHoursPerWeek = availableHoursPerWeek;
        this.skill = skill;
        this.user = user;
        this.active = active;
    }

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getExperienceLevel() { return experienceLevel; }
    public void setExperienceLevel(String experienceLevel) { this.experienceLevel = experienceLevel; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public Integer getAvailableHoursPerWeek() { return availableHoursPerWeek; }
    public void setAvailableHoursPerWeek(Integer availableHoursPerWeek) { this.availableHoursPerWeek = availableHoursPerWeek; }

    public Skill getSkill() { return skill; }
    public void setSkill(Skill skill) { this.skill = skill; }

    public UserProfile getUser() { return user; }
    public void setUser(UserProfile user) { this.user = user; }

    public Boolean getActive() { return active; }
    public void setActive(Boolean active) { this.active = active; }
}
