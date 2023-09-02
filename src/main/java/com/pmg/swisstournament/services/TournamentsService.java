package com.pmg.swisstournament.services;

import java.time.Instant;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.stereotype.Service;

import com.pmg.swisstournament.forms.CreateTournamentForm;
import com.pmg.swisstournament.models.Participant;
import com.pmg.swisstournament.models.Team;
import com.pmg.swisstournament.models.Tournament;
import com.pmg.swisstournament.repositories.TeamsRepository;
import com.pmg.swisstournament.repositories.TournamentsRepository;

import jakarta.transaction.Transactional;

@Service
public class TournamentsService {

  private final TournamentsRepository tournamentsRepository;
  private final TeamsRepository teamsRepository;

  public TournamentsService(
    TournamentsRepository tournamentsRepository,
    TeamsRepository teamsRepository
  ) {
    this.tournamentsRepository = tournamentsRepository;
    this.teamsRepository = teamsRepository;
  }

  public Iterable<Tournament> getAllTournaments() {
    return tournamentsRepository.findAll();
  }

  @Transactional
  public Tournament createTournament(CreateTournamentForm form) {
    Tournament tournament = new Tournament();
    Iterable<Team> teams = teamsRepository.findAllById(form.getParticipants());
    Iterable<Participant> participants = StreamSupport
      .stream(teams.spliterator(), true)
      .map((Team team) -> createParticipant(team, tournament))
      .collect(Collectors.toSet());

    tournament.setCreatedAt(Instant.now());
    tournament.setParticipants(participants);

    return tournamentsRepository.save(tournament);
  }

  private Participant createParticipant(Team team, Tournament tournament) {
    Participant participant = new Participant();
    participant.setTeam(team);
    participant.setTournament(tournament);
    return participant;
  }

}
