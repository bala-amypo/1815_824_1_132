package com.example.demo.service;

import com.example.demo.model.MatchRecord;
import java.util.List;

public interface MatchmakingService {

    List<MatchRecord> getMatchesForUser(Long userId);

    MatchRecord updateStatus(Long matchId, String status);
}
