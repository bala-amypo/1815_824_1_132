package com.example.demo.service.impl;

import com.example.demo.model.MatchRecord;
import com.example.demo.repository.MatchRecordRepository;
import com.example.demo.service.MatchmakingService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchmakingServiceImpl implements MatchmakingService {

    private final MatchRecordRepository matchRepo;

    public MatchmakingServiceImpl(MatchRecordRepository matchRepo) {
        this.matchRepo = matchRepo;
    }

    @Override
    public List<MatchRecord> getMatchesForUser(Long userId) {
        return matchRepo.findByUserA_IdOrUserB_Id(userId, userId);
    }

    // ✅ REQUIRED METHOD (THIS FIXES THE ERROR)
    @Override
    public MatchRecord updateStatus(Long matchId, String status) {
        MatchRecord record = matchRepo.findById(matchId)
                .orElseThrow(() -> new RuntimeException("Match not found"));

        record.setStatus(status);
        return matchRepo.save(record);
    }
}
