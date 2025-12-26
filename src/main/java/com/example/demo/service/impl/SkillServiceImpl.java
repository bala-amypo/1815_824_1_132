package com.example.demo.service.impl;

import com.example.demo.model.Skill;
import com.example.demo.repository.SkillRepository;
import com.example.demo.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SkillServiceImpl implements SkillService {

    @Autowired
    private SkillRepository skillRepository;

    @Override
    public Skill createSkill(Skill skill) {
        skill.setActive(true); // Ensure default active
        return skillRepository.save(skill);
    }

    @Override
    public Skill updateSkill(Long id, Skill skill) {
        Optional<Skill> existing = skillRepository.findById(id);
        if (existing.isPresent()) {
            Skill s = existing.get();
            s.setName(skill.getName());
            s.setCategory(skill.getCategory());
            s.setDescription(skill.getDescription());
            s.setActive(skill.getActive());
            return skillRepository.save(s);
        }
        return null; // Or throw exception depending on your test expectations
    }

    @Override
    public Skill getSkillById(Long id) {
        return skillRepository.findById(id).orElse(null);
    }

    @Override
    public List<Skill> getAllSkills() {
        return skillRepository.findAll();
    }
}
