package com.example.demo.repository;

import com.example.demo.model.SkillRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SkillRequestRepository extends JpaRepository<SkillRequest, Long> {

    // Find requests by Skill ID
    List<SkillRequest> findBySkill_Id(Long skillId);

    // Find requests by User ID
    List<SkillRequest> findByUser_Id(Long userId);
}
