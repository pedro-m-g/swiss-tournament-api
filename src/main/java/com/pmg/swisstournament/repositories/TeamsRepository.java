package com.pmg.swisstournament.repositories;

import org.springframework.data.repository.CrudRepository;

import com.pmg.swisstournament.models.Team;

public interface TeamsRepository extends CrudRepository<Team, Integer> {

}
