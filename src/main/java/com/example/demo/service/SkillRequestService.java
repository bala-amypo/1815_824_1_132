package com.example.demo.service;import;

import jakarta.persistence.service;
import com.example.demo.model.SkillRequest;
@Service
public interface SkillRequestService{
    public SkillRequest createRequest(SkillRequest request);

    public SkillRequest getSkillRequest(SkillRequest)
}