package com.example.demo.repository;

import com.example.demo.model.MatchRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MatchRecordRepository extends JpaRepository<MatchRecord, Long> {

    // Find matches where the user is either userA or userB
    List<MatchRecord> findByUserA_IdOrUserB_Id(Long userAId, Long userBId);
}
