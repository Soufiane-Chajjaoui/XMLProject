package com.example.merise.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.merise.EntetiesXMLBind.EtudiantXML;
 import com.example.merise.services.EtudiantService;

@RestController
@RequestMapping("/Etudiants")
public class EtudiantController {
	
	@Autowired
	private EtudiantService service;
	
	@PostMapping
	@CrossOrigin
	public ResponseEntity<EtudiantXML> addEtudiant(@RequestBody EtudiantXML etudiant){
		service.addEtudiant(etudiant);
		return ResponseEntity.status(201).body(etudiant);
	}
}
