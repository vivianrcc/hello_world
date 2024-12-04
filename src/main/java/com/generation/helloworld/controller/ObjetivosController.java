package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")
public class ObjetivosController {
	
	@GetMapping
	public String bsm() {
		return"<h1>Lista de Objetivos de Apredizagem da Semana:</h1>"
	            + "<ul>"
	            + "<li>Estudar e assistir videos </li>"
	            + "<li>Colocar as tarefas em dia</li>"
	            + "<li>Entender o Spring Boot</li>"
	            + "</ul>";
	}

}
