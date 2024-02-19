package com.example.JPA;

import com.example.JPA.Repository.TestRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(JpaApplication.class, args);

		// Obtener una instancia del repositorio desde el contexto de Spring
		TestRepo testRepo = context.getBean(TestRepo.class);

		// Crear una nueva instancia de la entidad
		TestRepo entidad = new TestRepo();

		// Guardar la entidad en la base de datos
		testRepo.save(entidad);

		// Imprimir mensaje de confirmación
		System.out.println("Entidad guardada correctamente en la base de datos.");
	}
}
