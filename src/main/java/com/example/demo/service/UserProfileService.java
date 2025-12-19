package com.example.demo.service;import;

import jakarta.persistence.service;
import com.example.demo.model.UserProfile;
@Service
public interface UserProfileService{

    public UserProfile createUser(Skill skill);
    public Skill updateSkill(Long id, Skill skill);
    public Skill getSkillById(Long id);
    public Skill getAllSkills();
    public Skill deactivateSkill(Long id);
}