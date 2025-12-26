package com.example.demo.model;

import jakarta.persistence.*;
import java.sql.Timestamp;

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
    private Skill skillOfferedByA;

    @ManyToOne
    private Skill skillOfferedByB;

    private Timestamp matchedAt;
    private String status = "PENDING";

    // getters & setters
}
