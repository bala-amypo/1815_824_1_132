package com.example.demo.service;

import com.example.demo.model.MatchRecord;
import java.util.ArrayList;
import java.util.List;

public interface MatchmakingService {

    List<MatchRecord> getMatchesForUser(long userId);

}
