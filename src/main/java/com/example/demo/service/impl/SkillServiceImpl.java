package com.example.demo.service.impl;

import com.example.demo.model.Skill;
import com.example.demo.repository.SkillRepository;
import com.example.demo.service.SkillService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillServiceImpl implements SkillService {

    private final SkillRepository repository;

    public SkillServiceImpl(SkillRepository repository) {
        this.repository = repository;
    }

    @Override
    public Skill createSkill(Skill skill) {
        skill.setActive(true); // default active
        return repository.save(skill);
    }

    @Override
    public Skill updateSkill(Long id, Skill skillDetails) {
        Skill skill = repository.findById(id).orElse(null);
        if (skill != null) {
            skill.setName(skillDetails.getName());
            skill.setCategory(skillDetails.getCategory());
            skill.setDescription(skillDetails.getDescription());
            skill.setActive(skillDetails.isActive());
            repository.save(skill);
        }
        return skill;
    }

    @Override
    public Skill getSkillById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Skill> getAllSkills() {
        return repository.findAll();
    }

    @Override
    public void deactivateSkill(Long id) {
        Skill skill = repository.findById(id).orElse(null);
        if (skill != null) {
            skill.setActive(false);
            repository.save(skill);
        }
    }
}
