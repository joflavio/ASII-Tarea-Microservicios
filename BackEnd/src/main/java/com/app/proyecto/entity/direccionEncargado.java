package com.app.proyecto.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "direccion_encargado")
public class direccionEncargado implements Serializable{

	private static final long serialVersionUID = 3L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "iddireccion_encargado")
	private Integer iddireccion_encargado;
	


	public Integer getIddireccion_encargado() {
		return iddireccion_encargado;
	}

	public void setIddireccion_encargado(Integer iddireccion_encargado) {
		this.iddireccion_encargado = iddireccion_encargado;
	}

	public String getDireccionE() {
		return direccionE;
	}

	public void setDireccionE(String direccionE) {
		this.direccionE = direccionE;
	}

	public Integer getEncargadoPedidos_idencargadoPedidos() {
		return encargadoPedidos_idencargadoPedidos;
	}

	public void setEncargadoPedidos_idencargadoPedidos(Integer encargadoPedidos_idencargadoPedidos) {
		this.encargadoPedidos_idencargadoPedidos = encargadoPedidos_idencargadoPedidos;
	}

	@Column(name = "direccionE")
	private String direccionE;
	
	@Column(name = "encargadoPedidos_idencargadoPedidos")
	private Integer encargadoPedidos_idencargadoPedidos;

}
