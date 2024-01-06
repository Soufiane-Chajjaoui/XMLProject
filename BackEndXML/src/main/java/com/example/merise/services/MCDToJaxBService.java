package com.example.merise.services;

import com.example.merise.MCDToJaxB.*;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.SchemaOutputResolver;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

@Service
public class MCDToJaxBService {

    private static final String XML_FILE_PATH = "D:\\laragon\\www\\ProjetXML\\EST.xml";

    public void addStudant(Etudiant etudiant2) {
        File file = new File(XML_FILE_PATH);
        try {
            JAXBContext context = JAXBContext.newInstance(Bac.class, Etudiant.class, Etudiants.class, FiliereDiplome.class);
            Marshaller marshaller = context.createMarshaller();
            Etudiants etudiants ;


            if (file.length() == 0){
                etudiants = new Etudiants();
            }else {
                Unmarshaller unmarshaller = context.createUnmarshaller(); // faactory get Unmarshaller object
                etudiants = (Etudiants) unmarshaller.unmarshal(file); // deserialize
            }

            Etudiant etudiant = new Etudiant("id", "Soufian", "chajjaoui", "0607025329", "schajjaoui@gmail.com",
                    "Safi, Rue 19", "Homme", "2003", "K1331331",
                    new Bac(TypeBac.PC, "2021", "14.36", "12.46" , Mention.BIEN),
                    new Condidature("idCon12", Arrays.asList(FiliereEnum.GENIE_INDUSTRIELLE, FiliereEnum.GENIE_INFORMATIQUE))
                    , new Diplome("idDip1" , 12.74 , 12.37 , 12.47 , 13.01 , 12.70
                    , 1244.40 , 12.70 , 160 , 100
                    , 93 , "assets/Releve.txt" , "assets/profileImage.txt", Mention.ASSEZ_BIEN
                    , new FiliereDiplome("idFiliereDip2" , FiliereEnum.GENIE_INFORMATIQUE)
                    , new TypeDiplome("idtypeDip1" , TypeDiplomeEnum.DUT))
            );
            etudiants.setEtudiant(etudiant);

            marshaller.marshal(etudiants, file); // for Serialize Object instanceOf Etudiants
            context.generateSchema(
                    new SchemaOutputResolver() {
                        @Override
                        public Result createOutput(String namespaceUri, String suggestedFileName) throws IOException {
                            File fileSchema = new File("D:\\laragon\\www\\ProjetXML\\MCDToSCHEMA.xml");
                            StreamResult streamResult = new StreamResult(fileSchema);
                            return streamResult;
                        }
                    }
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
