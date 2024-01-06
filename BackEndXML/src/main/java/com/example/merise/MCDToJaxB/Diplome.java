package com.example.merise.MCDToJaxB;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class Diplome {

    @XmlAttribute(name = "idDeplome")
//    @XmlID
    private String idDeplome;
    @XmlAttribute(name = "NoteDeplome")
    private double noteDeplome;
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
    private String ImageReleve;

    @XmlElement(name = "ImageDeplome")
    private String ImageDeplome;

    @XmlElement(name = "Mention")
    private Mention mention;

    @XmlElement(name = "FiliereDiplome")
    private FiliereDiplome someOtherNameForFiliereDiplome;


    @XmlElement(name = "TypeDiplome")
    private TypeDiplome typeDiplome;

    public Diplome() {
    }

    public Diplome(String idDeplome, double noteDeplome, double notes1
            , double notes2, double notes3, double notes4
            , double validationFirstYear, double validationSecondYear
            , int nbretudiantsFirstYear, int nbretudiantsSecondYear
            , int order, String imageReleve, String imageDeplome
            , Mention mention, FiliereDiplome filiere, TypeDiplome typeDiplome) {
        this.idDeplome = idDeplome;
        this.noteDeplome = noteDeplome;
        this.notes1 = notes1;
        this.notes2 = notes2;
        this.notes3 = notes3;
        this.notes4 = notes4;
        this.validationFirstYear = validationFirstYear;
        this.validationSecondYear = validationSecondYear;
        NbretudiantsFirstYear = nbretudiantsFirstYear;
        NbretudiantsSecondYear = nbretudiantsSecondYear;
        this.order = order;
        ImageReleve = imageReleve;
        ImageDeplome = imageDeplome;
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

    public FiliereDiplome getFiliereDiplome() {
        return someOtherNameForFiliereDiplome;
    }

    public void setFiliereDiplome(FiliereDiplome filiereDiplome) {
        this.someOtherNameForFiliereDiplome = filiereDiplome;
    }

    public TypeDiplome getTypeDiplome() {
        return typeDiplome;
    }

    public void setTypeDiplome(TypeDiplome typeDiplome) {
        this.typeDiplome = typeDiplome;
    }

    public String getIdDeplome() {
        return idDeplome;
    }

    public void setIdDeplome(String idDeplome) {
        this.idDeplome = idDeplome;
    }

    public double getNoteDeplome() {
        return noteDeplome;
    }

    public void setNoteDeplome(double noteDeplome) {
        this.noteDeplome = noteDeplome;
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
        ImageReleve = imageReleve;
    }

    public String getImageDeplome() {
        return ImageDeplome;
    }

    public void setImageDeplome(String imageDeplome) {
        ImageDeplome = imageDeplome;
    }
}
