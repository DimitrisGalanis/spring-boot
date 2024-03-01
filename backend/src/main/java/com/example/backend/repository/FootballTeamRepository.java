package com.example.backend.repository;

import com.example.backend.entity.FootballTeam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FootballTeamRepository extends JpaRepository<FootballTeam, String> {
    Optional<FootballTeam> findById(String id);
}
