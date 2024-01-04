package com.example.merise.services;

 import com.example.merise.EntetiesXMLBind.Etablissment;
 import com.example.merise.EntetiesXMLBind.Etablissments;
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
 import java.util.List;
 import java.util.Random;
 
@Service
public class EtudiantService {
	private static final String XML_FILE_PATH = "D:\\laragon\\www\\ProjetXML\\EST.xml";
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
			File file = new File(XML_FILE_PATH);
			etudiant.setIdPerson();

			JAXBContext jaxbContext = JAXBContext.newInstance(Etablissments.class);
			Marshaller marshaller = jaxbContext.createMarshaller();
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

			Etablissments etablissments;

			// Check if the file is empty
			if (file.length() == 0) {
				etablissments = new Etablissments();
			} else {
				// Deserialize Etablissments from the file
				etablissments = (Etablissments) unmarshaller.unmarshal(file);
			}

			// Get the existing list of Etablissments
			List<Etablissment> etablissmentList = etablissments.getEtablissments();

			if (etablissmentList != null && !etablissmentList.isEmpty()) {

			}

			// Create a new Etablissment
			 Etablissment etablissment = new Etablissment("EST3");

			// Get the existing list of Etudiants in the Etablissment
			Etudiants etudiants = etablissment.getEtudiants();
			if (etudiants == null) {
				etudiants = new Etudiants();
			}

			// Add the new Etudiant to the list of Etudiants
			etudiants.setEtudiant(etudiant);

			// Set the updated Etudiants back to the Etablissment
			etablissment.setEtudiants(etudiants);

			// Add the new Etablissment to the list of Etablissments
			etablissmentList.add(etablissment);

			// Set the updated list of Etablissments back to the Etablissments
			etablissments.setEtablissments(etablissmentList);

			// Save the updated Etablissments back to the file
			try (PrintWriter pw = new PrintWriter(file)) {
				pw.print("");
			}
			marshaller.marshal(etablissments, new PrintWriter(new BufferedWriter(new FileWriter(file))));

			System.out.println("Etudiant has been added successfully.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}



}
