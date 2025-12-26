// package com.example.demo.service.impl;

// import com.example.demo.model.SkillRequest;
// import com.example.demo.repository.SkillRequestRepository;
// import com.example.demo.service.SkillRequestService;
// import org.springframework.stereotype.Service;

// import java.util.List;
// import java.util.stream.Collectors;

// @Service
// public class SkillRequestServiceImpl implements SkillRequestService {

//     private final SkillRequestRepository repo;

//     public SkillRequestServiceImpl(SkillRequestRepository repo) {
//         this.repo = repo;
//     }

//     @Override
//     public SkillRequest createRequest(SkillRequest request) {
//         return repo.save(request);
//     }

//     @Override
//     public SkillRequest updateRequest(Long id, SkillRequest request) {
//         SkillRequest existing = getRequestById(id);
//         existing.setUrgencyLevel(request.getUrgencyLevel());
//         return repo.save(existing);
//     }

//     @Override
//     public SkillRequest getRequestById(Long id) {
//         return repo.findById(id)
//                 .orElseThrow(() -> new RuntimeException("Skill not found"));
//     }

//     @Override
//     public List<SkillRequest> getRequestsByUser(Long userId) {
//         return repo.findAll().stream()
//                 .filter(r -> r.getUser().getId().equals(userId))
//                 .collect(Collectors.toList());
//     }

//     @Override
//     public void deactivateRequest(Long id) {
//         SkillRequest request = getRequestById(id);
//         request.setActive(false);
//         repo.save(request);
//     }
// }
