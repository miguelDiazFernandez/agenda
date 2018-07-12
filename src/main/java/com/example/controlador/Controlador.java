package com.example.controlador;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.modelo.Categoria;
import com.example.modelo.Empleado;
import com.example.servicios.IServicios;
import com.example.servicios.Servicios;



@Controller
public class Controlador {

	@Autowired
	private IServicios userService ;
	
	@RequestMapping("/")
	public String greeting(Model model) {
		List<Categoria> listEmple = userService.getListEmpleados(); 
		for(int i =0;i<listEmple.size();i++){
			System.out.println(listEmple.size());
		}
		model.addAttribute("s", "hola");		
		return "hola";
	}
		
}
