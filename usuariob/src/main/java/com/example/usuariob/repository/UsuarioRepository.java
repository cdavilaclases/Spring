package com.example.usuariob.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.usuariob.entity.Usuario;

@Repository("usuarioRepository")
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

	public List<Usuario> findByPasswordAndEmail(String password,String email);
	
	public List<Usuario> findByEmailAndPassword(String email, String password);
}
