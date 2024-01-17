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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour diplome complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="diplome">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NoteS1" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="NoteS2" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="NoteS3" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="NoteS4" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ValidationFirstYear" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ValidationSecondYear" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="NbretudiantsFirstYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NbretudiantsSecondYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Order" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ImageReleve" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ImageDeplome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mention" type="{}mention" minOccurs="0"/>
 *         &lt;element ref="{}FiliereDiplome" minOccurs="0"/>
 *         &lt;element name="TypeDiplome" type="{}typeDiplome" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="idDeplome" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="NoteDeplome" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "diplome", propOrder = {
    "noteS1",
    "noteS2",
    "noteS3",
    "noteS4",
    "validationFirstYear",
    "validationSecondYear",
    "nbretudiantsFirstYear",
    "nbretudiantsSecondYear",
    "order",
    "imageReleve",
    "imageDeplome",
    "mention",
    "filiereDiplome",
    "typeDiplome"
})
public class Diplome {

    @XmlElement(name = "NoteS1")
    protected double noteS1;
    @XmlElement(name = "NoteS2")
    protected double noteS2;
    @XmlElement(name = "NoteS3")
    protected double noteS3;
    @XmlElement(name = "NoteS4")
    protected double noteS4;
    @XmlElement(name = "ValidationFirstYear")
    protected double validationFirstYear;
    @XmlElement(name = "ValidationSecondYear")
    protected double validationSecondYear;
    @XmlElement(name = "NbretudiantsFirstYear")
    protected int nbretudiantsFirstYear;
    @XmlElement(name = "NbretudiantsSecondYear")
    protected int nbretudiantsSecondYear;
    @XmlElement(name = "Order")
    protected int order;
    @XmlElement(name = "ImageReleve")
    protected String imageReleve;
    @XmlElement(name = "ImageDeplome")
    protected String imageDeplome;
    @XmlElement(name = "Mention")
    @XmlSchemaType(name = "string")
    protected Mention mention;
    @XmlElement(name = "FiliereDiplome")
    protected FiliereDiplome filiereDiplome;
    @XmlElement(name = "TypeDiplome")
    protected TypeDiplome typeDiplome;
    @XmlAttribute(name = "idDeplome")
    protected String idDeplome;
    @XmlAttribute(name = "NoteDeplome", required = true)
    protected double noteDeplome;

    /**
     * Obtient la valeur de la propriété noteS1.
     * 
     */
    public double getNoteS1() {
        return noteS1;
    }

    /**
     * Définit la valeur de la propriété noteS1.
     * 
     */
    public void setNoteS1(double value) {
        this.noteS1 = value;
    }

    /**
     * Obtient la valeur de la propriété noteS2.
     * 
     */
    public double getNoteS2() {
        return noteS2;
    }

    /**
     * Définit la valeur de la propriété noteS2.
     * 
     */
    public void setNoteS2(double value) {
        this.noteS2 = value;
    }

    /**
     * Obtient la valeur de la propriété noteS3.
     * 
     */
    public double getNoteS3() {
        return noteS3;
    }

    /**
     * Définit la valeur de la propriété noteS3.
     * 
     */
    public void setNoteS3(double value) {
        this.noteS3 = value;
    }

    /**
     * Obtient la valeur de la propriété noteS4.
     * 
     */
    public double getNoteS4() {
        return noteS4;
    }

    /**
     * Définit la valeur de la propriété noteS4.
     * 
     */
    public void setNoteS4(double value) {
        this.noteS4 = value;
    }

    /**
     * Obtient la valeur de la propriété validationFirstYear.
     * 
     */
    public double getValidationFirstYear() {
        return validationFirstYear;
    }

    /**
     * Définit la valeur de la propriété validationFirstYear.
     * 
     */
    public void setValidationFirstYear(double value) {
        this.validationFirstYear = value;
    }

    /**
     * Obtient la valeur de la propriété validationSecondYear.
     * 
     */
    public double getValidationSecondYear() {
        return validationSecondYear;
    }

    /**
     * Définit la valeur de la propriété validationSecondYear.
     * 
     */
    public void setValidationSecondYear(double value) {
        this.validationSecondYear = value;
    }

    /**
     * Obtient la valeur de la propriété nbretudiantsFirstYear.
     * 
     */
    public int getNbretudiantsFirstYear() {
        return nbretudiantsFirstYear;
    }

    /**
     * Définit la valeur de la propriété nbretudiantsFirstYear.
     * 
     */
    public void setNbretudiantsFirstYear(int value) {
        this.nbretudiantsFirstYear = value;
    }

    /**
     * Obtient la valeur de la propriété nbretudiantsSecondYear.
     * 
     */
    public int getNbretudiantsSecondYear() {
        return nbretudiantsSecondYear;
    }

    /**
     * Définit la valeur de la propriété nbretudiantsSecondYear.
     * 
     */
    public void setNbretudiantsSecondYear(int value) {
        this.nbretudiantsSecondYear = value;
    }

    /**
     * Obtient la valeur de la propriété order.
     * 
     */
    public int getOrder() {
        return order;
    }

    /**
     * Définit la valeur de la propriété order.
     * 
     */
    public void setOrder(int value) {
        this.order = value;
    }

    /**
     * Obtient la valeur de la propriété imageReleve.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageReleve() {
        return imageReleve;
    }

    /**
     * Définit la valeur de la propriété imageReleve.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageReleve(String value) {
        this.imageReleve = value;
    }

    /**
     * Obtient la valeur de la propriété imageDeplome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageDeplome() {
        return imageDeplome;
    }

    /**
     * Définit la valeur de la propriété imageDeplome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageDeplome(String value) {
        this.imageDeplome = value;
    }

    /**
     * Obtient la valeur de la propriété mention.
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
     * Définit la valeur de la propriété mention.
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
     * Obtient la valeur de la propriété filiereDiplome.
     * 
     * @return
     *     possible object is
     *     {@link FiliereDiplome }
     *     
     */
    public FiliereDiplome getFiliereDiplome() {
        return filiereDiplome;
    }

    /**
     * Définit la valeur de la propriété filiereDiplome.
     * 
     * @param value
     *     allowed object is
     *     {@link FiliereDiplome }
     *     
     */
    public void setFiliereDiplome(FiliereDiplome value) {
        this.filiereDiplome = value;
    }

    /**
     * Obtient la valeur de la propriété typeDiplome.
     * 
     * @return
     *     possible object is
     *     {@link TypeDiplome }
     *     
     */
    public TypeDiplome getTypeDiplome() {
        return typeDiplome;
    }

    /**
     * Définit la valeur de la propriété typeDiplome.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDiplome }
     *     
     */
    public void setTypeDiplome(TypeDiplome value) {
        this.typeDiplome = value;
    }

    /**
     * Obtient la valeur de la propriété idDeplome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdDeplome() {
        return idDeplome;
    }

    /**
     * Définit la valeur de la propriété idDeplome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdDeplome(String value) {
        this.idDeplome = value;
    }

    /**
     * Obtient la valeur de la propriété noteDeplome.
     * 
     */
    public double getNoteDeplome() {
        return noteDeplome;
    }

    /**
     * Définit la valeur de la propriété noteDeplome.
     * 
     */
    public void setNoteDeplome(double value) {
        this.noteDeplome = value;
    }

}
