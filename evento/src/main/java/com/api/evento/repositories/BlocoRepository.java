package com.api.evento.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.evento.entities.BlocoEntities;

public interface BlocoRepository extends JpaRepository<BlocoEntities, Long>{

}
