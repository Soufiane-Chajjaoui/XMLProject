package com.example.merise.services;

import com.example.merise.MCDToJaxB.Bac;
import com.example.merise.MCDToJaxB.Etudiant;
import com.example.merise.MCDToJaxB.Etudiants;
import com.example.merise.MCDToJaxB.FiliereDiplome;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileWriter;
import java.io.StringWriter;
import java.util.Optional;

@Service
public class MCDToJaxBService {

    private static final String XML_FILE_PATH = "D:\\laragon\\www\\ProjetXML\\EST.xml";
    private static final String XSD_FILE_PATH = "D:\\laragon\\www\\ProjetXML\\MCDToSCHEMA.xsd" ;
    public Optional<Etudiant> addStudant(Etudiant etudiantParam) {
        File file = new File(XML_FILE_PATH);
        try {
            JAXBContext context = JAXBContext.newInstance(Bac.class, Etudiant.class, Etudiants.class, FiliereDiplome.class);
            Marshaller marshaller = context.createMarshaller();
//            SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
//            Schema schema = sf.newSchema(new File(XSD_FILE_PATH));
            Etudiants etudiants ;


            if (file.length() == 0){
                etudiants = new Etudiants();
            }else {
                Unmarshaller unmarshaller = context.createUnmarshaller(); // faactory get Unmarshaller object
//                unmarshaller.setSchema(schema); Add schema in file xml for validation
//                unmarshaller.setEventHandler(new MyValidationEventHandlere()); set Handler
                etudiants = (Etudiants) unmarshaller.unmarshal(file); // deserialize
            }

//            Etudiant etudiant = new Etudiant(UUID.randomUUID(), "Soufian", "chajjaoui", "0607025329", "schajjaoui@gmail.com",
//                    "Safi, Rue 19", SexEnum.HOMME, "2003", "K1331331131"
//                    , new Bac(TypeBac.PC, "2021", "14.36", "12.46" , Mention.BIEN)
//                    , new Condidature(UUID.randomUUID(), Arrays.asList(FiliereEnum.TM, FiliereEnum.ISIR))
//                    , new Diplome(UUID.randomUUID() , 12.74 , 12.30 , 12.47 , 13.01 , 12.70
//                    , 12.40 , 12.70 , 160 , 100
//                    , 93 , "assets/Releve.txt" , "assets/profileImage.txt", Mention.ASSEZ_BIEN
//                    ,  FilierDiplomeEnum.GENIE_INFORMATIQUE
//                    ,  TypeDiplomeEnum.DUT)
//            );

            for(Etudiant e : etudiants.getEtudiants()){
                if (e.getCne().equals(etudiantParam.getCne())){
                    return Optional.empty();
                }
            }
            etudiants.setEtudiant(etudiantParam);

            // Create a StringWriter to hold the XML content
            StringWriter stringWriter = new StringWriter();

            // Add XML prolog and stylesheet processing instruction
            stringWriter.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
            stringWriter.write("<?xml-stylesheet type=\"text/xsl\" href=\"MCDToSCHEMA.xsl\"?>\n");

            // Marshal Etudiants to XML and append to the StringWriter
            marshaller.setProperty(Marshaller.JAXB_FRAGMENT, true); // JaxB_FRAGMENT for prevent set prolog xml automatically
            marshaller.marshal(etudiants, stringWriter);

            // Write the content to the file
            try (FileWriter fileWriter = new FileWriter(file)) {
                fileWriter.write(stringWriter.toString());
            }
            return Optional.of(etudiantParam);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

    public  Optional


}
