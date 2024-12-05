package com.intento2crud.icabrerabalma.service;

import java.util.List;

import com.intento2crud.icabrerabalma.entity.Estudiante;

public interface EstudianteService 
{
	public List<Estudiante> findAll();
	public Estudiante save(Estudiante estudiante);
	public Estudiante findById(Long id);
	public Estudiante reloadEstudiante(Estudiante estudiante);
	public void deleteById(Long id);
}
