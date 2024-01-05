package com.example.merise.controllers;

import com.example.merise.MCDToJaxB.Etudiant;
import com.example.merise.services.EtudiantService;
import com.example.merise.services.MCDToJaxBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Etudiants")
public class EtudiantController {
	
	@Autowired
	private EtudiantService Etudiantservice;
	@Autowired
	private MCDToJaxBService Studantservice;

	@PostMapping
	@CrossOrigin
	public ResponseEntity<String> addEtudiant(){
		Studantservice.addStudant(new Etudiant());
		return ResponseEntity.status(201).body("etudiant");
	}
}
