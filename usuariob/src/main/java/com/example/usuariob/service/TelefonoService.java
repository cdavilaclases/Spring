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

import com.example.usuariob.entity.Telefono;
import com.example.usuariob.repository.TelefonoRepository;


@RestController
@RequestMapping("/telefono")
@CrossOrigin
public class TelefonoService {
	
	@Autowired
	TelefonoRepository tr;
	
	@GetMapping(path="/buscar")
	public List<Telefono> buscarTelefonos(){
		
		return tr.findAll();
		
	}
	
	@GetMapping(path="/buscar/{idusuario}")
	public List<Telefono> buscarTelefonoPorUsuario(
			@PathVariable("idusuario") int idusuario
			){
		
		return tr.findByIdusuario(idusuario);
		
	}
	
	@PostMapping(path="/guardar")
	public Telefono guardarUsuario(@RequestBody Telefono telefono) {
		
		return tr.save(telefono);
		
	}
	
	@DeleteMapping(path="/eliminar/{idtelefono}")
	public void eliminarUsuario(@PathVariable("idtelefono") int idtelefono) {
		
		tr.deleteById(idtelefono);
	}

}
