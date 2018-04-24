package br.com.oiseau.testemvc.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.oiseau.testemvc.jdbc.dao.ItemDao;
import br.com.oiseau.testemvc.modelo.Item;

@Controller
public class ItemController {

	@RequestMapping(value="/",method=RequestMethod.GET)
	public String home() {
		return "home";
	}
	
	@RequestMapping(value="welcome",method=RequestMethod.GET)
	public String welcome(Model m) {
		m.addAttribute("name","Thiago");
		return "welcome";
	}
	
	@RequestMapping(value = "AdicionaItem", method = RequestMethod.POST)
	public String adicionaItem(@Valid Item item, BindingResult	result) {
		
		if (result.hasFieldErrors()) {
			return "item/AdicionaFormulario";
		}	
		
		ItemDao itemDao = new ItemDao();
		itemDao.adiciona(item);
		return "redirect:AdicionaFormulario";
	}
	
	@RequestMapping(value="AdicionaFormulario", method=RequestMethod.GET)
	public String formularioAdicionaItem() {
		return "item/AdicionaFormulario";
	}
	
	@RequestMapping(value="ListaItens", method=RequestMethod.GET)
	public String ListaItens(Model model) {
		ItemDao itemDao=new ItemDao();
		model.addAttribute("itens",itemDao.getLista());
		return "item/ListaItens";
	}
	
	@RequestMapping(value="RemoveItem", method=RequestMethod.GET)
	public String RemoveItem(Item item) {
		ItemDao itemDao=new ItemDao();
		itemDao.exclui(item);
		return "redirect:ListaItens";
	}
	
	@RequestMapping(value="MostraItem", method=RequestMethod.GET)
	public String MostrarItem(Item item, Model model) {
		ItemDao itemDao=new ItemDao();
		model.addAttribute("item",itemDao.buscaPorId(item.getId()));
		return "item/MostraItem";
	}
	@RequestMapping(value="AtualizaItem", method=RequestMethod.POST)
	public String AtualizaItem(Item item) {
		ItemDao itemDao=new ItemDao();
		itemDao.atualiza(item);
		return "redirect:ListaItens";
	}
}
