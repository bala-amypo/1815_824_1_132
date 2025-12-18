package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.MatchRecord;

public interface MatchRepository extends JpaRepository<MatchRecord,Long>{

}