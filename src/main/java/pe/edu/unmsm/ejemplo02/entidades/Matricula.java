package pe.edu.unmsm.ejemplo02.entidades;

public class Matricula {
	private Alumno alumno;
	private Integer matricula;
	private String curso;
	private Integer creditos;
	private Double costocredito;

	public Matricula(Alumno alumno, Integer matricula, String curso, Integer creditos, Double costocredito) {
		super();
		this.alumno = alumno;
		this.matricula = matricula;
		this.curso = curso;
		this.creditos = creditos;
		this.costocredito = costocredito;
	}

	public Matricula() {
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public Integer getCreditos() {
		return creditos;
	}

	public void setCreditos(Integer creditos) {
		this.creditos = creditos;
	}

	public Double getCostocredito() {
		return costocredito;
	}

	public void setCostocredito(Double costocredito) {
		this.costocredito = costocredito;
	}

	public Double getImporte() {
		return this.costocredito * this.creditos.doubleValue();
	}

}
