package com.example.demo.service;import;

import jakarta.persistence.service;
import com.example.demo.model.MatchRecord;
@Service
public interface MatchmakingService{
    public generateMatch(Long userId);
    
}