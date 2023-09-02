package com.pmg.swisstournament.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pmg.swisstournament.models.Team;
import com.pmg.swisstournament.services.TeamsService;

@RestController
@RequestMapping("/teams")
public class TeamsController {

  private final TeamsService teamsService;

  public TeamsController(TeamsService teamsService) {
    this.teamsService = teamsService;
  }

  @GetMapping("")
  public Iterable<Team> getAllTeams() {
    return teamsService.getAllTeams();
  }

}
