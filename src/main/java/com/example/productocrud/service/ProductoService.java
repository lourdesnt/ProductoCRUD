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
	public Optional<Producto> listarRef(int ref) {
		return data.findById(ref);
	}

	@Override
	public int guardar(Producto p) {
		int res = 0;
		Producto producto = data.save(p);
		if (!producto.equals(null)) {
			res = 1;
		}
		return res;
	}

	@Override
	public void eliminar(int ref) {
		data.deleteById(ref);
	}

	
}
