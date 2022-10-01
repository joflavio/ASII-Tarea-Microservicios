package com.app.proyecto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.proyecto.entity.producto;
import com.app.proyecto.repository.productoRepository;

@RestController
@RequestMapping("/producto")
@CrossOrigin
public class productoService {

	@Autowired
	productoRepository productoRepository;
	
	@GetMapping(path = "/buscar")
	public List<producto> getAllProductos(){
		return productoRepository.findAll();
	}
	
	@PostMapping(path = "/guardar")
	public producto saveProducto(@RequestBody producto producto) {
		return productoRepository.save(producto);
	}
	
	@DeleteMapping(path = "/eliminar/{idproducto}")
	public void deleteproducto(@PathVariable("idproducto") Integer idproducto) {
		Optional<producto> producto;
		
		producto = productoRepository.findById(idproducto);
		
		if(producto.isPresent()) {
			productoRepository.delete(producto.get());
		}
	}
}
