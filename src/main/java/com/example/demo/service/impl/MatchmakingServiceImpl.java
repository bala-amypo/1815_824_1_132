package com.example.demo.service;

import com.example.demo.model.MatchRecord;
import com.example.demo.repository.MatchRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
        // TODO: Add logic to assign userA, userB, skills, body
        return repository.save(match);
    }

    @Override
    public MatchRecord getMatchById(Long matchId) {
        Optional<MatchRecord> match = repository.findById(matchId);
        return match.orElseThrow(() -> new RuntimeException("Match not found with id: " + matchId));
    }

    @Override
    public List<MatchRecord> getMatchesByUser(Long userId) {
        return repository.findByUserA_Id(userId); // or custom query
    }

    @Override
    public MatchRecord updateStatus(Long matchId, String status) {
        MatchRecord match = getMatchById(matchId);
        match.setStatus(status);
        return repository.save(match);
    }

    @Override
    public List<MatchRecord> getMatchesForUser(long userId) {
        return repository.findByUserA_Id(userId); // matches test method
    }
}
