package com.example.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/habilidade")
public class HabilidadeController {
	@GetMapping
	public String hello() {
		return "Habilidade é o meu foco!";
		
	}
	
	
}
