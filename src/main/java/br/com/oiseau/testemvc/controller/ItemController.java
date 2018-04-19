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
		
}
