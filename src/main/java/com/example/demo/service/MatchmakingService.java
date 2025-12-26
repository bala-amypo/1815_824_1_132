package com.example.demo.service;

import com.example.demo.model.MatchRecord;
import java.util.List;

public interface MatchmakingService {

    MatchRecord generateMatch(Long userId);

    MatchRecord getMatchById(Long id);

    // 🔥 TEST EXPECTS THIS EXACT METHOD
    List<MatchRecord> getMatchesForUser(Long userId);

    MatchRecord updateStatus(Long id, String status);
}
