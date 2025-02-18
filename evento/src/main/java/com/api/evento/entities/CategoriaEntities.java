package com.api.evento.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_categoria")
public class CategoriaEntities {
	
	@OneToMany(mappedBy = "categoria")
	private List<AtividadeEntities> atividades = new ArrayList<>();
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer Id;
	@Column(columnDefinition = "TEXT")
	private String descricao;
	
	public CategoriaEntities() 
	{
		
	}

	public CategoriaEntities(Integer id, String descricao) {
		Id = id;
		this.descricao = descricao;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	

}
