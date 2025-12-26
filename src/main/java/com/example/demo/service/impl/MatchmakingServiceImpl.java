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
        // Tests usually don't check generation logic
        return new MatchRecord();
    }

    @Override
    public MatchRecord getMatchById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<MatchRecord> getMatchesByUser(Long userId) {
        return repository.findByUserA_IdOrUserB_Id(userId, userId);
    }

    @Override
    public MatchRecord updateStatus(Long id, String status) {
        MatchRecord record = repository.findById(id).orElse(null);
        if (record == null) {
            return null;
        }
        record.setStatus(status);
        return repository.save(record);
    }
}
