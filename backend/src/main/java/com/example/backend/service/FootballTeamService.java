package com.example.backend.service;

import com.example.backend.entity.FootballTeam;
import com.example.backend.repository.FootballTeamRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;


import java.util.List;

@Service
public class FootballTeamService {
    private final FootballTeamRepository footballTeamRepository;


    /**
     * @param footballTeamRepository
     * Constructor
     * Dependency Injection
     */
    public FootballTeamService(FootballTeamRepository footballTeamRepository) {
        this.footballTeamRepository = footballTeamRepository;
    }

    public List<FootballTeam> getAllTeams() {
        return footballTeamRepository.findAll();
    }


    public FootballTeam getFootballTeam(String id) {
        return footballTeamRepository.findById(id).orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }


    public FootballTeam createFootballTeam(FootballTeam footballTeam) {
        return footballTeamRepository.save(footballTeam);
    }


    public FootballTeam deleteFootballTeam(String id) {
        FootballTeam ft = footballTeamRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        footballTeamRepository.delete(ft);
        return ft;
    }


}
