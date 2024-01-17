//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2024.01.15 à 03:42:44 PM WET 
//


package org.xmlProjet.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour condidature complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="condidature">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Choix" type="{}filiereEnum" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="idCondidature" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "condidature", propOrder = {
    "choix"
})
public class Condidature {

    @XmlElement(name = "Choix")
    @XmlSchemaType(name = "string")
    protected List<FiliereEnum> choix;
    @XmlAttribute(name = "idCondidature")
    protected String idCondidature;

    /**
     * Gets the value of the choix property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the choix property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChoix().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FiliereEnum }
     * 
     * 
     */
    public List<FiliereEnum> getChoix() {
        if (choix == null) {
            choix = new ArrayList<FiliereEnum>();
        }
        return this.choix;
    }

    /**
     * Obtient la valeur de la propriété idCondidature.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCondidature() {
        return idCondidature;
    }

    /**
     * Définit la valeur de la propriété idCondidature.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCondidature(String value) {
        this.idCondidature = value;
    }

}
