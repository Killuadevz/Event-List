package com.api.evento.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.evento.entities.CategoriaEntities;

public interface CategoriaRepository extends JpaRepository<CategoriaEntities, Long>{ }
