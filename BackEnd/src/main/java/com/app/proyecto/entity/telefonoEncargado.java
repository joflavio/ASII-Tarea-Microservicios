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
@Table(name = "telefono_encargado")
public class telefonoEncargado implements Serializable{

	private static final long serialVersionUID = 4L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "idtelefono_encargado")
	private Integer idtelefono_encargado;
	

	public Integer getIdtelefono_encargado() {
		return idtelefono_encargado;
	}

	public void setIdtelefono_encargado(Integer idtelefono_encargado) {
		this.idtelefono_encargado = idtelefono_encargado;
	}

	public String getTelefonoE() {
		return telefonoE;
	}

	public void setTelefonoE(String telefonoE) {
		this.telefonoE = telefonoE;
	}

	public Integer getEncargadoPedidos_idencargadoPedidos() {
		return encargadoPedidos_idencargadoPedidos;
	}

	public void setEncargadoPedidos_idencargadoPedidos(Integer encargadoPedidos_idencargadoPedidos) {
		this.encargadoPedidos_idencargadoPedidos = encargadoPedidos_idencargadoPedidos;
	}

	@Column(name = "telefonoE")
	private String telefonoE;
	
	@Column(name = "encargadoPedidos_idencargadoPedidos")
	private Integer encargadoPedidos_idencargadoPedidos;

}
