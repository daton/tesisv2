package org.campos.tesisv2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Tesisv2Application {
	@Autowired
	RepositorioUsuario repositorioUsuario;

	public static void main(String[] args) {
		SpringApplication.run(Tesisv2Application.class, args);
	}
}
