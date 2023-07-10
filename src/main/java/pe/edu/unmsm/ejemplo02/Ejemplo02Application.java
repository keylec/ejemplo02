package pe.edu.unmsm.ejemplo02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
@EnableDiscoveryClient
public class Ejemplo02Application {

	public static void main(String[] args) {
		SpringApplication.run(Ejemplo02Application.class, args);
	}

}
