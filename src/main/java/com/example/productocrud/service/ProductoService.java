package com.example.productocrud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.productocrud.interfaceService.IProductoService;
import com.example.productocrud.interfaces.IProducto;
import com.example.productocrud.model.Producto;

@Service
public class ProductoService implements IProductoService {

	@Autowired
	private IProducto data;
	
	@Override
	public List<Producto> listar() {
		return (List<Producto>)data.findAll();
	}

	@Override
	public Optional<Producto> listarId(int ref) {
		return null;
	}

	@Override
	public int guardar(Producto p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void eliminar(int ref) {
		// TODO Auto-generated method stub
		
	}

	
}
