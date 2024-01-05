package com.example.merise.MCDToJaxB;


import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Etudiant")
public class Etudiant extends Person {

    private String cne;
    private Bac bac;

    private Condidature condidature;

    public Etudiant() {
    }

    public Etudiant(String idPerson, String prenom, String nom, String tele, String email, String address, String sex, String dateNaissance, String cne, Bac bac, Condidature condidature) {
        super(idPerson, prenom, nom, tele, email, address, sex, dateNaissance);
        this.cne = cne;
        this.bac = bac;
        this.condidature = condidature;
    }

    public Etudiant(String cne, Bac bac, Condidature condidature) {
        this.cne = cne;
        this.bac = bac;
        this.condidature = condidature;
    }




    @XmlElement(name = "Condidature")
    public Condidature getCondidature() {
        return condidature;
    }

    public void setCondidature(Condidature condidature) {
        this.condidature = condidature;
    }

    @XmlAttribute(name = "cne", required = true)
    public String getCne() {
        return cne;
    }

    public void setCne(String CNE) {
        this.cne = CNE;
    }

    @XmlElement(name = "Bac", required = true)
    public Bac getBac() {
        return bac;
    }

    public void setBac(Bac bac) {
        this.bac = bac;
    }
}

