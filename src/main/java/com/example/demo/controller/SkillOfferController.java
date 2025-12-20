package com.example.demo.controller;

import com.example.demo.model.SkillOffer;
import com.example.demo.service.SkillOfferService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/skill-offers")
@io.swagger.v3.oas.annotations.tags.Tag(name = "Skill Offers")
public class SkillOfferController {

    private final SkillOfferService service;

    public SkillOfferController(SkillOfferService service) {
        this.service = service;
    }

    @PostMapping
    public SkillOffer create(@RequestBody SkillOffer offer) {
        return service.createOffer(offer);
    }

    @PutMapping("/{id}")
    public SkillOffer update(@PathVariable Long id, @RequestBody SkillOffer offer) {
        return service.updateOffer(id, offer);
    }

    @GetMapping("/{id}")
    public SkillOffer get(@PathVariable Long id) {
        return service.getOfferById(id);
    }

    @GetMapping("/user/{userId}")
    public List<SkillOffer> getByUser(@PathVariable Long userId) {
        return service.getOffersByUser(userId);
    }

    @PutMapping("/{id}/deactivate")
    public void deactivate(@PathVariable Long id) {
        service.deactivateOffer(id);
    }
}
