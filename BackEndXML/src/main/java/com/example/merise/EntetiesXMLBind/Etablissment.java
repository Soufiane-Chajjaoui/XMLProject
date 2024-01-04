package com.example.merise.EntetiesXMLBind;


import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Etablissment {

    @XmlElement
    private List<Etudiant> etudiants = new ArrayList<Etudiant>();
    @XmlElement
    private List<Enseignant> enseignants = new ArrayList<Enseignant>() ;

    public Etablissment() {
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
