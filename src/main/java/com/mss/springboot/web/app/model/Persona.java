package com.mss.springboot.web.app.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;



@Document("Persona")	//	Mapeando clases en MongoDB(nombre de la coleccion dentro de la DB)
@Data	//	Genera los Getter y Setter
public class Persona {
	
	
	@Id
	private String id;
	
	private String nombres;
	private String apellidos;
	private String email;
	private Integer edad;
	
	
	
}