package com.intento2crud.icabrerabalma.entity;

import jakarta.persistence.*;

import lombok.Data;

@Entity
@Table(name= "estudiantes")
@Data
public class Estudiante 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name ="nombre", nullable=false)
	private String nombre;
	
	@Column(name ="apellido", nullable=false)
	private String apellido;
	
	@Column(name ="email", nullable=false, unique=true)
	private String email;

	
}
