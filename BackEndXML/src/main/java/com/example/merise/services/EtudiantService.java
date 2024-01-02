package com.example.merise.services;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import org.springframework.stereotype.Service;

import com.example.merise.EntetiesXMLBind.EtudiantXML;
 
@Service
public class EtudiantService {
	
	public void addEtudiant(EtudiantXML etudiant){
		 try {
			JAXBContext context = JAXBContext.newInstance(EtudiantXML.class);
			Marshaller marshaller = context.createMarshaller();
			
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			
			File dbFile = new File("D:\\CoursJava\\entree_Sorties\\ESTS.xml");
			
			
			marshaller.marshal(etudiant, dbFile);
			
			System.out.println("Etudiant written to XML file successfully");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
