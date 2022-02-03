package com.example.productocrud.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.validation.Valid;

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
	
	@GetMapping("/nuevo")
	public String agregar(Model model) {
		model.addAttribute("producto", new Producto());
		return "form";
	}

	@PostMapping("/guardar")
	public String save(@Valid Producto p, Model model) {
		service.guardar(p);
		return "redirect:/carrito";
	}
	
	@GetMapping("/editar/{referencia}")
	public String editar(@PathVariable int referencia, Model model) {
		Optional<Producto> producto = service.listarRef(referencia);
		model.addAttribute("producto", producto);
		return "form";
	}
	
	@GetMapping("/eliminar/{referencia}")
	public String eliminar(Model model, @PathVariable int referencia) {
		service.eliminar(referencia);
		return "redirect:/carrito";
	}
}
