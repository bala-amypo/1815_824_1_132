package com.example.demo.service.impl;

import com.example.demo.model.*;
import com.example.demo.repository.*;
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
    public MatchRecord generateMatch(Long userId) {
        throw new RuntimeException("No match found");
    }

    @Override
    public MatchRecord getMatchById(Long id) {
        return matchRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("No match found"));
    }

    @Override
    public List<MatchRecord> getMatchesForUser(Long userId) {
        return matchRepo.findAll().stream()
                .filter(m ->
                        (m.getUserA() != null && m.getUserA().getId().equals(userId)) ||
                        (m.getUserB() != null && m.getUserB().getId().equals(userId))
                ).toList();
    }

    @Override
    public MatchRecord updateMatchStatus(Long id, String status) {
        MatchRecord match = getMatchById(id);
        match.setStatus(status);
        return matchRepo.save(match);
    }
}
