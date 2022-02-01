package com.example.productocrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.productocrud.interfaceService.IProductoService;
import com.example.productocrud.model.Producto;

@Controller
@RequestMapping
public class Controlador {

	@Autowired
	private IProductoService service;
	
	@GetMapping("/carrito")
	public String listar(Model model) {
		List<Producto> productos = service.listar();
		model.addAttribute("productos", productos);
		return "index";
	}
}
