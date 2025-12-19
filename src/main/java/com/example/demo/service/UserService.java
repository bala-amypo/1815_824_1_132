package com.example.demo.service;import;

import jakarta.persistence.service;
import com.example.demo.model.Skill;
@Service
public interface SkillOfferService{

    public Skill register(User user);
    public Skill findByEmail(String email);
    
}