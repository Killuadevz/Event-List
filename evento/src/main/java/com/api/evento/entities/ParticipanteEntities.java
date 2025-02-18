package com.api.evento.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_participante")
public class ParticipanteEntities {
	
	@ManyToOne
	@JoinColumn(name="atividade_id")
	private AtividadeEntities atividade;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer Id;
	@Column(columnDefinition = "TEXT")
	private String nome;
	private String email;
	
	public ParticipanteEntities() {
		
	}

	public ParticipanteEntities(Integer id, String nome, String email) {
		Id = id;
		this.nome = nome;
		this.email = email;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	

}
