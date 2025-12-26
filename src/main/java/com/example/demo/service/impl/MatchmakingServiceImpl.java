package com.example.demo.service.impl;

import com.example.demo.model.MatchRecord;
import com.example.demo.repository.MatchRecordRepository;
import com.example.demo.service.MatchmakingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchmakingServiceImpl implements MatchmakingService {

    private final MatchRecordRepository repository;

    @Autowired
    public MatchmakingServiceImpl(MatchRecordRepository repository) {
        this.repository = repository;
    }

    @Override
    public MatchRecord generateMatch(Long userId) {
        MatchRecord match = new MatchRecord();
        match.setStatus("PENDING");
        return repository.save(match);
    }

    @Override
    public MatchRecord getMatchById(Long matchId) {
        return repository.findById(matchId)
                .orElseThrow(() -> new RuntimeException("Match not found with id: " + matchId));
    }

    @Override
    public List<MatchRecord> getMatchesByUser(Long userId) {
        List<MatchRecord> listA = repository.findByUserA_Id(userId);
        List<MatchRecord> listB = repository.findByUserB_Id(userId);
        listA.addAll(listB);
        return listA;
    }

    @Override
    public List<MatchRecord> getMatchesForUser(long userId) {
        return getMatchesByUser(userId);
    }

    @Override
    public MatchRecord updateStatus(Long matchId, String status) {
        MatchRecord match = getMatchById(matchId);
        match.setStatus(status);
        return repository.save(match);
    }
}
