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

import com.app.proyecto.repository.telefonoClienteRepository;
import com.app.proyecto.entity.cliente;
//import com.app.proyecto.entity.direccionCliente;
//import com.app.proyecto.entity.telefonoCliente;
import com.app.proyecto.repository.clienteRepository;
import com.app.proyecto.repository.direccionClienteRepository;

@RestController
@RequestMapping("/cliente")
@CrossOrigin
public class clienteService {

	@Autowired
	clienteRepository clienteRepository; 
	
	@Autowired
	telefonoClienteRepository telefonoClienteRepository;
	
	@Autowired
	direccionClienteRepository direccionClienteRepository;
	
	@PostMapping(path = "/guardar")
	public cliente saveUsuario(@RequestBody cliente cliente){
	/*	List<telefonoCliente> telefonoC = cliente.getTelefonoClienteList();
		List<direccionCliente> direccionC = cliente.getDireccionClienteList();
		
		cliente.setTelefonoClienteList(null);
		cliente.setDireccionClienteList(null);*/
		
		cliente = clienteRepository.save(cliente);
		/*
		cliente.setTelefonoClienteList(new LinkedList<>());
		if(telefonoC != null) {
			for(telefonoCliente telC : telefonoC) {
				telC.setCliente_idcorreo(cliente.getIdcorreo());
				telefonoClienteRepository.save(telC);
				cliente.getTelefonoClienteList().add(telC);
			}
		}
		
		cliente.setDireccionClienteList(new LinkedList<>());
		if(direccionC != null) {
			for(direccionCliente dirC : direccionC) {
				dirC.setCliente_idcorreo(cliente.getIdcorreo());
				direccionClienteRepository.save(dirC);
				cliente.getDireccionClienteList().add(dirC);
			}
		}
		*/
		Optional<cliente> clienteR;
		clienteR = clienteRepository.findById(cliente.getIdcorreo());
		
		if(clienteR.isPresent()) {
			cliente = clienteR.get();
		}
		
		return cliente;
	}
	
	@GetMapping(path = "/buscar")
		
		public List<cliente> getAllClientes(){
		return clienteRepository.findAll();
		
		//public List<cliente> findByUsuario(@PathVariable("idcorreo") String idcorreo){
		//return clienteRepository.findByIdcorreo(idcorreo); 
		
	}
	
	@DeleteMapping(path = "/eliminar/{idcorreo}")
	public void deletecliente(@PathVariable("idcorreo") String idcorreo) {
		Optional<cliente> clienteDlt;
		clienteDlt = clienteRepository.findById(idcorreo);
		
		if(clienteDlt.isPresent()) {
			cliente borrar = clienteDlt.get();
			/*
			for(telefonoCliente telC: borrar.getTelefonoClienteList()){
				telefonoClienteRepository.delete(telC);
			}
			for(direccionCliente dirC: borrar.getDireccionClienteList()){
				direccionClienteRepository.delete(dirC);
			}*/
			clienteRepository.delete(clienteDlt.get());
		}
	}		
}
