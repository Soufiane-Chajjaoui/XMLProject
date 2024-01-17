package com.example.merise.services;

import com.example.merise.MCDToJaxB.*;
import org.springframework.stereotype.Service;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.SchemaOutputResolver;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.Optional;
import java.util.UUID;

@Service
public class MCDToJaxBService {

    private static final String XML_FILE_PATH = "D:\\laragon\\www\\ProjetXML\\EST.xml";
    private static final String XSD_FILE_PATH = "D:\\laragon\\www\\ProjetXML\\MCDToSCHEMA.xsd" ;
    public Optional<Etudiant> addStudant(Etudiant etudiantParam) {
        File file = new File(XML_FILE_PATH);
        try {
            JAXBContext context = JAXBContext.newInstance(Bac.class, Etudiant.class, Etudiants.class, FiliereDiplome.class);
            Marshaller marshaller = context.createMarshaller();
            SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = sf.newSchema(new File(XSD_FILE_PATH));
            Etudiants etudiants ;


            if (file.length() == 0){
                etudiants = new Etudiants();
            }else {
                Unmarshaller unmarshaller = context.createUnmarshaller(); // factory get Unmarshaller object
                unmarshaller.setSchema(schema); //Add schema in file xml for validation
                unmarshaller.setEventHandler(new MyValidationEventHandlere()); // set Handler
                etudiants = (Etudiants) unmarshaller.unmarshal(file); // deserialize
            }


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
    public Optional<?> removeStudent(UUID idPerson){
    try {
        JAXBContext context = JAXBContext.newInstance(Etudiants.class);
        Marshaller marshaller = context.createMarshaller();
        Unmarshaller unmarshaller = context.createUnmarshaller();

        Etudiants etudiants = (Etudiants) unmarshaller.unmarshal(new File(XML_FILE_PATH));

        Iterator<Etudiant> itrEtudiant =  etudiants.getEtudiants().iterator();

        while (itrEtudiant.hasNext()){
            Etudiant etudiant = itrEtudiant.next();
            if (etudiant.getIdPerson().equals(idPerson)){
                itrEtudiant.remove();
                // Create a StringWriter to hold the XML content
                StringWriter stringWriter = new StringWriter();

                // Add XML prolog and stylesheet processing instruction
                stringWriter.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
                stringWriter.write("<?xml-stylesheet type=\"text/xsl\" href=\"MCDToSCHEMA.xsl\"?>\n");

                // Marshal Etudiants to XML and append to the StringWriter
                marshaller.setProperty(Marshaller.JAXB_FRAGMENT, true); // JaxB_FRAGMENT for prevent set prolog xml automatically
                marshaller.marshal(etudiants, stringWriter);

                // Write the content to the file
                try (FileWriter fileWriter = new FileWriter(new File(XML_FILE_PATH))) {
                    fileWriter.write(stringWriter.toString());
                }
                return Optional.of(true);
            }
        }
    }catch (Exception e){
        e.printStackTrace();

    }
    return Optional.empty();
    }

    public Optional<Etudiant> updateEtudiant(UUID id ,String nom){
        File file = new File(XML_FILE_PATH);
        Etudiant etudiant = null;
        boolean found = false;
        try {
            JAXBContext context = JAXBContext.newInstance(Etudiants.class);
            Marshaller marshaller = context.createMarshaller();
            Unmarshaller unmarshaller = context.createUnmarshaller();

            Etudiants etudiants ;
            if (file.length() == 0){
                etudiants = new Etudiants();
            }else {
                etudiants = (Etudiants) unmarshaller.unmarshal(file);
                for (Etudiant e : etudiants.getEtudiants()){
                    if (e.getIdPerson().equals(id)){
                        found=!found;
                        e.setNom(nom);
                        etudiant = e ;
                    }
                }
            }

            marshaller.setProperty(Marshaller.JAXB_FRAGMENT , true);

            if (found){
                StringWriter stringWriter = new StringWriter();

                stringWriter.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
                stringWriter.write("<?xml-stylesheet type=\"text/xsl\" href=\"MCDToSCHEMA.xsl\"?>\n");

                // Marshal Etudiants to XML and append to the StringWriter
                marshaller.setProperty(Marshaller.JAXB_FRAGMENT, true); // JaxB_FRAGMENT for prevent set prolog xml automatically
                marshaller.marshal(etudiants, stringWriter);

                // Write the content to the file
                try (FileWriter fileWriter = new FileWriter(file)) {
                    fileWriter.write(stringWriter.toString());

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
                }
                return Optional.of(etudiant);

            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return Optional.empty();
    }

}
