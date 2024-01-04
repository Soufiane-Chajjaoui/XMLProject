package com.example.merise.EntetiesXMLBind;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;


@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Etablissment {

    @XmlElement(name = "Etudiants")
    private List<Etudiant> etudiants ;

    public Etablissment() {
        etudiants = new ArrayList<Etudiant>();
    }

    public Etablissment(List<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }

    public List<Etudiant> getEtudiants() {
        return etudiants;
    }

    public void setEtudiants(Etudiant etudiants) {
        this.etudiants.add(etudiants);
    }


}
