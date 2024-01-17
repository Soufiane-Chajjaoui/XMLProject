//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2024.01.15 � 03:42:44 PM WET 
//


package org.xmlProjet.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour bac complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="bac">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DateBac" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Mention" type="{}mention" minOccurs="0"/>
 *         &lt;element name="National" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Regional" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SpecBac" type="{}typeBac"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bac", propOrder = {
    "dateBac",
    "mention",
    "national",
    "regional",
    "specBac"
})
public class Bac {

    @XmlElement(name = "DateBac", required = true)
    protected String dateBac;
    @XmlElement(name = "Mention")
    @XmlSchemaType(name = "string")
    protected Mention mention;
    @XmlElement(name = "National", required = true)
    protected String national;
    @XmlElement(name = "Regional", required = true)
    protected String regional;
    @XmlElement(name = "SpecBac", required = true)
    @XmlSchemaType(name = "string")
    protected TypeBac specBac;

    /**
     * Obtient la valeur de la propri�t� dateBac.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateBac() {
        return dateBac;
    }

    /**
     * D�finit la valeur de la propri�t� dateBac.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateBac(String value) {
        this.dateBac = value;
    }

    /**
     * Obtient la valeur de la propri�t� mention.
     * 
     * @return
     *     possible object is
     *     {@link Mention }
     *     
     */
    public Mention getMention() {
        return mention;
    }

    /**
     * D�finit la valeur de la propri�t� mention.
     * 
     * @param value
     *     allowed object is
     *     {@link Mention }
     *     
     */
    public void setMention(Mention value) {
        this.mention = value;
    }

    /**
     * Obtient la valeur de la propri�t� national.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNational() {
        return national;
    }

    /**
     * D�finit la valeur de la propri�t� national.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNational(String value) {
        this.national = value;
    }

    /**
     * Obtient la valeur de la propri�t� regional.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegional() {
        return regional;
    }

    /**
     * D�finit la valeur de la propri�t� regional.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegional(String value) {
        this.regional = value;
    }

    /**
     * Obtient la valeur de la propri�t� specBac.
     * 
     * @return
     *     possible object is
     *     {@link TypeBac }
     *     
     */
    public TypeBac getSpecBac() {
        return specBac;
    }

    /**
     * D�finit la valeur de la propri�t� specBac.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBac }
     *     
     */
    public void setSpecBac(TypeBac value) {
        this.specBac = value;
    }

}
