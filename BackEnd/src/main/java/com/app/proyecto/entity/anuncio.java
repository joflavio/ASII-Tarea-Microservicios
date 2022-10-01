package com.app.proyecto.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "anuncio")
public class anuncio implements Serializable{

	private static final long serialVersionUID = 11L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "idanuncio")
	private Integer idanuncio;
	
	@Column(name = "informacion")
	private String informacion;
	
	@Lob
	@Column(name = "imagenA")
	private String imagenA;
	
	@Temporal(value = TemporalType.TIMESTAMP)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
	@Column(name = "fecha_inicio")
	private Date fecha_inicio;
	
	@Temporal(value = TemporalType.TIMESTAMP)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
	@Column(name = "fecha_fin")
	private Date fecha_fin;

	public Integer getIdanuncio() {
		return idanuncio;
	}

	public void setIdanuncio(Integer idanuncio) {
		this.idanuncio = idanuncio;
	}

	public String getInformacion() {
		return informacion;
	}

	public void setInformacion(String informacion) {
		this.informacion = informacion;
	}

	public String getImagenA() {
		return imagenA;
	}

	public void setImagenA(String imagenA) {
		this.imagenA = imagenA;
	}

	public Date getFecha_inicio() {
		return fecha_inicio;
	}

	public void setFecha_inicio(Date fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}

	public Date getFecha_fin() {
		return fecha_fin;
	}

	public void setFecha_fin(Date fecha_fin) {
		this.fecha_fin = fecha_fin;
	}



}
