package com.example.demo.service.impl;

import com.example.demo.model.MatchRecord;
import com.example.demo.repository.MatchRecordRepository;
import com.example.demo.service.MatchmakingService;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class MatchmakingServiceImpl implements MatchmakingService {

    private final MatchRecordRepository repository;

    public MatchmakingServiceImpl(MatchRecordRepository repository) {
        this.repository = repository;
    }

    @Override
    public MatchRecord generateMatch(Long userId) {
        MatchRecord match = new MatchRecord();
        // For now we can just assign userA; userB can be null until matched
        match.setUserA(new com.example.demo.model.UserProfile(){{
            setId(userId);
        }});
        match.setStatus("PENDING");
        return repository.save(match);
    }

    @Override
    public MatchRecord getMatchById(Long matchId) {
        Optional<MatchRecord> match = repository.findById(matchId);
        return match.orElseThrow(() -> new RuntimeException("Match not found"));
    }

    @Override
    public List<MatchRecord> getMatchesByUser(Long userId) {
        List<MatchRecord> listA = repository.findByUserA_Id(userId);
        List<MatchRecord> listB = repository.findByUserB_Id(userId);
        listA.addAll(listB);
        return listA;
    }

    @Override
    public MatchRecord updateStatus(Long matchId, String status) {
        MatchRecord match = getMatchById(matchId);
        match.setStatus(status);
        return repository.save(match);
    }
}
