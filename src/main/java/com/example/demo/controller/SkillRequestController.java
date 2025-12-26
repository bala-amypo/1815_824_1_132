package com.example.demo.controller;

import com.example.demo.model.SkillRequest;
import com.example.demo.service.SkillRequestService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/skill-requests")
public class SkillRequestController {

    private final SkillRequestService service;

    public SkillRequestController(SkillRequestService service) {
        this.service = service;
    }

    @PostMapping
    public SkillRequest createRequest(@RequestBody SkillRequest request) {
        return service.createRequest(request);
    }

    @PutMapping("/{id}")
    public SkillRequest updateRequest(
            @PathVariable Long id,
            @RequestBody SkillRequest request) {
        return service.updateRequest(id, request);
    }

    @GetMapping("/{id}")
    public SkillRequest getRequest(@PathVariable Long id) {
        return service.getRequestById(id);
    }

    @GetMapping("/user/{userId}")
    public List<SkillRequest> getRequestsByUser(@PathVariable Long userId) {
        return service.getRequestsByUser(userId);
    }

    @PutMapping("/{id}/deactivate")
    public void deactivateRequest(@PathVariable Long id) {
        service.deactivateRequest(id);
    }
}
