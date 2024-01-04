package com.example.merise.EntetiesXMLBind;


import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Etablissment {

    @XmlElement
    private List<Etudiant> etudiants = new ArrayList<Etudiant>();

    public Etablissment() {
    }

    public Etablissment(List<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }

    public List<Etudiant> getEtudiants() {
        return etudiants;
    }

    public void setEtudiants(List<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }


}
