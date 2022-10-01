package com.app.proyecto.entity;

import java.io.Serializable;
//import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "encargado_pedidos")
public class encargadoPedidos implements Serializable{

	private static final long serialVersionUID = 12L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "idencargado_pedidos")
	private Integer idencargado_pedidos;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "usuario")
	private String usuario;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "rol_idrol")
	private Integer rol_idrol;
	
	/*
	@OneToMany(mappedBy = "encargadoPedidos_idencargadoPedidos")
	private List<direccionEncargado> direccionEncargadoList;
	
	@OneToMany(mappedBy = "encargadoPedidos_idencargadoPedidos")
	private List<telefonoEncargado> telefonoEncargadoList;
	*/
	
	public Integer getIdencargado_pedidos() {
		return idencargado_pedidos;
	}

	public void setIdencargado_pedidos(Integer idencargado_pedidos) {
		this.idencargado_pedidos = idencargado_pedidos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public Integer getRol_idrol() {
		return rol_idrol;
	}

	public void setRol_idrol(Integer rol_idrol) {
		this.rol_idrol = rol_idrol;
	}
	
	/*
	public List<direccionEncargado> getDireccionEncargadoList() {
		return direccionEncargadoList;
	}

	public void setDireccionEncargadoList(List<direccionEncargado> direccionEncargadoList) {
		this.direccionEncargadoList = direccionEncargadoList;
	}

	public List<telefonoEncargado> getTelefonoEncargadoList() {
		return telefonoEncargadoList;
	}

	public void setTelefonoEncargadoList(List<telefonoEncargado> telefonoEncargadoList) {
		this.telefonoEncargadoList = telefonoEncargadoList;
	}
	*/
}
