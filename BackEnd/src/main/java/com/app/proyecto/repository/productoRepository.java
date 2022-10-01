package com.app.proyecto.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.proyecto.entity.producto;

@Repository("productoRepository")
public interface productoRepository extends JpaRepository<producto, Serializable>{

}
