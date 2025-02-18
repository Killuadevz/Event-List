package com.api.evento.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.evento.entities.AtividadeEntities;

public interface AtividadeRepository extends JpaRepository<AtividadeEntities, Long> { }
