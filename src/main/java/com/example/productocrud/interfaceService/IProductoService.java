package com.example.productocrud.interfaceService;

import java.util.List;
import java.util.Optional;

import com.example.productocrud.model.Producto;

public interface IProductoService {

	public List<Producto> listar();
	public Optional<Producto> listarRef(int referencia);
	public int guardar(Producto p);
	public void eliminar(int referencia);
}
