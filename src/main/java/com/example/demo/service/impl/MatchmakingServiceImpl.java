package com.example.demo.service.impl;

import com.example.demo.model.AppUser;
import com.example.demo.model.MatchRecord;
import com.example.demo.repository.AppUserRepository;
import com.example.demo.repository.MatchRecordRepository;
import com.example.demo.service.MatchmakingService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchmakingServiceImpl implements MatchmakingService {

    private final MatchRecordRepository matchRepo;
    private final AppUserRepository userRepo;

    public MatchmakingServiceImpl(
            MatchRecordRepository matchRepo,
            AppUserRepository userRepo) {
        this.matchRepo = matchRepo;
        this.userRepo = userRepo;
    }

    @Override
    public MatchRecord generateMatch(Long userId) {
        AppUser user = userRepo.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));

        MatchRecord match = new MatchRecord();
        match.setUser(user); // ✅ FIXED
        match.setStatus("PENDING");

        return matchRepo.save(match);
    }

    @Override
    public MatchRecord getMatchById(Long id) {
        return matchRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Match not found"));
    }

    @Override
    public List<MatchRecord> getMatchesByUser(Long userId) {
        return matchRepo.findByUser_Id(userId);
    }

    @Override
    public MatchRecord updateStatus(Long id, String status) {
        MatchRecord match = getMatchById(id);
        match.setStatus(status);
        return matchRepo.save(match);
    }
}
