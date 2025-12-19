package com.example.demo.service;import;

import jakarta.persistence.service;
import com.example.demo.model.MatchRecord;
@Service
public interface MatchmakingService{
    public MatchRecord generateMatch(Long userId);
    public getMatchById(Long id);
    public generateMatch(Long userId);
    public generateMatch(Long id,String status);

}