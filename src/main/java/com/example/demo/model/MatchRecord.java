package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class MatchRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private UserProfile userA;

    @ManyToOne
    private UserProfile userB;

    @ManyToOne
    private Skill skillA;

    @ManyToOne
    private Skill skillB;

    private String status;
    private LocalDateTime matchedAt = LocalDateTime.now();

    // getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
