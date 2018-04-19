package br.com.oiseau.testemvc.modelo;

import java.math.BigDecimal;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Item {

	private long id;
	
	@Size(min=5,message="O nome deve conter cinco carateres no mínimo.")
	@Pattern(regexp = "^[A-Za-z]+$", message="O nome deve conter letras somente.")
	private String nome;
	
	private String descricao;
	
	@Digits(integer = 6, fraction = 2,message = "{javax.validation.constraints.Digits.message}")
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
