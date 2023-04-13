package com.mss.springboot.web.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.mss.springboot.web.app.model.Persona;
import com.mss.springboot.web.app.repository.PersonaRepositorio;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor	//	Genera el constructor
public class PersonaService {
	
	
	private final PersonaRepositorio personaRepositorio;
	
	
	
	//	Guardar Registro
	public void save(Persona persona) {
		personaRepositorio.save(persona);
	}
	
	//	Listar registros
	public List<Persona> findAll(){
		return personaRepositorio.findAll();
	}
	
	//	Buscar por ID
	public Optional<Persona> findById(String id){
		return personaRepositorio.findById(id);
	}
	
	//	Eliminar
	public void deleteById(String id) {
		personaRepositorio.deleteById(id);
	}
	
	
	
}