package com.app.proyecto.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "compra")
public class compra implements Serializable{

	private static final long serialVersionUID = 10L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "idcompra")
	private Integer idcompra;
	
	@Column(name = "cantidad")
	private Integer cantidad;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_compra")
	private Date fecha_compra;
	
	@Column(name = "estado")
	private String estado;
	
	@Column(name = "total")
	private Double total;
	
	@Column(name = "cliente_idcorreo")
	private String cliente_idcorreo;
	
	@OneToMany(mappedBy = "compra_idcompra")
	private List<detalleCompra> detalleCompraList;
	
	public Integer getIdcompra() {
		return idcompra;
	}

	public void setIdcompra(Integer idcompra) {
		this.idcompra = idcompra;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public String getCliente_idcorreo() {
		return cliente_idcorreo;
	}

	public void setCliente_idcorreo(String cliente_idcorreo) {
		this.cliente_idcorreo = cliente_idcorreo;
	}

	public List<detalleCompra> getDetalleCompraList() {
		return detalleCompraList;
	}

	public void setDetalleCompraList(List<detalleCompra> detalleCompraList) {
		this.detalleCompraList = detalleCompraList;
	}

	public Date getFecha_compra() {
		return fecha_compra;
	}

	public void setFecha_compra(Date fecha_compra) {
		this.fecha_compra = fecha_compra;
	}

}
