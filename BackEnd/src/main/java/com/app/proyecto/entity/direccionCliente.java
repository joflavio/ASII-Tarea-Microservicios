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
@Table(name = "direccion_cliente")
public class direccionCliente implements Serializable{

	private static final long serialVersionUID = 7L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "iddireccion_cliente")
	private Integer iddireccion_cliente;
	
	
	public Integer getIddireccion_cliente() {
		return iddireccion_cliente;
	}

	public void setIddireccion_cliente(Integer iddireccion_cliente) {
		this.iddireccion_cliente = iddireccion_cliente;
	}

	public String getDireccion_cliente() {
		return direccion_cliente;
	}

	public void setDireccion_cliente(String direccion_cliente) {
		this.direccion_cliente = direccion_cliente;
	}

	public String getCliente_idcorreo() {
		return cliente_idcorreo;
	}

	public void setCliente_idcorreo(String cliente_idcorreo) {
		this.cliente_idcorreo = cliente_idcorreo;
	}

	@Column(name = "direccion_cliente")
	private String direccion_cliente;
	
	@Column(name = "cliente_idcorreo")
	private String cliente_idcorreo;

}
