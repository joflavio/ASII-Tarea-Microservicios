package com.app.proyecto.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.proyecto.entity.telefonoCliente;

@Repository("telefonoClienteRepository")
public interface telefonoClienteRepository extends JpaRepository<telefonoCliente, Serializable>{

}
