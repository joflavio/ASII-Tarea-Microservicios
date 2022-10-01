package com.app.proyecto.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.proyecto.entity.encargadoPedidos;

@Repository("encargadoPedidosRepository")
public interface encargadoPedidosRepository extends JpaRepository<encargadoPedidos, Serializable> {

	public List<encargadoPedidos>findByUsuarioAndPassword(String usuario, String password);
	public List<encargadoPedidos>findByUsuario(String usuario);
	
	
}
