package com.example.demo.model;

@Entity
public class SkillOffer{
    @Id
    private Long id;
    private String user;
    private String skill;
    private String urgencyLevel;
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
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}