package com.example.demo.service;

import com.example.demo.model.Skill;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SkillServiceImpl implements SkillService {

    @Override
    public List<Skill> getAllSkills() {
        return new ArrayList<>();
    }
}
