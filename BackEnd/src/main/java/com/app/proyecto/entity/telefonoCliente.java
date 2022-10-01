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
@Table(name = "telefono_cliente")
public class telefonoCliente implements Serializable{

	private static final long serialVersionUID = 6L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "idtelefono_cliente")
	private Integer idtelefono_cliente;
	
	
	public Integer getIdtelefono_cliente() {
		return idtelefono_cliente;
	}

	public void setIdtelefono_cliente(Integer idtelefono_cliente) {
		this.idtelefono_cliente = idtelefono_cliente;
	}

	public String getTelefono_cliente() {
		return telefono_cliente;
	}

	public void setTelefono_cliente(String telefono_cliente) {
		this.telefono_cliente = telefono_cliente;
	}

	public String getCliente_idcorreo() {
		return cliente_idcorreo;
	}

	public void setCliente_idcorreo(String cliente_idcorreo) {
		this.cliente_idcorreo = cliente_idcorreo;
	}

	@Column(name = "telefono_cliente")
	private String telefono_cliente;
	
	@Column(name = "cliente_idcorreo")
	private String cliente_idcorreo;

}
