package com.intento2crud.icabrerabalma.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.intento2crud.icabrerabalma.entity.Estudiante;

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante, Long>
{
	
}
