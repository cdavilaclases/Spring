package com.example.usuarioa.service;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.usuarioa.entity.Usuario;
import com.example.usuarioa.repository.UsuarioRepository;

@RestController
@RequestMapping("/usuario")
@CrossOrigin
public class UsuarioService {

	final UsuarioRepository ur;

	UsuarioService(UsuarioRepository ur) {
		this.ur = ur;
	}
	
	@GetMapping(path="/buscar")
	public List<Usuario> buscarUsuario(){
		
		return ur.findAll();
		
	}
	
	@GetMapping(path="/buscar/{email}/{password}")
	public List<Usuario> buscarUsuarioEmailYPassword(
			@PathVariable("email") String email,
			@PathVariable("password") String password
			){
		
		return ur.findByEmailAndPassword(email, password);
		
	}
	
	@PostMapping(path="/guardar")
	public Usuario guardarUsuario(@RequestBody Usuario u) {
			
		return ur.save(u);
		
	}
	
	@DeleteMapping(path = "/eliminar/{idusuario}")
	public void eliminarUsuario(@PathVariable("idusuario") int idusuario) {
		
		ur.deleteById(idusuario);
		
	}
	
	@PostMapping(path="/login")
	public Usuario login(@RequestBody Usuario u) {
			
		List<Usuario> usuarios = ur.findByEmailAndPassword(u.getEmail(), u.getPassword());
		if(usuarios.isEmpty()) {
			return null;
		}
		else {
			return usuarios.get(0);		}
		
	}
	
	
}
