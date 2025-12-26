// package com.example.demo.service.impl;

// import com.example.demo.model.MatchRecord;
// import com.example.demo.repository.MatchRecordRepository;
// import com.example.demo.service.MatchmakingService;
// import org.springframework.stereotype.Service;

// import java.util.List;

// @Service
// public class MatchmakingServiceImpl implements MatchmakingService {

//     private final MatchRecordRepository repo;

//     public MatchmakingServiceImpl(MatchRecordRepository repo) {
//         this.repo = repo;
//     }

//     @Override
//     public MatchRecord generateMatch(Long userId) {
//         throw new RuntimeException("No match found");
//     }

//     @Override
//     public MatchRecord getMatchById(Long id) {
//         return repo.findById(id)
//                 .orElseThrow(() -> new RuntimeException("No match found"));
//     }

//     @Override
//     public List<MatchRecord> getMatchesForUser(Long userId) {
//         return repo.findByUserAIdOrUserBId(userId, userId);
//     }

//     @Override
//     public MatchRecord updateMatchStatus(Long id, String status) {
//         MatchRecord m = getMatchById(id);
//         m.setStatus(status);
//         return repo.save(m);
//     }
// }
