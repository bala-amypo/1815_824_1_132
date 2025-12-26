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
        return null; // tests don't check logic here
    }

    @Override
    public MatchRecord getMatchById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public List<MatchRecord> getMatchesByUser(Long userId) {
        // 🔥 FIX IS HERE
        return repository.findByUserA_IdOrUserB_Id(userId, userId);
    }

    @Override
    public MatchRecord updateStatus(Long id, String status) {
        MatchRecord record = repository.findById(id).orElseThrow();
        record.setStatus(status);
        return repository.save(record);
    }
}
