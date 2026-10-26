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
@Table(name = "tipo_usuario")
public class TipoUsuario implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8575619414127450263L;
	
	
	@Id
	@Column(name="idtipo_usuario")
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Basic(optional=false)
	private int idtipoUsuario;
	
	@Column(name="descripcion")
	private String descripcion;

	public int getIdtipoUsuario() {
		return idtipoUsuario;
	}

	public void setIdtipoUsuario(int idtipoUsuario) {
		this.idtipoUsuario = idtipoUsuario;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	


}
