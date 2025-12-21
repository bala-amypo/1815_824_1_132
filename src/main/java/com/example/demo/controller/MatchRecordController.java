package com.example.demo.controller;

import com.example.demo.model.MatchRecord;
import com.example.demo.service.MatchmakingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/matches")
@io.swagger.v3.oas.annotations.tags.Tag(name = "Matchmaking")
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

    @GetMapping("/user/{userId}")
    public List<MatchRecord> getForUser(@PathVariable Long userId) {
        return service.getMatchesForUser(userId);
    }

    @PutMapping("/{id}/status")
    public MatchRecord updateStatus(
            @PathVariable Long id,
            @RequestParam String status) {
        return service.updateMatchStatus(id, status);
    }
}
