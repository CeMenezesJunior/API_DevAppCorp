package com.br.uff.api.api.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.br.uff.api.api.model.Artigo;
import com.br.uff.api.api.repository.ArtigoRepository;

@RestController
@RequestMapping("/artigo")
public class ArtigoController {
	
	@Autowired
	private ArtigoRepository artigoRepository;
	
	@GetMapping
	public List<Artigo> listar(){
		return artigoRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Artigo adicionar(@RequestBody Artigo artigo) {
		return artigoRepository.save(artigo);
	}
	
}
