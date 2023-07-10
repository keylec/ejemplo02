package pe.edu.unmsm.ejemplo02.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.unmsm.ejemplo02.entidades.Matricula;
import pe.edu.unmsm.ejemplo02.servicios.IAMatriculaServicio;

@RestController
public class MatriculaControlador {
	@Autowired
	@Qualifier("servicioFeign")
	//@Qualifier("servicioRestT")
	private IAMatriculaServicio matriculaServicio;
	
	@GetMapping("/todos")
	public List<Matricula> listar(){
		return matriculaServicio.findAll();	
	}
	@GetMapping("/ver/{id}/matricula/{matricula}")
	public Matricula ver(@PathVariable Integer id, @PathVariable Integer matricula) {
		return matriculaServicio.findById(id, matricula);
	}
}
