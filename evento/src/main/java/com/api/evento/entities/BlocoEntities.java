package com.api.evento.entities;

import java.time.Instant;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_bloco")
public class BlocoEntities {
	
	@OneToOne(mappedBy ="bloco", cascade = CascadeType.ALL)
	private AtividadeEntities atividade;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer Id;
	private Instant inicio;
	private Instant fim;
	
	public BlocoEntities() {
		
	}

	public BlocoEntities(Integer id, Instant inicio, Instant fim) {
		Id = id;
		this.inicio = inicio;
		this.fim = fim;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public Instant getInicio() {
		return inicio;
	}

	public void setInicio(Instant inicio) {
		this.inicio = inicio;
	}

	public Instant getFim() {
		return fim;
	}

	public void setFim(Instant fim) {
		this.fim = fim;
	}
	
	

	
}
