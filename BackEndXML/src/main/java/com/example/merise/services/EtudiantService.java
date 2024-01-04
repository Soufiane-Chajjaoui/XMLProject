package com.example.merise.services;

 import com.example.merise.EntetiesXMLBind.Etablissment;
 import com.example.merise.EntetiesXMLBind.Etudiant;
 import com.example.merise.EntetiesXMLBind.Etudiants;
 import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
 import javax.xml.bind.Unmarshaller;
 import java.io.BufferedWriter;
 import java.io.File;
 import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Random;
 
@Service
public class EtudiantService {

	private  String generateRandomString() {
		String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		Random random = new Random();
		StringBuilder sb = new StringBuilder(10);

		for (int i = 0; i < 10; i++) {
			int randomIndex = random.nextInt(CHARACTERS.length());
			char randomChar = CHARACTERS.charAt(randomIndex);
			sb.append(randomChar);
		}

		return sb.toString();
	}

	public void addEtudiant(Etudiant etudiant) {
		try {
			File file = new File("D:\\laragon\\www\\ProjetXML\\EST.xml");
			etudiant.setIdPerson();

			JAXBContext jaxbcontext = JAXBContext.newInstance(Etablissment.class);
			Marshaller marshaller = jaxbcontext.createMarshaller();
			Unmarshaller unmarshaller = jaxbcontext.createUnmarshaller();

			Etablissment etablissment;

			if (file.length() == 0) { // ce line check file if vide si elle vide on va cree nouvelle noeud Etablissment
				etablissment = new Etablissment();
			} else {
				// Deserialize Etablissment from the file
				etablissment = (Etablissment) unmarshaller.unmarshal(file);
			}

			// Get the existing list of Etudiants
			Etudiants etudiants = etablissment.getEtudiants();
			if (etudiants == null) {
				etudiants = new Etudiants();
			}

			// Add the new Etudiant to the list
			etudiants.setEtudiant(etudiant);

			// Set the updated Etudiants back to the Etablissment
			etablissment.setEtudiants(etudiants);

			// Save the updated Etablissment back to the file
			try (PrintWriter pw = new PrintWriter(file)) {
				pw.print("");
			}
			marshaller.marshal(etablissment, new PrintWriter(new BufferedWriter(new FileWriter(file))));

			System.out.println("Etudiant has been added successfully.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}



}
