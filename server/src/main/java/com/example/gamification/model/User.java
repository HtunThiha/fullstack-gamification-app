package com.example.gamification.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "user")
@Getter @Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID user_id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private int gold = 0, diamond = 0, level = 1;
}
