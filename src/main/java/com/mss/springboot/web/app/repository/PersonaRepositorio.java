package com.mss.springboot.web.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mss.springboot.web.app.model.Persona;


@Repository
public interface PersonaRepositorio extends MongoRepository<Persona, String>{
}