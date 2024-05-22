package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "admin")
public class WebAdmin {
	@GetMapping("/index")
	public String adminIndexTemplate(Model model, HttpSession session) {
		// Obtener el usuario logeado de la sesión

		return "index-admin";
	}
}
