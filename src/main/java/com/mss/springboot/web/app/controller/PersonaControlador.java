package com.mss.springboot.web.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mss.springboot.web.app.model.Persona;
import com.mss.springboot.web.app.service.PersonaService;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor	//	Genera el constructor
@RestController
@RequestMapping("/api/v1")
public class PersonaControlador {
	
	
	@Autowired
	private PersonaService personaService;
	
	
	
	@PostMapping("/personas")
	public void save(@RequestBody Persona persona) {
		personaService.save(persona);
	}
	
	@GetMapping("/personas")
	public List<Persona> findAll(){
		return personaService.findAll();
	}
	
	@GetMapping("/persona/{id}")
	public Persona findById(@PathVariable String id) {
		return personaService.findById(id).get();
	}
	
	@DeleteMapping("/persona/{id}")
	public void deleteById(@PathVariable String id) {
		personaService.deleteById(id);
	}
	
	@PutMapping("/personas")
	public void update(@RequestBody Persona persona) {
		personaService.save(persona);
	}
	
	
	
	
}