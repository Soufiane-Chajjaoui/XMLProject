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
                    String message = "Etudiant avec CNE"+ etudiantParam.getCne() + "est Deja Exist" ;
                    return Optional.empty();
                }
            }
            etudiants.setEtudiant(etudiantParam);
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT , true);
            marshaller.marshal(etudiants, file); // for Serialize Object instanceOf Etudiants

            // Marshal Etudiants to XML
//            StringWriter stringWriter = new StringWriter();
//            marshaller.marshal(etudiants, stringWriter);
//            String xmlString = "<?xml-stylesheet type=\"text/xsl\" href=\"StyleSheet-ESTS.xsl\"?>" + stringWriter.toString();
//
//            // Write the XML string to the file
//            try (FileWriter fileWriter = new FileWriter(file)) {
//                fileWriter.write(xmlString);
//            }

            return Optional.of(etudiantParam) ;
//            pour genere Schema a traver des classes java avec Annotation Xml
//            context.generateSchema(
//                    new SchemaOutputResolver() {
//                        @Override
//                        public Result createOutput(String namespaceUri, String suggestedFileName) throws IOException {
//                            File fileSchema = new File(XSD_FILE_PATH);
//                            StreamResult streamResult = new StreamResult(fileSchema);
//                            return streamResult;
//                        }
//                    }
//            );
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }




}
