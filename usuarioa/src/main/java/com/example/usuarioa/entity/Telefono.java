package com.example.usuarioa.entity;

import java.io.Serializable;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "telefono")
public class Telefono implements Serializable{

	private static final long serialVersionUID = -5812911673785582253L;

	@Id
	@Column(name="idtelefono")
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Basic(optional=false)
	private int idtelefono;
	
	@Column(name="telefono")
	private String telefono;
	
	@Column(name="idusuario")
	private Integer idusuario;

	public int getIdtelefono() {
		return idtelefono;
	}

	public void setIdtelefono(int idtelefono) {
		this.idtelefono = idtelefono;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Integer getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(Integer idusuario) {
		this.idusuario = idusuario;
	}
	
	
}
