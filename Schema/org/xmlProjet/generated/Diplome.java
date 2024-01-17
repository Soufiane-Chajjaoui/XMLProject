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
 * <p>Classe Java pour diplome complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
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
     * Obtient la valeur de la propri�t� noteS1.
     * 
     */
    public double getNoteS1() {
        return noteS1;
    }

    /**
     * D�finit la valeur de la propri�t� noteS1.
     * 
     */
    public void setNoteS1(double value) {
        this.noteS1 = value;
    }

    /**
     * Obtient la valeur de la propri�t� noteS2.
     * 
     */
    public double getNoteS2() {
        return noteS2;
    }

    /**
     * D�finit la valeur de la propri�t� noteS2.
     * 
     */
    public void setNoteS2(double value) {
        this.noteS2 = value;
    }

    /**
     * Obtient la valeur de la propri�t� noteS3.
     * 
     */
    public double getNoteS3() {
        return noteS3;
    }

    /**
     * D�finit la valeur de la propri�t� noteS3.
     * 
     */
    public void setNoteS3(double value) {
        this.noteS3 = value;
    }

    /**
     * Obtient la valeur de la propri�t� noteS4.
     * 
     */
    public double getNoteS4() {
        return noteS4;
    }

    /**
     * D�finit la valeur de la propri�t� noteS4.
     * 
     */
    public void setNoteS4(double value) {
        this.noteS4 = value;
    }

    /**
     * Obtient la valeur de la propri�t� validationFirstYear.
     * 
     */
    public double getValidationFirstYear() {
        return validationFirstYear;
    }

    /**
     * D�finit la valeur de la propri�t� validationFirstYear.
     * 
     */
    public void setValidationFirstYear(double value) {
        this.validationFirstYear = value;
    }

    /**
     * Obtient la valeur de la propri�t� validationSecondYear.
     * 
     */
    public double getValidationSecondYear() {
        return validationSecondYear;
    }

    /**
     * D�finit la valeur de la propri�t� validationSecondYear.
     * 
     */
    public void setValidationSecondYear(double value) {
        this.validationSecondYear = value;
    }

    /**
     * Obtient la valeur de la propri�t� nbretudiantsFirstYear.
     * 
     */
    public int getNbretudiantsFirstYear() {
        return nbretudiantsFirstYear;
    }

    /**
     * D�finit la valeur de la propri�t� nbretudiantsFirstYear.
     * 
     */
    public void setNbretudiantsFirstYear(int value) {
        this.nbretudiantsFirstYear = value;
    }

    /**
     * Obtient la valeur de la propri�t� nbretudiantsSecondYear.
     * 
     */
    public int getNbretudiantsSecondYear() {
        return nbretudiantsSecondYear;
    }

    /**
     * D�finit la valeur de la propri�t� nbretudiantsSecondYear.
     * 
     */
    public void setNbretudiantsSecondYear(int value) {
        this.nbretudiantsSecondYear = value;
    }

    /**
     * Obtient la valeur de la propri�t� order.
     * 
     */
    public int getOrder() {
        return order;
    }

    /**
     * D�finit la valeur de la propri�t� order.
     * 
     */
    public void setOrder(int value) {
        this.order = value;
    }

    /**
     * Obtient la valeur de la propri�t� imageReleve.
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
     * D�finit la valeur de la propri�t� imageReleve.
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
     * Obtient la valeur de la propri�t� imageDeplome.
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
     * D�finit la valeur de la propri�t� imageDeplome.
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
     * Obtient la valeur de la propri�t� filiereDiplome.
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
     * D�finit la valeur de la propri�t� filiereDiplome.
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
     * Obtient la valeur de la propri�t� typeDiplome.
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
     * D�finit la valeur de la propri�t� typeDiplome.
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
     * Obtient la valeur de la propri�t� idDeplome.
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
     * D�finit la valeur de la propri�t� idDeplome.
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
     * Obtient la valeur de la propri�t� noteDeplome.
     * 
     */
    public double getNoteDeplome() {
        return noteDeplome;
    }

    /**
     * D�finit la valeur de la propri�t� noteDeplome.
     * 
     */
    public void setNoteDeplome(double value) {
        this.noteDeplome = value;
    }

}
