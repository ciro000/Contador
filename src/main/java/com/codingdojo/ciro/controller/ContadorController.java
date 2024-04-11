                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          package com.codingdojo.ciro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class ContadorController {

	
	@GetMapping("/")
	public String welcome(HttpSession sesion,
						Model model) {
		Integer count = (Integer) sesion.getAttribute("count");
		
		if(count == null) {
			sesion.setAttribute("count", 0);
		}
		else {
			count++;
			sesion.setAttribute("count", count);
		}
		
		model.addAttribute("Mensaje", "hola");
		
		return "index.jsp";
		
	}
	
	@GetMapping("/double")
	public String doubleCount(HttpSession sesion) {
		Integer count = (Integer) sesion.getAttribute("count");
		
		if(count == null) {
			sesion.setAttribute("count", 0);
		}
		else {
			count+=2;
			sesion.setAttribute("count", count);
		}
		
		return "double.jsp";
	}
	
	
	@GetMapping("/counter")
	public String counter(HttpSession sesion) {
	
		return "counter.jsp";
	}
	
	@GetMapping("/reset")
	public String reset(HttpSession sesion) {
		sesion.invalidate();
		return "redirect:/counter";
	}
}
