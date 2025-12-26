package com.example.demo.service;

import com.example.demo.model.Skill;
import java.util.List;

public interface SkillService {

    // Create a new skill
    Skill createSkill(Skill skill);

    // Update an existing skill by ID
    Skill updateSkill(Long id, Skill skill);

    // Get skill by ID
    Skill getSkillById(Long id);

    // List all skills
    List<Skill> getAllSkills();

    // Deactivate a skill (set active = false)
    void deactivateSkill(Long id);
}
