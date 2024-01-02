package com.example.merise.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Etudiants")
public class EtudiantController {
	
	@PostMapping
	public ResponseEntity<String> addEtudiant(){
		
		return ResponseEntity.status(201).body("Etudiant Created Successfly");
	}
}
