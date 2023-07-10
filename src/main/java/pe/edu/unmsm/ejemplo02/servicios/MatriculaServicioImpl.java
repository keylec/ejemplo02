package pe.edu.unmsm.ejemplo02.servicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import pe.edu.unmsm.ejemplo02.entidades.Alumno;
import pe.edu.unmsm.ejemplo02.entidades.Matricula;

@Service("servicioRestT")
public class MatriculaServicioImpl implements IAMatriculaServicio {
	@Autowired
	private RestTemplate clienteRest;

	@Override
	public List<Matricula> findAll() {
		List<Alumno> alumnos = Arrays.asList(clienteRest.getForObject("http://localhost:9090/todos ", Alumno[].class));
		List<Matricula> matriculas = new ArrayList<>();
		for (Alumno alu : alumnos) {
			Matricula m = new Matricula(alu, 1, "PCS", 2, 3.0);
			matriculas.add(m);
		}
		/*
		 * alumnos.forEach(alu -> { Matricula m = new Matricula(alu,1,"PCS",2,3.0);
		 * matriculas.add(m); });
		 */
		// return alumnos.stream().map(alu -> new
		// Matricula(alu,1,"PCS",2,3.0)).collect(Collectors.toList());
		return matriculas;
	}

	@Override
	public Matricula findById(Integer id, Integer matricula) {
		Map<String, String> pathVariables = new HashMap<>();
		pathVariables.put("id", id.toString());
		Alumno alumno = clienteRest.getForObject("http://localhost:9090/ver/{id}", Alumno.class, pathVariables);
		return new Matricula(alumno, matricula, "PCS", 2, 3.0);
	}

}
