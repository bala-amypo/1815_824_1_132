package com.example.demo.controller;

import com.example.demo.model.SkillRequest;
import com.example.demo.service.SkillRequestService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/skill-requests")
@Tag(name = "Skill Requests")
public class SkillRequestController {

    private final SkillRequestService service;

    public SkillRequestController(SkillRequestService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<SkillRequest> create(@RequestBody SkillRequest request) {
        return ResponseEntity.ok(service.createRequest(request));
    }

    @PutMapping("/{id}")
    public ResponseEntity<SkillRequest> update(@PathVariable Long id,
                                               @RequestBody SkillRequest request) {
        return ResponseEntity.ok(service.updateRequest(id, request));
    }

    @GetMapping("/{id}")
    public ResponseEntity<SkillRequest> get(@PathVariable Long id) {
        return ResponseEntity.ok(service.getRequestById(id));
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<SkillRequest>> getByUser(@PathVariable Long userId) {
        return ResponseEntity.ok(service.getRequestsByUser(userId));
    }

    @PutMapping("/{id}/deactivate")
    public ResponseEntity<Void> deactivate(@PathVariable Long id) {
        service.deactivateRequest(id);
        return ResponseEntity.ok().build();
    }
}
