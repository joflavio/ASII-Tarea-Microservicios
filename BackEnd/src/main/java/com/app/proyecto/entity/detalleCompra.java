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
@Table(name = "detalleCompra")
public class detalleCompra implements Serializable{

	private static final long serialVersionUID = 9L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "iddetalleCompra")
	private Integer iddetalleCompra;
	
	@Column(name = "cantidadDC")
	private Integer cantidadDC;
	
	@Column(name = "subTotal")
	private Double subTotal;
	
	@Column(name = "producto_idproducto")
	private Integer producto_idproducto;
	
	@Column(name = "compra_idcompra")
	private Integer compra_idcompra;

	public Integer getIddetalleCompra() {
		return iddetalleCompra;
	}

	public void setIddetalleCompra(Integer iddetalleCompra) {
		this.iddetalleCompra = iddetalleCompra;
	}

	public Integer getCantidadDC() {
		return cantidadDC;
	}

	public void setCantidadDC(Integer cantidadDC) {
		this.cantidadDC = cantidadDC;
	}

	public Double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(Double subTotal) {
		this.subTotal = subTotal;
	}

	public Integer getProducto_idproducto() {
		return producto_idproducto;
	}

	public void setProducto_idproducto(Integer producto_idproducto) {
		this.producto_idproducto = producto_idproducto;
	}

	public Integer getCompra_idcompra() {
		return compra_idcompra;
	}

	public void setCompra_idcompra(Integer compra_idcompra) {
		this.compra_idcompra = compra_idcompra;
	}

}
