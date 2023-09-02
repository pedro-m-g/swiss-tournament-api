package com.pmg.swisstournament.services;

import org.springframework.stereotype.Service;

import com.pmg.swisstournament.models.Tournament;
import com.pmg.swisstournament.repositories.TournamentsRepository;

@Service
public class TournamentsService {

  private final TournamentsRepository tournamentsRepository;

  public TournamentsService(TournamentsRepository tournamentsRepository) {
    this.tournamentsRepository = tournamentsRepository;
  }

  public Iterable<Tournament> getAllTournaments() {
    return tournamentsRepository.findAll();
  }

}
