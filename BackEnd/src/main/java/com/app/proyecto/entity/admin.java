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
@Table(name = "admin")
public class admin implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "idadmin")
	private Integer idadmin;
	
	@Column(name = "usuarioAdm")
	private String usuarioAdm;
	
	@Column(name = "passwordAdm")
	private String passwordAdm;
	
	public String getUsuarioAdm() {
		return usuarioAdm;
	}

	public void setUsuarioAdm(String usuarioAdm) {
		this.usuarioAdm = usuarioAdm;
	}

	
	public Integer getIdadmin() {
		return idadmin;
	}

	public void setIdadmin(Integer idadmin) {
		this.idadmin = idadmin;
	}


	public String getPasswordAdm() {
		return passwordAdm;
	}

	public void setPasswordAdm(String passwordAdm) {
		this.passwordAdm = passwordAdm;
	}

}
