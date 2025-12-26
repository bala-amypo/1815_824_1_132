package com.example.demo.service;

import com.example.demo.model.SkillRequest;
import java.util.List;

public interface SkillRequestService {
    SkillRequest createRequest(SkillRequest request);
    SkillRequest getRequestById(Long id);
    List<SkillRequest> getAllRequests();
    void deactivateRequest(Long id);

    // New methods needed by controller
    SkillRequest updateRequest(Long id, SkillRequest request);
    List<SkillRequest> getRequestsByUser(Long userId);
}
