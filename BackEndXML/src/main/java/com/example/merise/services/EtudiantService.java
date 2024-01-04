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

//	public Etablissment getEtablissmentToAdd(){}
	
	public void addEtudiant(Etudiant etudiant){
		 try {

			 File file = new File("D:\\laragon\\www\\ProjetXML\\EST.xml");
			etudiant.setIdPerson();
			JAXBContext jaxbcontext = JAXBContext.newInstance(Etablissment.class);

			Marshaller marshaller = jaxbcontext.createMarshaller();
			Unmarshaller unmarshaller = jaxbcontext.createUnmarshaller();

			Etablissment e = (Etablissment) unmarshaller.unmarshal(file);
			if (e != null){
				PrintWriter pw = new PrintWriter(file);
				pw.print("");
				pw.close();
				e.setEtudiants(etudiant);
				marshaller.marshal(e, new PrintWriter(new BufferedWriter(new FileWriter("D:\\laragon\\www\\ProjetXML\\EST.xml"))));
			}else {
				Etablissment etab = new Etablissment();
				etab.setEtudiants(etudiant);
				marshaller.marshal(etab, new PrintWriter(new BufferedWriter(new FileWriter("D:\\laragon\\www\\ProjetXML\\EST.xml"))));

			}



			 } catch (Exception e) {
					e.printStackTrace();
				}
		}
}
