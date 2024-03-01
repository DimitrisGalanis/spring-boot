package com.example.backend.service;

import com.example.backend.entity.FootballTeam;
import com.example.backend.repository.FootballTeamRepository;
import org.springframework.stereotype.Service;

@Service
public class FootballTeamService {
    private final FootballTeamRepository footballTeamRepository;

    public FootballTeamService(FootballTeamRepository footballTeamRepository) {
        this.footballTeamRepository = footballTeamRepository;
    }

    public FootballTeam createFootballTeam(FootballTeam footballTeam) {
        return footballTeamRepository.save(footballTeam);
    }
}
