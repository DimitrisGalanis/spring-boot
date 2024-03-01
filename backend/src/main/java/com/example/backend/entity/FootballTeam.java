package com.example.backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


// Data Model / Entity / Database
@Entity
@Table(name = "footballteam")
public class FootballTeam {
    @Id
    private Integer id;
    private String name;
    private String country;
}

