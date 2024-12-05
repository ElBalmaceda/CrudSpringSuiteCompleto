package com.intento2crud.icabrerabalma.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.intento2crud.icabrerabalma.entity.Estudiante;
import com.intento2crud.icabrerabalma.service.EstudianteService;
import com.intento2crud.icabrerabalma.service.EstudianteServiceImpl;

@Controller
public class EstudianteController 
{
	@Autowired
	private EstudianteServiceImpl estudianteService;
	
	@GetMapping({"/estudiantes","/"})
	public String findAllEstudiantes(Model model) 
	{
		model.addAttribute("estudiantes",estudianteService.findAll());
		return "estudiantes"; //Retorna al html estudiantes
	}
	@GetMapping("/estudiantes/nuevo")
	public String showEstudiantes(Model model) 
	{
		Estudiante estudiante = new Estudiante();
		model.addAttribute("estudiante",estudiante);
		return "crear_estudiante";
	}
	@PostMapping("/estudiantes")
	public String saveEstudiantes(@ModelAttribute("estudiante") Estudiante estudiante) 
	{
		estudianteService.save(estudiante);
		return "redirect:/estudiantes";
	}
	@GetMapping("/estudiantes/editar/{id}")
	public String mostrarFormEditar(@PathVariable Long id, Model model) 
	{
		model.addAttribute("estudiante",estudianteService.findById(id));
		return "editar_estudiante";
	}
	@PostMapping("/estudiantes/{id}")
	public String actualizarEstudiante(@PathVariable Long id,@ModelAttribute("estudiante") Estudiante estudiante, Model model) 
	{
		Estudiante estudianteExiste=estudianteService.findById(id);
		estudianteExiste.setId(id);
		estudianteExiste.setNombre(estudiante.getNombre());
		estudianteExiste.setApellido(estudiante.getApellido());
		estudianteExiste.setEmail(estudiante.getEmail());
		estudianteService.reloadEstudiante(estudianteExiste);
		return "redirect:/estudiantes";
	}
	
	@GetMapping("/estudiantes/{id}")
	public String eliminarEstudiante(@PathVariable Long id) 
	{
		estudianteService.deleteById(id);
		return "redirect:/estudiantes";
	}
	
}
