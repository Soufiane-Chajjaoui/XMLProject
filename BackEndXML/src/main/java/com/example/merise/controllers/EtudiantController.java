package com.example.merise.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.merise.entities.Etudiant;

@RestController
@RequestMapping("/Etudiants")
public class EtudiantController {
	
	@PostMapping
	@CrossOrigin
	public ResponseEntity<Etudiant> addEtudiant(@RequestBody Etudiant etudiant){
		
		return ResponseEntity.status(201).body(etudiant);
	}
}
