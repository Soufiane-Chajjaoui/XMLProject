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
 * <p>Classe Java pour typeDiplome complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="typeDiplome">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TypeDiplome" type="{}typeDiplomeEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="idTypeDiplome" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeDiplome", propOrder = {
    "typeDiplome"
})
public class TypeDiplome {

    @XmlElement(name = "TypeDiplome")
    @XmlSchemaType(name = "string")
    protected TypeDiplomeEnum typeDiplome;
    @XmlAttribute(name = "idTypeDiplome")
    protected String idTypeDiplome;

    /**
     * Obtient la valeur de la propri�t� typeDiplome.
     * 
     * @return
     *     possible object is
     *     {@link TypeDiplomeEnum }
     *     
     */
    public TypeDiplomeEnum getTypeDiplome() {
        return typeDiplome;
    }

    /**
     * D�finit la valeur de la propri�t� typeDiplome.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDiplomeEnum }
     *     
     */
    public void setTypeDiplome(TypeDiplomeEnum value) {
        this.typeDiplome = value;
    }

    /**
     * Obtient la valeur de la propri�t� idTypeDiplome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdTypeDiplome() {
        return idTypeDiplome;
    }

    /**
     * D�finit la valeur de la propri�t� idTypeDiplome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdTypeDiplome(String value) {
        this.idTypeDiplome = value;
    }

}
