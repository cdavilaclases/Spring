package com.example.usuariob.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.usuariob.entity.TipoUsuario;

import com.example.usuariob.repository.TipoUsuarioRepository;


@RestController
@RequestMapping("/tipo")
@CrossOrigin
public class TipoUsuarioService {
	
	@Autowired
	TipoUsuarioRepository ur;
	
	@GetMapping(path="/buscar")
	public List<TipoUsuario> buscarTipoUsuario(){
		
		return ur.findAll();
		
	}

}
