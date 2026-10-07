package com.example.usuarioa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.usuarioa.entity.Telefono;

@Repository("telefonoRepository")
public interface TelefonoRepository extends JpaRepository<Telefono,Integer>{

	public List<Telefono> findByIdusuario(Integer idusuario);
	
}
