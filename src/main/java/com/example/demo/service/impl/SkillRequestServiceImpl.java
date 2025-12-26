package com.example.demo.service.impl;

import com.example.demo.model.SkillRequest;
import com.example.demo.repository.SkillRequestRepository;
import com.example.demo.service.SkillRequestService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillRequestServiceImpl implements SkillRequestService {

    private final SkillRequestRepository repository;

    public SkillRequestServiceImpl(SkillRequestRepository repository) {
        this.repository = repository;
    }

    @Override
    public SkillRequest createRequest(SkillRequest request) {
        request.setActive(true);
        return repository.save(request);
    }

    @Override
    public SkillRequest updateRequest(Long id, SkillRequest request) {
        SkillRequest existing = getRequestById(id);
        existing.setDescription(request.getDescription());
        return repository.save(existing);
    }

    @Override
    public SkillRequest getRequestById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("SkillRequest not found"));
    }

    @Override
    public List<SkillRequest> getRequestsByUser(Long userId) {
        return repository.findByUser_Id(userId);
    }

    // ✅ FIXED METHOD
    @Override
    public List<SkillRequest> getAllRequests() {
        return repository.findAll();
    }

    @Override
    public void deactivateRequest(Long id) {
        SkillRequest request = getRequestById(id);
        request.setActive(false);
        repository.save(request);
    }
}
