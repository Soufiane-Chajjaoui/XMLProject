//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2024.01.15 � 03:42:44 PM WET 
//


package org.xmlProjet.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour filiereDiplome complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="filiereDiplome">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Filiere" type="{}filiereEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="idFiliere" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "filiereDiplome", propOrder = {
    "filiere"
})
public class FiliereDiplome {

    @XmlElement(name = "Filiere")
    @XmlSchemaType(name = "string")
    protected FiliereEnum filiere;
    @XmlAttribute(name = "idFiliere", required = true)
    protected String idFiliere;

    /**
     * Obtient la valeur de la propri�t� filiere.
     * 
     * @return
     *     possible object is
     *     {@link FiliereEnum }
     *     
     */
    public FiliereEnum getFiliere() {
        return filiere;
    }

    /**
     * D�finit la valeur de la propri�t� filiere.
     * 
     * @param value
     *     allowed object is
     *     {@link FiliereEnum }
     *     
     */
    public void setFiliere(FiliereEnum value) {
        this.filiere = value;
    }

    /**
     * Obtient la valeur de la propri�t� idFiliere.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdFiliere() {
        return idFiliere;
    }

    /**
     * D�finit la valeur de la propri�t� idFiliere.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdFiliere(String value) {
        this.idFiliere = value;
    }

}
