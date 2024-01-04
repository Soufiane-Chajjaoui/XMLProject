package com.example.merise.services;

 import com.example.merise.EntetiesXMLBind.Etablissment;
 import com.example.merise.EntetiesXMLBind.Etudiant;
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
			System.out.println(etudiant.getNom());

			// Check if the file is empty
			if (file.length() == 0) {
				Etablissment etab = new Etablissment();
				etab.setEtudiants(etudiant);
				JAXBContext jaxbcontext = JAXBContext.newInstance(Etablissment.class);
				Marshaller marshaller = jaxbcontext.createMarshaller();
				marshaller.marshal(etab, new PrintWriter(new BufferedWriter(new FileWriter(file))));
			} else {
				JAXBContext jaxbcontext = JAXBContext.newInstance(Etablissment.class);
				Marshaller marshaller = jaxbcontext.createMarshaller();
				Unmarshaller unmarshaller = jaxbcontext.createUnmarshaller();

				// deserialize Etablissment de fichier EST.xml
				Etablissment e = (Etablissment) unmarshaller.unmarshal(file);

				if (e != null) {
					e.setEtudiants(etudiant);
					try (PrintWriter pw = new PrintWriter(file)) {
						pw.print("");
					}
					marshaller.marshal(e, new PrintWriter(new BufferedWriter(new FileWriter(file))));
				} else {
					// Handle the case where unmarshalling returns null (file is empty or invalid)
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}
