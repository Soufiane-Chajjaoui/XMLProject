package com.example.merise.services;

import com.example.merise.MCDToJaxB.*;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.Arrays;

@Service
public class MCDToJaxBService {

    private static final String XML_FILE_PATH = "D:\\laragon\\www\\ProjetXML\\EST.xml";

    public void addStudant(Etudiant etudiant2) {
        File file = new File(XML_FILE_PATH);
        try {
            JAXBContext context = JAXBContext.newInstance(Etudiants.class);

            Etudiant etudiant = new Etudiant("id1", "Soufian", "chajjaoui", "0607025329", "schajjaoui@gmail.com",
                    "Safi, Rue 19", "Homme", "2003", "K1331331",
                    new Bac(TypeBac.SMB, "sss", "ss", "ss"),
                    new Condidature("idCon12", Arrays.asList(FiliereEnum.GENIE_INDUSTRIELLE, FiliereEnum.GENIE_INFORMATIQUE)));
            if (file.length() == 0){
                Etudiants etudiants = new Etudiants();

            }
            Etudiants etudiants = new Etudiants();
            etudiants.setEtudiant(etudiant);

            Marshaller marshaller = context.createMarshaller();

            // Marshal to the XML file instead of printing to the console
            marshaller.marshal(etudiants, file);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
