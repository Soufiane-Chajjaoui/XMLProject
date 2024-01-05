package com.example.merise.services;

import com.example.merise.MCDToJaxB.Etudiant;
import com.example.merise.MCDToJaxB.Etudiants;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBContext;
import java.io.File;

@Service
public class MCDToJaxBService {

    private static final String XML_FILE_PATH = "D:\\laragon\\www\\ProjetXML\\EST.xml";


    public void addStudant(Etudiant etudiant){

        File file = new File(XML_FILE_PATH);
        try {
            JAXBContext context = JAXBContext.newInstance(Etudiants.class);

            Etudiants etudiants ;


        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
