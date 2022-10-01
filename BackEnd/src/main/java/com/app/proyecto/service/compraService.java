package com.app.proyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.proyecto.entity.compra;
import com.app.proyecto.repository.compraRepository;

@RestController
@RequestMapping("/compra")
@CrossOrigin
public class compraService {

	@Autowired
	compraRepository compraRepository;
	
	@GetMapping(path = "/buscar")
	public List<compra> getAllCompras(){
		return compraRepository.findAll();
	}
	
	@PostMapping(path = "/guardar")
	public compra saveCompra(@RequestBody compra compra){
		return compraRepository.save(compra);
	}
	
}
