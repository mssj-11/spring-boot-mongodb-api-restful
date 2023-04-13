package com.mss.springboot.web.app.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document("Persona")	//	Mapeando clases en MongoDB(nombre de la coleccion dentro de la DB)
public class Persona {
	
	
	@Id
	private String id;
	
	private String nombres;
	private String apellidos;
	private String email;
	private Integer edad;
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
	
	
}