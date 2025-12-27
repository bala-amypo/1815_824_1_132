package com.example.demo.controller;

import com.example.demo.model.MatchRecord;
import com.example.demo.service.MatchmakingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/matches")
public class MatchRecordController {

    private final MatchmakingService service;

    public MatchRecordController(MatchmakingService service) {
        this.service = service;
    }

    @PostMapping("/generate/{userId}")
    public ResponseEntity<MatchRecord> generate(@PathVariable Long userId) {
        return ResponseEntity.ok(service.generateMatch(userId));
    }

    @GetMapping("/{id}")
    public ResponseEntity<MatchRecord> get(@PathVariable Long id) {
        return ResponseEntity.ok(service.getMatchById(id));
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<MatchRecord>> getByUser(@PathVariable Long userId) {
        return ResponseEntity.ok(service.getMatchesForUser(userId));
    }

    @PutMapping("/{id}/status")
    public ResponseEntity<MatchRecord> updateStatus(
            @PathVariable Long id,
            @RequestParam String status) {
        return ResponseEntity.ok(service.updateMatchStatus(id, status));
    }
}
