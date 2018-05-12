package br.com.oiseau.testemvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class VendaController {
	
	@RequestMapping(value="Venda",method=RequestMethod.GET)
	public String venda() {
		return "/venda/venda";
	}

}
