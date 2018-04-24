package br.com.oiseau.testemvc.jdbc.dao;

import java.math.BigDecimal;
import java.util.List;

import org.junit.Test;

import br.com.oiseau.testemvc.modelo.Item;

public class ItemDaoTest {

	@Test	
	public void deveInserirRegistro() {
		System.out.println("Inserindo registro...");
		
		Item item =new Item();
		item.setNome("Teste");
		item.setDescricao("Unitário");
		item.setValor(new BigDecimal("15.0"));
		item.setTipo("Roupa");
				
		ItemDao itemDao = new ItemDao();
		itemDao.adiciona(item);

		System.out.println("Registro inserido com sucesso!");
		
	}
	
	@Test
	public void deveListar() {
		System.out.println("Listando os registros...");
		
		ItemDao itemDao = new ItemDao();
		List<Item> itens=itemDao.getLista();
		
		itens.forEach(c -> {
			System.out.println(
					"Id: "+c.getId()+
					"\nNome: "+ c.getNome()+
					"\nDescrição: "+c.getDescricao()+
					"\nPreço Unitário: "+c.getValor()+
					"\nTipo: "+c.getTipo()+"\n");
		});
		
		System.out.println("Registros listados com sucesso!");
		
	}
	
	@Test
	public void deveExcluir() {
		System.out.println("Excluindo registro...");
		
		Item item=new Item();
		item.setId(2);
		
		ItemDao itemDao=new ItemDao();
		itemDao.exclui(item);
		
		System.out.println("Registro excluído!");
		
	}
	
	@Test
	public void deveAtualizar() {
		
		System.out.println("Atualizando item...");
		
		Item item=new Item();
		item.setId(4);
		
		item.setNome("Anel");
		item.setDescricao("de Ouro");
		item.setValor(new BigDecimal("12.35"));
		item.setTipo("Bijoux");
		
		ItemDao itemDao=new ItemDao();
		itemDao.atualiza(item);
		
		System.out.println("Item Atualizado!");
	}
	
	@Test
	public void deveBuscarPorId() {

		ItemDao itemDao = new ItemDao();
		Item c = itemDao.buscaPorId(1);

		System.out.println("Id: " + c.getId() + "\nNome: " + c.getNome() + "\nDescrição: " + c.getDescricao()
				+ "\nPreço Unitário: " + c.getValor() + "\nTipo: " + c.getTipo() + "\n");
	}
	
}