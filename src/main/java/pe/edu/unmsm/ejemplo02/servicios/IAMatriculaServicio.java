package pe.edu.unmsm.ejemplo02.servicios;

import java.util.List;

import pe.edu.unmsm.ejemplo02.entidades.Matricula;

public interface IAMatriculaServicio {
	public List<Matricula> findAll();
	public Matricula findById(Integer id,Integer matricula);

}
