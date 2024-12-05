package com.intento2crud.icabrerabalma.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

import com.intento2crud.icabrerabalma.entity.Estudiante;
import com.intento2crud.icabrerabalma.repository.EstudianteRepository;

@Service
public class EstudianteServiceImpl implements EstudianteService
{
	
	@Autowired
	private EstudianteRepository estudianteRepository;
	
	
	@Override
	public List<Estudiante> findAll() 
	{
		return estudianteRepository.findAll();
	}


	@Override
	public Estudiante save(Estudiante estudiante) {
		return estudianteRepository.save(estudiante);
	}


	@Override
	public Estudiante findById(Long id) {
		return estudianteRepository.findById(id).get();
	}


	@Override
	public Estudiante reloadEstudiante(Estudiante estudiante) {
		return estudianteRepository.save(estudiante);
	}


	@Override
	public void deleteById(Long id) {
		estudianteRepository.deleteById(id);
	}
	

}
