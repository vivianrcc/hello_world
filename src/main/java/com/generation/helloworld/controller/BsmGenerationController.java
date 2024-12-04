package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsm")
public class BsmGenerationController {
	
	@GetMapping
	public String bsm() {
		return"<h1>Lista BSM Generation Brasil:</h1>"
	            + "<h2># Mentalidades</h2>"
	            + "<ul>"
	            + "<li>Orientação ao futuro</li>"
	            + "<li>Persistência</li>"
	            + "<li>Responsabilidade Pessoal</li>"
	            + "<li>Mentalidade de Crescimento</li>"
	            + "</ul>"
	            + "<h2># Competências Comportamentais</h2>"
	            + "<ul>"
	            + "<li>Comunicação</li>"
	            + "<li>Proatividade</li>"
	            + "<li>Orientação ao Detalhe</li>"
	            + "<li>Trabalho em equipe</li>"
	            + "</ul>";
	}
}