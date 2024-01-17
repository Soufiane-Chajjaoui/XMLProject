//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2024.01.15 à 03:42:44 PM WET 
//


package org.xmlProjet.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.xmlProjet.generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Etudiant_QNAME = new QName("", "Etudiant");
    private final static QName _FiliereDiplome_QNAME = new QName("", "FiliereDiplome");
    private final static QName _Bac_QNAME = new QName("", "Bac");
    private final static QName _Etudiants_QNAME = new QName("", "Etudiants");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.xmlProjet.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Etudiant }
     * 
     */
    public Etudiant createEtudiant() {
        return new Etudiant();
    }

    /**
     * Create an instance of {@link FiliereDiplome }
     * 
     */
    public FiliereDiplome createFiliereDiplome() {
        return new FiliereDiplome();
    }

    /**
     * Create an instance of {@link Bac }
     * 
     */
    public Bac createBac() {
        return new Bac();
    }

    /**
     * Create an instance of {@link Etudiants }
     * 
     */
    public Etudiants createEtudiants() {
        return new Etudiants();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link TypeDiplome }
     * 
     */
    public TypeDiplome createTypeDiplome() {
        return new TypeDiplome();
    }

    /**
     * Create an instance of {@link Condidature }
     * 
     */
    public Condidature createCondidature() {
        return new Condidature();
    }

    /**
     * Create an instance of {@link Diplome }
     * 
     */
    public Diplome createDiplome() {
        return new Diplome();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Etudiant }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Etudiant")
    public JAXBElement<Etudiant> createEtudiant(Etudiant value) {
        return new JAXBElement<Etudiant>(_Etudiant_QNAME, Etudiant.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FiliereDiplome }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FiliereDiplome")
    public JAXBElement<FiliereDiplome> createFiliereDiplome(FiliereDiplome value) {
        return new JAXBElement<FiliereDiplome>(_FiliereDiplome_QNAME, FiliereDiplome.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Bac }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Bac")
    public JAXBElement<Bac> createBac(Bac value) {
        return new JAXBElement<Bac>(_Bac_QNAME, Bac.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Etudiants }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Etudiants")
    public JAXBElement<Etudiants> createEtudiants(Etudiants value) {
        return new JAXBElement<Etudiants>(_Etudiants_QNAME, Etudiants.class, null, value);
    }

}
