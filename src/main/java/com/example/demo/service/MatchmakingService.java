package com.example.demo.service;

import com.example.demo.model.MatchRecord;

import java.util.List;

public interface MatchmakingService {

    MatchRecord generateMatch(Long userId);

    MatchRecord getMatchById(Long matchId);

    List<MatchRecord> getMatchesByUser(Long userId);

    MatchRecord updateStatus(Long matchId, String status);

    List<MatchRecord> getMatchesForUser(long userId); // added for test
}
