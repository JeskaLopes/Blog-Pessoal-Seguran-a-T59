package org.generation.blogpessoal.controller;

import java.util.List;

import org.generation.blogpessoal.model.Postagem;
import org.generation.blogpessoal.repository.PostagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// defino que o arquivo vai ser uma classe controladora que vai usar os verbos e metodos http
@RestController

// endpoint de postagem
@RequestMapping("/postagens")

@CrossOrigin(origins="*", allowedHeaders ="*")
public class PostagemController {

	@Autowired
	private PostagemRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Postagem>> buscaTodasAsPostagens(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	// teste de getmapping
	@GetMapping("/teste")
	public ResponseEntity<List<Postagem>> teste(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	
	
	
}
