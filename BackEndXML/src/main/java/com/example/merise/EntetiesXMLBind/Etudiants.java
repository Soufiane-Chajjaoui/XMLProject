package com.example.merise.EntetiesXMLBind;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "Etudiants")
@XmlAccessorType(XmlAccessType.FIELD)
public class Etudiants {

    @XmlElement
    private List<Etudiant> etudiant = new ArrayList<Etudiant>();

    public Etudiants() {
    }

    public Etudiants(Etudiant e){
        this.etudiant.add(e);
    }
    public Etudiants(List<Etudiant> etudiants) {
        this.etudiant.addAll(etudiants);
    }

    public List<Etudiant> getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant.add(etudiant);
    }
}
