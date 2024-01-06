package com.example.merise.controllers;

import com.example.merise.MCDToJaxB.Etudiant;
import com.example.merise.services.EtudiantService;
import com.example.merise.services.MCDToJaxBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/Etudiants")
public class EtudiantController {
	
	@Autowired
	private EtudiantService Etudiantservice;
	@Autowired
	private MCDToJaxBService Studantservice;

	@PostMapping
	@CrossOrigin

	public ResponseEntity<Optional<Etudiant>> addEtudiant(Etudiant etudiant){
		if(Studantservice.addStudant(etudiant).isPresent()){
			return ResponseEntity.status(HttpStatus.CREATED).body(Studantservice.addStudant(etudiant));
		}

		// Return ResponseEntity with the entire Optional<Etudiant> as the response body
		return ResponseEntity.status(HttpStatus.CONFLICT).body(null);
	}
}
