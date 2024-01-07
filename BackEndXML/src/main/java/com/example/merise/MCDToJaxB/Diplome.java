package com.example.merise.MCDToJaxB;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Pattern;

import javax.xml.bind.annotation.*;
import java.util.UUID;

@XmlAccessorType(XmlAccessType.FIELD)
public class Diplome {

    @XmlAttribute(name = "idDeplome")
//    @XmlID n'est pas compatible avec UUID elle accorde just avec String
    private UUID idDiplome = UUID.randomUUID();
    @XmlAttribute(name = "NoteDeplome")
    @Digits(fraction = 2 , message = "just 4 digit not more", integer = 4)
    @DecimalMax(value = "20" , inclusive = true)
    @DecimalMin(value = "10" , inclusive = true)
    private double noteDiplome;
    @XmlElement(name = "NoteS1")
    private double notes1 ;
    @XmlElement(name = "NoteS2")
    private double notes2 ;
    @XmlElement(name = "NoteS3")
    private double notes3 ;
    @XmlElement(name = "NoteS4")
    private double notes4 ;
    @XmlElement(name = "ValidationFirstYear")
    private double validationFirstYear;
    @XmlElement(name = "ValidationSecondYear")
    private double validationSecondYear;
    @XmlElement(name = "NbretudiantsFirstYear")
    private int NbretudiantsFirstYear ;
    @XmlElement(name = "NbretudiantsSecondYear")
    private int NbretudiantsSecondYear ;

    @XmlElement(name = "Order")
    private int order;

    @XmlElement(name = "ImageReleve")
    @Pattern(regexp = ".*\\.(jpg|jpeg|png|gif|bmp)$", message = "Invalid image file format")
    private String ImageReleve;

    @XmlElement(name = "ImageDiplome")
    private String ImageDiplome;

    @XmlElement(name = "Mention")
    private Mention mention;

    @XmlElement(name = "FiliereDiplome")
    private FilierDiplomeEnum someOtherNameForFiliereDiplome;


    @XmlElement(name = "TypeDiplome")
    private TypeDiplomeEnum typeDiplome;

    public Diplome() {
        this.ImageDiplome = "assets/Diplome.txt" ;
        this.ImageReleve = "assets/Releve.txt" ;
    }

    public Diplome(UUID idDeplome, double noteDeplome, double notes1
            , double notes2, double notes3, double notes4
            , double validationFirstYear, double validationSecondYear
            , int nbretudiantsFirstYear, int nbretudiantsSecondYear
            , int order, String imageReleve, String ImageDiplome
            , Mention mention, FilierDiplomeEnum filiere, TypeDiplomeEnum typeDiplome) {
        this.idDiplome = UUID.randomUUID();
        this.noteDiplome = noteDeplome;
        this.notes1 = notes1;
        this.notes2 = notes2;
        this.notes3 = notes3;
        this.notes4 = notes4;
        this.validationFirstYear = validationFirstYear;
        this.validationSecondYear = validationSecondYear;
        NbretudiantsFirstYear = nbretudiantsFirstYear;
        NbretudiantsSecondYear = nbretudiantsSecondYear;
        this.order = order;
        ImageReleve = "assets/Releve.txt";
        ImageDiplome = "assets/Deplome.txt";
        this.mention = mention;
        this.someOtherNameForFiliereDiplome = filiere;
        this.typeDiplome = typeDiplome;
    }

    public Mention getMention() {
        return mention;
    }

    public void setMention(Mention mention) {
        this.mention = mention;
    }

    public FilierDiplomeEnum getFiliereDiplome() {
        return someOtherNameForFiliereDiplome;
    }

    public void setFiliereDiplome(FilierDiplomeEnum filiereDiplome) {
        this.someOtherNameForFiliereDiplome = filiereDiplome;
    }

    public TypeDiplomeEnum getTypeDiplome() {
        return typeDiplome;
    }

    public void setTypeDiplome(TypeDiplomeEnum typeDiplome) {
        this.typeDiplome = typeDiplome;
    }

    public UUID getIdDiplome() {
        return idDiplome;
    }

    public void setIdDiplome() {
        this.idDiplome = UUID.randomUUID();
    }

    public double getNoteDiplome() {
        return noteDiplome;
    }

    public void setNoteDiplome(double noteDeplome) {
        this.noteDiplome = noteDeplome;
    }

    public double getNotes1() {
        return notes1;
    }

    public void setNotes1(double notes1) {
        this.notes1 = notes1;
    }

    public double getNotes2() {
        return notes2;
    }

    public void setNotes2(double notes2) {
        this.notes2 = notes2;
    }

    public double getNotes3() {
        return notes3;
    }

    public void setNotes3(double notes3) {
        this.notes3 = notes3;
    }

    public double getNotes4() {
        return notes4;
    }

    public void setNotes4(double notes4) {
        this.notes4 = notes4;
    }

    public double getValidationFirstYear() {
        return validationFirstYear;
    }

    public void setValidationFirstYear(double validationFirstYear) {
        this.validationFirstYear = validationFirstYear;
    }

    public double getValidationSecondYear() {
        return validationSecondYear;
    }

    public void setValidationSecondYear(double validationSecondYear) {
        this.validationSecondYear = validationSecondYear;
    }

    public int getNbretudiantsFirstYear() {
        return NbretudiantsFirstYear;
    }

    public void setNbretudiantsFirstYear(int nbretudiantsFirstYear) {
        NbretudiantsFirstYear = nbretudiantsFirstYear;
    }

    public int getNbretudiantsSecondYear() {
        return NbretudiantsSecondYear;
    }

    public void setNbretudiantsSecondYear(int nbretudiantsSecondYear) {
        NbretudiantsSecondYear = nbretudiantsSecondYear;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public String getImageReleve() {
        return ImageReleve;
    }

    public void setImageReleve(String imageReleve) {
        ImageReleve = "assets/Releve.txt";
    }

    public String getImageDiplome() {
        return ImageDiplome;
    }

    public void setImageDiplome(String ImageDiplome) {
        ImageDiplome = "assets/Deplome.txt";
    }
}
