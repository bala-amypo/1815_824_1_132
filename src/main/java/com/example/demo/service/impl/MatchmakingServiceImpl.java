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
        MatchRecord record = new MatchRecord();
        record.setStatus("PENDING");
        return repository.save(record);
    }

    @Override
    public MatchRecord getMatchById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("No match found"));
    }

    @Override
    public List<MatchRecord> getMatchesForUser(Long userId) {
        return repository.findByUserAIdOrUserBId(userId, userId);
    }

    @Override
    public MatchRecord updateMatchStatus(Long id, String status) {
        MatchRecord record = getMatchById(id);
        record.setStatus(status);
        return repository.save(record);
    }
}
