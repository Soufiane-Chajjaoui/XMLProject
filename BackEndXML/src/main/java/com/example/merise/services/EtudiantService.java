package com.example.merise.services;

 import com.example.merise.EntetiesXMLBind.Etudiant;
 import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.BufferedWriter;
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
	
	public void addEtudiant(Etudiant etudiant){
		 try {
			etudiant.setIdPerson();
			JAXBContext jaxbcontext = JAXBContext.newInstance(Etudiant.class);
			
			Marshaller marshaller = jaxbcontext.createMarshaller();
			marshaller.marshal(etudiant ,new PrintWriter(new BufferedWriter( new FileWriter("D:\\laragon\\www\\ProjetXML\\EST.xml" , true))));
			 System.out.println(etudiant.getBac());
			System.out.println("Etudiant written to XML file successfully");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
