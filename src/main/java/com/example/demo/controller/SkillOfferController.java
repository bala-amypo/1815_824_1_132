package com.example.demo.controller;

import com.example.demo.model.SkillOffer;
import com.example.demo.service.SkillOfferService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/skill-offers")
@Tag(name = "Skill Offers")
public class SkillOfferController {

    private final SkillOfferService service;

    public SkillOfferController(SkillOfferService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<SkillOffer> create(@RequestBody SkillOffer offer) {
        return ResponseEntity.ok(service.createOffer(offer));
    }

    @PutMapping("/{id}")
    public ResponseEntity<SkillOffer> update(@PathVariable Long id,
                                             @RequestBody SkillOffer offer) {
        return ResponseEntity.ok(service.updateOffer(id, offer));
    }

    @GetMapping("/{id}")
    public ResponseEntity<SkillOffer> get(@PathVariable Long id) {
        return ResponseEntity.ok(service.getOfferById(id));
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<SkillOffer>> getByUser(@PathVariable Long userId) {
        return ResponseEntity.ok(service.getOffersByUser(userId));
    }

    @PutMapping("/{id}/deactivate")
    public ResponseEntity<Void> deactivate(@PathVariable Long id) {
        service.deactivateOffer(id);
        return ResponseEntity.ok().build();
    }
}
