package com.example.productocrud.interfaces;

import org.springframework.data.repository.CrudRepository;

import com.example.productocrud.model.Producto;

public interface IProducto extends CrudRepository<Producto, Integer>{

}
