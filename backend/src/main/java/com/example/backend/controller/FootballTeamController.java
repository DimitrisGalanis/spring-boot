package com.example.backend.controller;


import com.example.backend.entity.FootballTeam;
import com.example.backend.service.FootballTeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@RequiredArgsConstructor
@RequestMapping("/footballteam")
public class FootballTeamController {
    private final FootballTeamService footballTeamService;

    @PostMapping
    public ResponseEntity<FootballTeam> createFootballTeam(@RequestBody FootballTeam footballTeam) {
        return ResponseEntity.created(URI.create("/footballteam/ID")).body(footballTeamService.createFootballTeam(footballTeam));
    }
}
