package com.app.proyecto.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.proyecto.entity.cliente;

@Repository("clienteRepository")
public interface clienteRepository extends JpaRepository<cliente, Serializable>{

	public List<cliente>findByIdcorreo(String idcorreo);
	
}
