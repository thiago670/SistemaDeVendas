package br.com.oiseau.testemvc.modelo;

public class Venda {
	
	/*
	 * Descrição das ações de uma venda
	 * 
	 * 1 Pega itens
	 * 2 Soma os itens
	 * 3 Informa o desconto
	 * 4 Define a forma de pagamento
	 * 5 Recebe pagamento (Cartão - Crédito ou Débito, Dinheiro ou Ficha)
	 * 6 --------------
	 * 7 Computa a venda no montante do mês.
	 */

	private String formaDePagamento;
	private double desconto;
	
	public String getFormaDePagamento() {
		return formaDePagamento;
	}
	public void setFormaDePagamento(String formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}
	public double getDesconto() {
		return desconto;
	}
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	
	
	
}
