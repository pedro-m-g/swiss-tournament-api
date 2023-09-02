package com.pmg.swisstournament.forms;

import java.util.List;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class CreateTournamentForm {

  @NotNull
  @Size(min = 2, max = 512)
  private List<Integer> participants;

  public List<Integer> getParticipants() {
    return participants;
  }

  public void setParticipants(List<Integer> participants) {
    this.participants = participants;
  }

}
