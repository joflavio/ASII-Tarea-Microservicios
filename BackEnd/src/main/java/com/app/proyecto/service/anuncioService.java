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

import com.app.proyecto.entity.anuncio;
import com.app.proyecto.repository.anuncioRepository;


@RestController
@RequestMapping("/anuncio")
@CrossOrigin
public class anuncioService {

	@Autowired
	anuncioRepository anuncioRepository;
	
	@GetMapping(path = "/buscar")
	public List<anuncio> getAllAnuncios(){
		return anuncioRepository.findAll();
	}
	
	@PostMapping(path = "/guardar")
	public anuncio saveAnuncio(@RequestBody anuncio anuncio) {
		return anuncioRepository.save(anuncio);
	}
	
	@DeleteMapping(path = "/eliminar/{idanuncio}")
	public void deleteanuncio(@PathVariable("idanuncio") Integer idanuncio) {
		Optional<anuncio> anuncio;
		
		anuncio = anuncioRepository.findById(idanuncio);
		
		if(anuncio.isPresent()) {
			anuncioRepository.delete(anuncio.get());
		}
	}
	
}
