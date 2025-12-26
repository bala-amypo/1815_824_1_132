package com.example.demo.service.impl;

import com.example.demo.model.SkillRequest;
import com.example.demo.repository.SkillRequestRepository;
import com.example.demo.service.SkillRequestService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SkillRequestServiceImpl implements SkillRequestService {

    private final SkillRequestRepository skillRequestRepository;

    // Constructor injection
    public SkillRequestServiceImpl(SkillRequestRepository skillRequestRepository) {
        this.skillRequestRepository = skillRequestRepository;
    }

    @Override
    public List<SkillRequest> getAllRequests() {
        return skillRequestRepository.findAll();
    }

    @Override
    public Optional<SkillRequest> getRequestById(Long id) {
        return skillRequestRepository.findById(id);
    }

    @Override
    public SkillRequest createRequest(SkillRequest request) {
        // Initialize default values if needed
        if (request.getActive() == null) {
            request.setActive(true);
        }
        return skillRequestRepository.save(request);
    }

    @Override
    public SkillRequest updateRequest(Long id, SkillRequest updatedRequest) {
        Optional<SkillRequest> optionalRequest = skillRequestRepository.findById(id);
        if (optionalRequest.isPresent()) {
            SkillRequest existingRequest = optionalRequest.get();
            existingRequest.setStatus(updatedRequest.getStatus());
            existingRequest.setUrgencyLevel(updatedRequest.getUrgencyLevel());
            existingRequest.setActive(updatedRequest.getActive());
            return skillRequestRepository.save(existingRequest);
        }
        return null; // or throw an exception
    }

    @Override
    public void deleteRequest(Long id) {
        skillRequestRepository.deleteById(id);
    }

    @Override
    public List<SkillRequest> getRequestsBySkillId(Long skillId) {
        return skillRequestRepository.findBySkill_Id(skillId);
    }
}
