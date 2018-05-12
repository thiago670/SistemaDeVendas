package br.com.oiseau.testemvc.modelo;

import java.math.BigDecimal;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Item {

	private String id;
	
	@Size(min=5,message="O nome deve conter cinco carateres no mínimo.")
	@Pattern(regexp = "^[A-Za-z]+$", message="O nome deve conter letras somente.")
	private String nome;
	
	private String descricao;
	private BigDecimal valor;
	private String tipo;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
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
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
	