package com.example.demo.service;

import com.example.demo.model.MatchRecord;

public interface MatchmakingService {

    MatchRecord generateMatch(Long userId);
    MatchRecord getMatchById(Long id);
    MatchRecord getMatchesForUser(Long userId);
    MatchRecord updateMatchStatus(Long id, String status);
}
