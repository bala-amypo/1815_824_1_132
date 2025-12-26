package com.example.demo.repository;

import com.example.demo.model.SkillRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface SkillRequestRepository extends JpaRepository<SkillRequest, Long> {

    // Use entity field name "skill" and navigate to "id"
    List<SkillRequest> findBySkill_Id(Long skillId);
}
