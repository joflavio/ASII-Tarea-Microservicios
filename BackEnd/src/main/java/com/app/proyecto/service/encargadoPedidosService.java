package com.app.proyecto.service;

//import java.util.LinkedList;
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

//import com.app.proyecto.entity.direccionEncargado;
import com.app.proyecto.entity.encargadoPedidos;
//import com.app.proyecto.entity.telefonoEncargado;
//import com.app.proyecto.repository.direccionEncargadoRepository;
import com.app.proyecto.repository.encargadoPedidosRepository;
//import com.app.proyecto.repository.telefonoEncargadoRepository;

@RestController
@RequestMapping("/usuario")
@CrossOrigin
public class encargadoPedidosService {
	
	@Autowired
	encargadoPedidosRepository encargadoPedidosRepository; 
	/*
	@Autowired
	telefonoEncargadoRepository telefonoEncargadoRepository;
	
	@Autowired
	direccionEncargadoRepository direccionEncargadoRepository;*/
	
	@PostMapping(path = "/login")
	
	public encargadoPedidos login(@RequestBody encargadoPedidos encargadoPedidos) {
		
		List<encargadoPedidos> usuarios = encargadoPedidosRepository.findByUsuarioAndPassword(encargadoPedidos.getUsuario(), encargadoPedidos.getPassword());
		
		if(!usuarios.isEmpty()) {
			return usuarios.get(0);
		}
		return null;
	}
	
	@PostMapping(path = "/guardar")
	public encargadoPedidos saveUsuario(@RequestBody encargadoPedidos encargadoPedidos){
		/*
		List<telefonoEncargado> telefonoE = encargadoPedidos.getTelefonoEncargadoList();
		List<direccionEncargado> direccionE = encargadoPedidos.getDireccionEncargadoList();
		
		encargadoPedidos.setTelefonoEncargadoList(null);
		encargadoPedidos.setDireccionEncargadoList(null);
		*/
		encargadoPedidos = encargadoPedidosRepository.save(encargadoPedidos);
		/*
		encargadoPedidos.setTelefonoEncargadoList(new LinkedList<>());
		if(telefonoE != null) {
			for(telefonoEncargado telE : telefonoE) {
				telE.setEncargadoPedidos_idencargadoPedidos(encargadoPedidos.getIdencargado_pedidos());
				telefonoEncargadoRepository.save(telE);
				encargadoPedidos.getTelefonoEncargadoList().add(telE);
			}
		}
		
		encargadoPedidos.setDireccionEncargadoList(new LinkedList<>());
		if(direccionE != null) {
			for(direccionEncargado dirE : direccionE) {
				dirE.setEncargadoPedidos_idencargadoPedidos(encargadoPedidos.getIdencargado_pedidos());
				direccionEncargadoRepository.save(dirE);
				encargadoPedidos.getDireccionEncargadoList().add(dirE);
			}
		}
		*/
		Optional<encargadoPedidos> encargadoPedidosR;
		encargadoPedidosR = encargadoPedidosRepository.findById(encargadoPedidos.getIdencargado_pedidos());
		
		if(encargadoPedidosR.isPresent()) {
			encargadoPedidos = encargadoPedidosR.get();
		}
		
		return encargadoPedidos;
	}
	
	@GetMapping(path = "/buscar")
		
		public List<encargadoPedidos> getAllEncargadoPedidos(){
		return encargadoPedidosRepository.findAll();
		
		//public List<encargadoPedidos> findByUsuario(@PathVariable("usuario") String usuario){
		//return encargadoPedidosRepository.findByUsuario(usuario); 
	}
		
		@DeleteMapping(path = "/eliminar/{idusuario}")
		public void deleteUsuario(@PathVariable("idusuario") Integer idusuario) {
			Optional<encargadoPedidos> usuarioDlt;
			usuarioDlt = encargadoPedidosRepository.findById(idusuario);
			
			if(usuarioDlt.isPresent()) {
				encargadoPedidos borrar = usuarioDlt.get();
				/*
				for(telefonoEncargado telE: borrar.getTelefonoEncargadoList()){
					telefonoEncargadoRepository.delete(telE);
				}
				for(direccionEncargado dirE: borrar.getDireccionEncargadoList()){
					direccionEncargadoRepository.delete(dirE);
				}*/
				encargadoPedidosRepository.delete(usuarioDlt.get());
			}
		}			
}
