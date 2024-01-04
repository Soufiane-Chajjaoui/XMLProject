package com.example.merise.EntetiesXMLBind;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "etablissment")
@XmlAccessorType(XmlAccessType.FIELD)
public class Etablissment {

    @XmlElement(name = "Etudiants" , required = true)
    private Etudiants etudiants ;
    @XmlElement(name = "Enseignants" , required = true)
    private Enseignants enseignants ;

    public Etablissment() {
    }

    public Etablissment(Etudiants etudiants) {
        this.etudiants = etudiants;
    }


    public Etudiants getEtudiants() {
        return etudiants;
    }

    public void setEtudiants(Etudiants etudiants) {
        this.etudiants = etudiants;
    }

    public Enseignants getEnseignants() {
        return enseignants;
    }

    public void setEnseignants(Enseignants enseignants) {
        this.enseignants = enseignants;
    }
}
