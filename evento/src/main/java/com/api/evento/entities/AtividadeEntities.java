package com.api.evento.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_atividades")
public class AtividadeEntities {
	
	@OneToMany(mappedBy ="atividade")
	private List<ParticipanteEntities> participante = new ArrayList<>();
	
	@ManyToOne
	@JoinColumn(name = "categoria_id")
	private CategoriaEntities categoria;
	
	@OneToOne
	@MapsId
	private BlocoEntities bloco;

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer Id;
	private String nome;
	@Column(columnDefinition = "TEXT")
	private String descricao;
	private Double preco;
    
	public AtividadeEntities() 
	{
		
	}

	public AtividadeEntities(Integer id, String nome, String descricao, Double preco) {
		Id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
}
	
		