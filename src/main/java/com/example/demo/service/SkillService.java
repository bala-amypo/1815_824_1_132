package com.example.demo.service;import;

import jakarta.persistence.service;
import com.example.demo.model.Skill;
@Service
public interface SkillOfferService{

    public Skill createSkill(Skill skill);
    public Skill updateSkill(Long id, Skill skill);
    public Skill getSkillById(Long id);
    public Skill getAllSkills();
    public Skill deactivateSkill(Long id);
}