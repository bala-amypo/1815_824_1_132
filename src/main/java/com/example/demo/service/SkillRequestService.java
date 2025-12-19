package com.example.demo.service;import;

import jakarta.persistence.service;
import com.example.demo.model.SkillRequest;
@Service
public interface SkillRequestService{
    public SkillRequest createRequest(SkillRequest request);
    public SkillRequest updateRequest(Long id, SkillRequest request);
    public SkillRequest getRequestById(Long id);
    public SkillRequest getRequestByUser(Long userId);
    public SkillRequest deactivateRequest(Long id);
}