package com.example.backend.controller;


import com.example.backend.entity.FootballTeam;
import com.example.backend.service.FootballTeamService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.net.URI;
import java.util.Collection;

@RestController
@RequiredArgsConstructor
@RequestMapping("/footballteam")
public class FootballTeamController {
    private final FootballTeamService footballTeamService;

    @GetMapping("")
    public String HelloWorld() {
        return " Hello world !!" ;
    }

    @GetMapping("/footballteams")
    public ResponseEntity<Collection<FootballTeam>> getAllTeams() {
        return ResponseEntity.ok().body(footballTeamService.getAllTeams());
    }

    @GetMapping("/{id}")
    public ResponseEntity<FootballTeam> getFootballTeam(@PathVariable String id) {
        return ResponseEntity.ok().body(footballTeamService.getFootballTeam(id));
    }

    @PostMapping
    public ResponseEntity<FootballTeam> createFootballTeam(@RequestBody FootballTeam footballTeam) {
        return ResponseEntity.created(URI.create("/footballteam/ID")).body(footballTeamService.createFootballTeam(footballTeam));
    }

   @DeleteMapping("/{id}")
    public void deleteFootballTeam(@PathVariable String id) {
       footballTeamService.deleteFootballTeam(id);
   }

}
