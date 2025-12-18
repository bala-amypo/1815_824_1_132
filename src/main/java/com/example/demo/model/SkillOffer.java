package com.example.demo.model;

@Entity
public class SkillOffer{
    @Id
    private Long id;
    private String user;
    private String skill;
    private String experienceLevel;
    private Integer availableHoursPerWeek;
    private Boolean active;

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
        this.experiencedLevel = experienceLevel;
    }

    public Integer getAvailableHoursPerWeek() {
        return availableHoursPerWeek;
    }

    public void setAvailableHoursPerWeek(String availableHoursPerWeek) {
        this.availableHoursPerWeek = availableHoursPerWeek;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
    public SkillOffer(Long id,String user,String skill,String experiencedLevel,Integer availableHoursPerWeek,Boolean active){
        this.id=id;
        this.user=user;
        this.skill;
        this.experiencedLevel=experiencedLevel;
        this.availableHoursPerWeek=availableHoursPerWeek;
        this.active=active;
    }
    public SkillOffer(){
        
    }
}