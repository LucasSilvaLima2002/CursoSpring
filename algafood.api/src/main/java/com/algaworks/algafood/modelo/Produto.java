package com.algaworks.algafood.modelo;

import java.math.BigDecimal;

public class Produto {
	
	private String nome;
	private BigDecimal valorTotal;
	private BigDecimal teste = new BigDecimal(0.2);
	
	public Produto(String nome, BigDecimal valorTotal) {
		this.nome = nome;
		this.valorTotal = valorTotal;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getvalorTotal() {
		return valorTotal;
	}

	public void setvalorTotal(BigDecimal preco) {
		this.valorTotal = preco;
	}

	
}
