package com.example.demo.service;

import com.example.demo.model.MatchRecord;
import java.util.List;

public interface MatchmakingService {

    MatchRecord generateMatch(Long userId);

    MatchRecord getMatchById(Long id);

    List<MatchRecord> getMatchesByUser(Long userId);

    // ✅ ADD THIS
    MatchRecord updateStatus(Long id, String status);
}
