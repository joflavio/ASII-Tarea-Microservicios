package com.app.proyecto.entity;

import java.io.Serializable;
//import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class cliente implements Serializable{

	private static final long serialVersionUID = 5L;
	
	@Id
	@Basic(optional = false)
	@Column(name = "idcorreo")
	private String idcorreo;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "NIT")
	private String NIT;
	/*
	@OneToMany(mappedBy = "cliente_idcorreo")
	private List<direccionCliente> direccionClienteList;
	
	@OneToMany(mappedBy = "cliente_idcorreo")
	private List<telefonoCliente> telefonoClienteList;
	*/
	public String getIdcorreo() {
		return idcorreo;
	}

	public void setIdcorreo(String idcorreo) {
		this.idcorreo = idcorreo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNIT() {
		return NIT;
	}

	public void setNIT(String nIT) {
		NIT = nIT;
	}
	/*
	public List<direccionCliente> getDireccionClienteList() {
		return direccionClienteList;
	}

	public void setDireccionClienteList(List<direccionCliente> direccionClienteList) {
		this.direccionClienteList = direccionClienteList;
	}

	public List<telefonoCliente> getTelefonoClienteList() {
		return telefonoClienteList;
	}

	public void setTelefonoClienteList(List<telefonoCliente> telefonoClienteList) {
		this.telefonoClienteList = telefonoClienteList;
	}
	*/

}
