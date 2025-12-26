package com.example.demo.service.impl;

import com.example.demo.model.MatchRecord;
import com.example.demo.repository.MatchRecordRepository;
import com.example.demo.service.MatchmakingService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchmakingServiceImpl implements MatchmakingService {

    private final MatchRecordRepository repository;

    public MatchmakingServiceImpl(MatchRecordRepository repository) {
        this.repository = repository;
    }

    @Override
    public MatchRecord generateMatch(Long userId) {
        MatchRecord match = new MatchRecord();
        match.setUserId(userId);
        match.setStatus("PENDING");
        return repository.save(match);
    }

    @Override
    public MatchRecord getMatchById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Match not found"));
    }

    @Override
    public List<MatchRecord> getMatchesByUser(Long userId) {
        return repository.findByUserId(userId);
    }

    // ✅ FIXED METHOD
    @Override
    public MatchRecord updateStatus(Long id, String status) {
        MatchRecord match = getMatchById(id);
        match.setStatus(status);
        return repository.save(match);
    }
}
