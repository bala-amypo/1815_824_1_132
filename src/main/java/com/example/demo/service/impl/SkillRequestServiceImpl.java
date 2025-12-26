// package com.example.demo.service;

// import com.example.demo.model.SkillRequest;
// import com.example.demo.repository.SkillRequestRepository;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import java.util.List;
// import java.util.Optional;

// @Service
// public class SkillRequestServiceImpl implements SkillRequestService {

//     private final SkillRequestRepository repository;

//     @Autowired
//     public SkillRequestServiceImpl(SkillRequestRepository repository) {
//         this.repository = repository;
//     }

//     @Override
//     public SkillRequest updateRequest(Long id, SkillRequest request) {
//         Optional<SkillRequest> optionalExisting = repository.findById(id);

//         if (optionalExisting.isPresent()) {
//             SkillRequest existing = optionalExisting.get();
//             existing.setSkill(request.getSkill());
//             existing.setUser(request.getUser());
//             existing.setDescription(request.getDescription());
//             existing.setActive(request.getActive());
//             return repository.save(existing);
//         } else {
//             throw new RuntimeException("SkillRequest not found with id: " + id);
//         }
//     }

//     @Override
//     public List<SkillRequest> getRequestsByUser(Long userId) {
//         return repository.findByUserId(userId); // make sure this method exists in repository
//     }
// }
