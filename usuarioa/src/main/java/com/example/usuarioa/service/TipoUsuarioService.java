package com.example.usuarioa.service;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.usuarioa.entity.TipoUsuario;
import com.example.usuarioa.repository.TipoUsuarioRepository;

@RestController
@RequestMapping("/tipo")
@CrossOrigin
public class TipoUsuarioService {
	
	final TipoUsuarioRepository ur;

	TipoUsuarioService(TipoUsuarioRepository ur) {
		this.ur = ur;
	}
	
	@GetMapping(path="/buscar")
	public List<TipoUsuario> buscarTipoUsuario(){
		
		return ur.findAll();
		
	}

}
