package com.example.demo.service.impl;

import com.example.demo.model.SkillOffer;
import com.example.demo.repository.SkillOfferRepository;
import com.example.demo.service.SkillOfferService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SkillOfferServiceImpl implements SkillOfferService {

    private final SkillOfferRepository repo;

    public SkillOfferServiceImpl(SkillOfferRepository repo) {
        this.repo = repo;
    }

    @Override
    public SkillOffer createOffer(SkillOffer offer) {
        return repo.save(offer);
    }

    @Override
    public SkillOffer updateOffer(Long id, SkillOffer offer) {
        SkillOffer existing = getOfferById(id);

        existing.setExperienceLevel(offer.getExperienceLevel());
        existing.setAvailableHoursPerWeek(offer.getAvailableHoursPerWeek());

        return repo.save(existing);
    }

    @Override
    public SkillOffer getOfferById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Offer not found"));
    }

    @Override
    public List<SkillOffer> getOffersByUser(Long userId) {
        return repo.findAll().stream()
                .filter(o -> o.getUser().getId().equals(userId))
                .collect(Collectors.toList());
    }

    @Override
    public void deactivateOffer(Long id) {
        SkillOffer offer = getOfferById(id);
        offer.setActive(false);
        repo.save(offer);
    }
}
