package com.pmg.swisstournament.models;

import java.time.Instant;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Tournament {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  @Temporal(TemporalType.DATE)
  private Instant createdAt;

  @OneToMany(mappedBy = "tournament", cascade = CascadeType.PERSIST)
  private Iterable<Participant> participants;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Instant getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Instant createdAt) {
    this.createdAt = createdAt;
  }

  public Iterable<Participant> getParticipants() {
    return participants;
  }

  public void setParticipants(Iterable<Participant> participants) {
    this.participants = participants;
  }

}
