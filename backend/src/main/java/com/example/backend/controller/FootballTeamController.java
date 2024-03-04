package com.example.backend.controller;


import com.example.backend.entity.FootballTeam;
import com.example.backend.service.FootballTeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.net.URI;
import java.util.Collection;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class FootballTeamController {
    private final FootballTeamService footballTeamService;


    @GetMapping("/footballteams")
    public ResponseEntity<Collection<FootballTeam>> getAllTeams() {
        return ResponseEntity.ok().body(footballTeamService.getAllTeams());
    }

    @GetMapping("/footballteam/{id}")
    public ResponseEntity<FootballTeam> getFootballTeam(@PathVariable String id) {
        FootballTeam footballTeam = footballTeamService.getFootballTeam(id);
        return ResponseEntity.status(HttpStatus.OK).body(footballTeam);
    }

    @PostMapping("/footballteam/create")
    public ResponseEntity<FootballTeam> createFootballTeam(@RequestBody FootballTeam footballTeam) {
        return ResponseEntity.created(URI.create("/footballteam/ID")).body(footballTeamService.createFootballTeam(footballTeam));
    }

   @DeleteMapping("/footballteam/{id}")
    public ResponseEntity<FootballTeam> deleteFootballTeam(@PathVariable String id) {
       return ResponseEntity.ok().body(footballTeamService.deleteFootballTeam(id));
   }

}
