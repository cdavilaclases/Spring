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

import com.example.usuarioa.entity.Telefono;
import com.example.usuarioa.repository.TelefonoRepository;

@RestController
@RequestMapping("/telefono")
@CrossOrigin
public class TelefonoService {
	
	final TelefonoRepository ur;

	TelefonoService(TelefonoRepository ur) {
		this.ur = ur;
	}
	
	@GetMapping(path="/buscar")
	public List<Telefono> buscarTelefono(){
		
		return ur.findAll();
		
	}
	
	@GetMapping(path="/buscar/{idusuario}")
	public List<Telefono> buscarTelefonoPorUsuario(
			@PathVariable("idusuario") int idusuario
			){
		
		return ur.findByIdusuario(idusuario);
		
	}
	
	@PostMapping(path="/guardar")
	public Telefono guardarTelefono(@RequestBody Telefono u) {
			
		return ur.save(u);
		
	}
	
	@DeleteMapping(path = "/eliminar/{idtelefono}")
	public void eliminarTelefono(@PathVariable("idtelefono") int idtelefono) {
		
		ur.deleteById(idtelefono);
		
	}

}
