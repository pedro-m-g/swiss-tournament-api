package com.pmg.swisstournament.repositories;

import org.springframework.data.repository.CrudRepository;

import com.pmg.swisstournament.models.Tournament;

public interface TournamentsRepository extends CrudRepository<Tournament, Integer> {

}
