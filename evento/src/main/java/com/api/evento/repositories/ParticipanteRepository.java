package com.api.evento.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.evento.entities.ParticipanteEntities;

public interface ParticipanteRepository extends JpaRepository<ParticipanteEntities, Long>{

}
