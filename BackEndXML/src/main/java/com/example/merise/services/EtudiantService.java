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
 
@Service
public class EtudiantService {
	private static final String XML_FILE_PATH = "D:\\laragon\\www\\ProjetXML\\EST.xml";


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


			List<Etablissment> etablissmentList = etablissments.getEtablissments();


			for (Etablissment etablissment : etablissmentList) { // isEmpty()

				if (etudiant.getRefEtablissment() != null && etudiant.getRefEtablissment().equals(etablissment.getIdEtablissment())) {

					Etudiants etudiants = etablissment.getEtudiants();

					if (etudiants == null) {
						etudiants = new Etudiants();
 					}

					etudiants.setEtudiant(etudiant);

					etablissment.setEtudiants(etudiants);

					etablissments.setEtablissments(etablissmentList);

					marshaller.marshal(etablissments, new PrintWriter(new BufferedWriter(new FileWriter(file))));

					System.out.println("Etudiant has been added successfully.");
					return; // return car cette methode est return void
				}
			}

			// If no matching Etablissment is found, handle accordingly
			System.out.println("No matching Etablissment found for RefEtablissment: " + etudiant.getRefEtablissment());
			// Handle the case where no matching Etablissment is found
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
