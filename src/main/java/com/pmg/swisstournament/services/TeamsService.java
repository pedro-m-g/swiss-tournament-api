package com.pmg.swisstournament.services;

import org.springframework.stereotype.Service;

import com.pmg.swisstournament.models.Team;
import com.pmg.swisstournament.repositories.TeamsRepository;

@Service
public class TeamsService {

  private final TeamsRepository teamsRepository;

  public TeamsService(TeamsRepository teamsRepository) {
    this.teamsRepository = teamsRepository;
  }

  public Iterable<Team> getAllTeams() {
    return teamsRepository.findAll();
  }

}
