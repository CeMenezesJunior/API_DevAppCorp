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

import com.br.uff.api.api.model.Volume;
import com.br.uff.api.api.repository.VolumeRepository;

@RestController
@RequestMapping("/volume")
public class VolumeController {
	
	@Autowired
	private VolumeRepository volumeRepository;
	
	@GetMapping
	public List<Volume> listar(){
		return volumeRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Volume adicionar(@RequestBody Volume volume) {
		return volumeRepository.save(volume);
	}
}
