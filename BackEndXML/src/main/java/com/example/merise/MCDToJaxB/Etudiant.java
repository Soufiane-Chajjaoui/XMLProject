package com.example.merise.MCDToJaxB;


import javax.xml.bind.annotation.*;
import java.util.UUID;

@XmlRootElement(name = "Etudiant")
@XmlAccessorType(XmlAccessType.FIELD)
public class Etudiant extends Person {
    @XmlAttribute(name = "cne", required = true)
    private String cne;
    @XmlElement(name = "Bac", required = true)
    private Bac bac;
    @XmlElement(name = "Condidature")
    private Condidature condidature;
    @XmlElement(name = "Diplome")
    private Diplome diplome ;

    public Etudiant() {
    }

    public Etudiant(UUID idPerson, String prenom, String nom, String tele, String email, String address, SexEnum sex, String dateNaissance, String cne, Bac bac,
                    Condidature condidature , Diplome diplome) {
        super(idPerson, prenom, nom, tele, email, address, sex, dateNaissance);
        this.cne = cne;
        this.bac = bac;
        this.condidature = condidature;
        this.diplome = diplome;
    }

    public Etudiant(String cne, Bac bac, Condidature condidature) {
        this.cne = cne;
        this.bac = bac;
        this.condidature = condidature;
    }




    public Condidature getCondidature() {
        return condidature;
    }

    public void setCondidature(Condidature condidature) {
        this.condidature = condidature;
    }

    public String getCne() {
        return cne;
    }

    public void setCne(String CNE) {
        this.cne = CNE;
    }

    public Bac getBac() {
        return bac;
    }

    public void setBac(Bac bac) {
        this.bac = bac;
    }
}

