package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.SkillOffer;
import java.util.List;

public interface SkillOfferRepository
        extends JpaRepository<SkillOffer, Long> {

    List<SkillOffer> findByUserId(Long userId);
}
