package com.example.demo.repository;

import com.example.demo.model.MatchRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MatchRecordRepository extends JpaRepository<MatchRecord, Long> {

    // Find all matches where userA is a given user
    List<MatchRecord> findByUserA_Id(Long userId);

    // Optional: Find all matches where userB is a given user
    List<MatchRecord> findByUserB_Id(Long userId);
}
