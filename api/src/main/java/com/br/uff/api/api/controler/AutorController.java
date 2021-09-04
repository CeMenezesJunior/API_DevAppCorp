package com.br.uff.api.api.controler;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.br.uff.api.api.model.Autor;
import com.br.uff.api.api.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/autor")
public class AutorController {
	
        @Autowired
	private AutorRepository autorRepository;
	
	@GetMapping
	public List<Autor> listar(){
		return autorRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Autor adicionar(@RequestBody Autor autor) {
		return autorRepository.save(autor);
	}
}
