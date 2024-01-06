package com.example.merise.MCDToJaxB;


import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "Etudiants")
@XmlAccessorType(XmlAccessType.FIELD)
public class Etudiants {

    @XmlElement(name = "Etudiant")
    private List<Etudiant> etudiant = new ArrayList<Etudiant>();

    public Etudiants() {
    }

    public List<Etudiant> getEtudiants() {
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant.add(etudiant);
    }
    public void setEtudiants(List<Etudiant> etudiants){
        this.etudiant.addAll(etudiants);
    }
}
