package com.example.merise.controllers;

import com.example.merise.MCDToJaxB.Etudiant;
import com.example.merise.services.EtudiantService;
import com.example.merise.services.MCDToJaxBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

	public ResponseEntity<?> addEtudiant(@RequestBody Etudiant etudiant) {
		Optional<Etudiant> addedEtudiant = Studantservice.addStudant(etudiant);

		if (addedEtudiant.isPresent()) {
			return ResponseEntity.status(HttpStatus.CREATED).body(addedEtudiant);
		} else {
			String errorMessage = "Failed to add the student. Student with the same CNE already exists.";
			return ResponseEntity.status(HttpStatus.CONFLICT).body(errorMessage);
		}
	}

}
