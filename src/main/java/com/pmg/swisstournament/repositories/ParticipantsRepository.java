package com.pmg.swisstournament.repositories;

import org.springframework.data.repository.CrudRepository;

import com.pmg.swisstournament.models.Participant;

public interface ParticipantsRepository extends CrudRepository<Participant, Integer> {

}
