package com.example.demo.security;

import io.jsonwebtoken.*;
import io.jsonwebtoken.security.Keys;
import javax.crypto.SecretKey;
import java.util.Date;

public class JwtUtil {

    private static final String SECRET =
      "sdjhgbwubwwbgwiub8QFQ8qg87G1bfewifbiuwg7iu8wefqhjk";

    private final SecretKey key =
      Keys.hmacShaKeyFor(SECRET.getBytes());

    public JwtUtil() {}

    public String generateToken(String email, String role, Long userId) {
        return Jwts.builder()
                .setSubject(email)
                .claim("role", role)
                .claim("userId", userId)
                .setIssuedAt(new Date())
                .setExpiration(
                  new Date(System.currentTimeMillis() + 600000))
                .signWith(key, SignatureAlgorithm.HS256)
                .compact();
    }
}
