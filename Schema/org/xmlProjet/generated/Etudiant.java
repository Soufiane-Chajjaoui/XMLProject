//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2024.01.15 à 03:42:44 PM WET 
//


package org.xmlProjet.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour etudiant complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="etudiant">
 *   &lt;complexContent>
 *     &lt;extension base="{}person">
 *       &lt;sequence>
 *         &lt;element ref="{}Bac"/>
 *         &lt;element name="Condidature" type="{}condidature" minOccurs="0"/>
 *         &lt;element name="Diplome" type="{}diplome" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="cne" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "etudiant", propOrder = {
    "bac",
    "condidature",
    "diplome"
})
public class Etudiant
    extends Person
{

    @XmlElement(name = "Bac", required = true)
    protected Bac bac;
    @XmlElement(name = "Condidature")
    protected Condidature condidature;
    @XmlElement(name = "Diplome")
    protected Diplome diplome;
    @XmlAttribute(name = "cne", required = true)
    protected String cne;

    /**
     * Obtient la valeur de la propriété bac.
     * 
     * @return
     *     possible object is
     *     {@link Bac }
     *     
     */
    public Bac getBac() {
        return bac;
    }

    /**
     * Définit la valeur de la propriété bac.
     * 
     * @param value
     *     allowed object is
     *     {@link Bac }
     *     
     */
    public void setBac(Bac value) {
        this.bac = value;
    }

    /**
     * Obtient la valeur de la propriété condidature.
     * 
     * @return
     *     possible object is
     *     {@link Condidature }
     *     
     */
    public Condidature getCondidature() {
        return condidature;
    }

    /**
     * Définit la valeur de la propriété condidature.
     * 
     * @param value
     *     allowed object is
     *     {@link Condidature }
     *     
     */
    public void setCondidature(Condidature value) {
        this.condidature = value;
    }

    /**
     * Obtient la valeur de la propriété diplome.
     * 
     * @return
     *     possible object is
     *     {@link Diplome }
     *     
     */
    public Diplome getDiplome() {
        return diplome;
    }

    /**
     * Définit la valeur de la propriété diplome.
     * 
     * @param value
     *     allowed object is
     *     {@link Diplome }
     *     
     */
    public void setDiplome(Diplome value) {
        this.diplome = value;
    }

    /**
     * Obtient la valeur de la propriété cne.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCne() {
        return cne;
    }

    /**
     * Définit la valeur de la propriété cne.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCne(String value) {
        this.cne = value;
    }

}
