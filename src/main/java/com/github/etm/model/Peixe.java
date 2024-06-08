package com.github.etm.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;

public class Peixe {
	
	@Column(nullable = false, length = 50, unique = true)
	private String nome;
	
	@Column(length = 300)
	private String descricao;
	
	@Column(nullable = false)
	private double pesoMaximo;
	
	@Column(nullable = false)
	private LocalDateTime dataCatalogacao;

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

	public double getPesoMaximo() {
		return pesoMaximo;
	}

	public void setPesoMaximo(double pesoMaximo) {
		this.pesoMaximo = pesoMaximo;
	}

	public LocalDateTime getDataCatalogacao() {
		return dataCatalogacao;
	}

	public void setDataCatalogacao(LocalDateTime dataCatalogacao) {
		this.dataCatalogacao = dataCatalogacao;
	}

}
