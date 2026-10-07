package com.example.usuariob.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.usuariob.entity.Usuario;
import com.example.usuariob.repository.UsuarioRepository;

@RestController
@RequestMapping("/usuario")
@CrossOrigin
public class UsuarioService {
	
	@Autowired
	UsuarioRepository ur;
	
	@GetMapping(path="/buscar")
	public List<Usuario> buscarUsuarios(){
		
		return ur.findAll();
		
	}
	
	@GetMapping(path="/buscar/{password}/{email}")
	public List<Usuario> buscarUsuariosPorEmail(
			@PathVariable("password") String password,
			@PathVariable("email") String email){
		
		return ur.findByPasswordAndEmail(password, email);
		
	}
	
	@PostMapping(path="/guardar")
	public Usuario guardarUsuario(@RequestBody Usuario usuario) {
		
		return ur.save(usuario);
		
	}
	
	@DeleteMapping(path="/eliminar/{idusuario}")
	public void eliminarUsuario(@PathVariable("idusuario") int idusuario) {
		
		ur.deleteById(idusuario);
	}
	
	@PostMapping(path="/login")
	public Usuario login(@RequestBody Usuario usuario) {
		
		List<Usuario> usuarios= ur.findByEmailAndPassword(usuario.getEmail(), usuario.getPassword());
		if(usuarios.isEmpty()) {
			return null;
		}
		return usuarios.get(0);
		
	}
	

}
