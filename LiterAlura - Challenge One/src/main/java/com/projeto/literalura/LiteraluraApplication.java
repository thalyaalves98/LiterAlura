package com.projeto.literalura;

import com.projeto.literalura.principal.Principal;
import com.projeto.literalura.repositorio.repositorioLivros;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class LiteraluraApplication implements CommandLineRunner {

	@Autowired
	private repositorioLivros service;
	public static void main(String[] args) {
		SpringApplication.run(LiteraluraApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal menu = new Principal(service);
		menu.exibeMenu();

	}
}
