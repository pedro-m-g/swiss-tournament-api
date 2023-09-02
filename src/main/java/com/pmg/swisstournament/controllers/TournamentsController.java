package com.pmg.swisstournament.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pmg.swisstournament.forms.CreateTournamentForm;
import com.pmg.swisstournament.models.Tournament;
import com.pmg.swisstournament.services.TournamentsService;

@RestController
@RequestMapping("tournaments")
public class TournamentsController {

  private final TournamentsService tournamentsService;

  public TournamentsController(TournamentsService tournamentsService) {
    this.tournamentsService = tournamentsService;
  }

  @GetMapping("")
  public Iterable<Tournament> getAllTournaments() {
    return tournamentsService.getAllTournaments();
  }

  @PostMapping("")
  public Tournament createTournament(CreateTournamentForm form) {
    return tournamentsService.createTournament(form);
  }

}
