package com.app.proyecto.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "producto")
public class producto implements Serializable{

	private static final long serialVersionUID = 8L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "idproducto")
	private Integer idproducto;
	
	@Column(name = "nombre_producto")
	private String nombre_producto;
	
	@Column(name = "descripcion_producto")
	private String descripcion_producto;
	
	@Column(name = "costo_unitario")
	private Double costo_unitario;
	
	@Lob
	@Column(name = "imagen")
	private String imagen;
	
	@Column(name = "cantidad_disponible")
	private Integer cantidad_disponible;

	//@Column(name = "cant")
	//private Integer cant;
	
	public Integer getIdproducto() {
		return idproducto;
	}

	public void setIdproducto(Integer idproducto) {
		this.idproducto = idproducto;
	}

	public String getNombre_producto() {
		return nombre_producto;
	}

	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}

	public String getDescripcion_producto() {
		return descripcion_producto;
	}

	public void setDescripcion_producto(String descripcion_producto) {
		this.descripcion_producto = descripcion_producto;
	}

	public Double getCosto_unitario() {
		return costo_unitario;
	}

	public void setCosto_unitario(Double costo_unitario) {
		this.costo_unitario = costo_unitario;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}


	public Integer getCantidad_disponible() {
		return cantidad_disponible;
	}

	public void setCantidad_disponible(Integer cantidad_disponible) {
		this.cantidad_disponible = cantidad_disponible;
	}
	/*
	public Integer getCant() {
		return cant;
	}

	public void setCant(Integer cant) {
		this.cant = cant;
	}*/
}
