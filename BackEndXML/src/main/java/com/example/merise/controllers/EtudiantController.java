package com.example.merise.controllers;

import com.example.merise.MCDToJaxB.Etudiant;
import com.example.merise.services.EtudiantService;
import com.example.merise.services.MCDToJaxBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/Etudiants")
public class EtudiantController {
	@Autowired
	private EtudiantService Etudiantservice;
	@Autowired
	private MCDToJaxBService Studantservice;

	@PostMapping
	@CrossOrigin
	public ResponseEntity<?> store(@RequestBody Etudiant etudiant) {
		Optional<Etudiant> addedEtudiant = Studantservice.addStudant(etudiant);

		if (addedEtudiant.isPresent()) {
			return ResponseEntity.status(HttpStatus.CREATED).body(addedEtudiant);
		} else {
			String errorMessage = "Failed to add the student. Student with the same CNE already exists.";
			return ResponseEntity.status(HttpStatus.CONFLICT).body(errorMessage);
		}
	}
	@DeleteMapping("/{id}")
	@CrossOrigin
	public  ResponseEntity<?> delete(@PathVariable UUID id){
		Boolean removed = Studantservice.removeStudent(id).isPresent();
		return  ResponseEntity.status( removed ? HttpStatus.OK : HttpStatus.NO_CONTENT)
				.body(removed ? "has been removed" : "No content"
		);
	}

	@PatchMapping("/{id}/{nom}")
	@CrossOrigin
	public ResponseEntity<?> update(@PathVariable String id , @PathVariable String nom){
		UUID idCast = UUID.fromString(id);
		Optional<Etudiant> e = Studantservice.updateEtudiant(idCast , nom);
		return ResponseEntity.status(e.isPresent() ? HttpStatus.OK : HttpStatus.NOT_FOUND)
				.body(e.isPresent() ? e.get().getNom() + " has been edit" : "ressource not found");
	}
}
