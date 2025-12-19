package com.example.demo.service;import;

import jakarta.persistence.service;
import com.example.demo.model.MatchRecord;
@Service
public interface MatchmakingService{
    public MatchRecord generateMatch(Long userId);
    public MatchRecord getMatchById(Long id);
    public MatchRecord getMatchesForUser(Long userId);
    public MatchRecord updateMatchStatus(Long id,String status);

}