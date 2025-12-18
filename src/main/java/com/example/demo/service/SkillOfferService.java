package com.example.demo.service;import;

import jakarta.persistence.service;
import com.example.demo.model.SkillOffer;
@Service
public interface SkillOfferService{
    public SkillOffer createRequest(SkillOffer offer);

    public SkillOffer getSkillOffer(SkillOffer offer);
    public SkillOffer getupdateOffer(Long id, SkillOffer offer);
    public SkillOffer getRequestById(Long id);
    public SkillOffer getRequestByUser(Long userld);
    public SkillOffer deactivateRequest(Long id);
}