package com.intento2crud.icabrerabalma;

import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.intento2crud.icabrerabalma.entity.Estudiante;
import com.intento2crud.icabrerabalma.repository.EstudianteRepository;

@SpringBootApplication
public class IcabrerabalmaApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(IcabrerabalmaApplication.class, args);
	}
	
	@Autowired
	private EstudianteRepository estudianteRepository;

	@Override
	public void run(String... args) throws Exception {
		/*
		Estudiante estudiante1=new Estudiante("Juan", "Perez", "jperez@gmail.com");
		estudianteRepository.save(estudiante1);
		Estudiante estudiante2=new Estudiante("Juana", "Soza", "jsoza@gmail.com");
		estudianteRepository.save(estudiante2);
		*/
		
	}

}
