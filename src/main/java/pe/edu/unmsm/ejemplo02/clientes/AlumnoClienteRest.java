package pe.edu.unmsm.ejemplo02.clientes;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import pe.edu.unmsm.ejemplo02.entidades.Alumno;

//Aqui se implementa Feign para manejar clientes

//@FeignClient(name = "ejemplo01", url = "localhost:9090")
@FeignClient(name = "ejemplo01")//Con Eureka server para multiples servicios
public interface AlumnoClienteRest {
	@GetMapping("/todos")
	public List<Alumno> listar();
	@GetMapping("/ver/{id}")
	public Alumno ver(@PathVariable Integer id);
}
