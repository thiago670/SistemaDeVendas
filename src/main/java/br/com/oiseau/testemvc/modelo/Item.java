package br.com.oiseau.testemvc.modelo;

import java.math.BigDecimal;

public class Item {

	private long id;
	private String nome;
	private String descricao;
	private BigDecimal precoUnitario;
	private String tipo;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public BigDecimal getPrecoUnitario() {
		return precoUnitario;
	}
	public void setPrecoUnitario(BigDecimal precoUnitario) {
		this.precoUnitario = precoUnitario;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
		
}
