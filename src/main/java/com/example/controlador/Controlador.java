package com.example.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controlador {

	@RequestMapping("/")
	public String greeting(Model model) {

		model.addAttribute("s", "hola");
		System.out.println("hola mundo entro");
		return "hola";
	}
}
