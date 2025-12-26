package com.example.demo.service;

import com.example.demo.model.SkillRequest;
import java.util.List;

public interface SkillRequestService {
    SkillRequest createRequest(SkillRequest request);
    SkillRequest getRequestById(Long id); // Return type must match impl
    List<SkillRequest> getAllRequests();
    void deactivateRequest(Long id); // Ensure this exists
}
