package com.example.demo.controller;

import com.example.demo.model.MatchRecord;
import com.example.demo.service.MatchmakingService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/matches")
public class MatchRecordController {

    private final MatchmakingService service;

    public MatchRecordController(MatchmakingService service) {
        this.service = service;
    }

    @PostMapping("/generate/{userId}")
    public MatchRecord generate(@PathVariable Long userId) {
        return service.generateMatch(userId);
    }

    @GetMapping("/{id}")
    public MatchRecord get(@PathVariable Long id) {
        return service.getMatchById(id);
    }
}
