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
        if(skill.getCategory() == null) skill.setCategory("");
        if(skill.getDescription() == null) skill.setDescription("");
        if(skill.isActive() == null) skill.setActive(true);
        return repository.save(skill);
    }

    @Override
    public Skill updateSkill(Long id, Skill skill) {
        Skill existing = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Skill not found"));
        existing.setName(skill.getName());
        existing.setCategory(skill.getCategory());
        existing.setDescription(skill.getDescription());
        existing.setActive(skill.isActive());
        return repository.save(existing);
    }

    @Override
    public Skill getSkillById(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Skill not found"));
    }

    @Override
    public List<Skill> getAllSkills() {
        return repository.findAll();
    }

    @Override
    public void deactivateSkill(Long id) {
        Skill skill = getSkillById(id);
        skill.setActive(false);
        repository.save(skill);
    }
}
