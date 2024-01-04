package com.example.merise.EntetiesXMLBind;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Enseignant extends  Person{

    @XmlAttribute(name = "refEtablissment" , required = true)
    private String refEtablissment;
    @XmlElement(name = "Matieres")
    private List<Matiere> matieres = new ArrayList<Matiere>();

    public Enseignant() {
    }

    public Enseignant(String refEtablissment, List<Matiere> matieres) {
        this.refEtablissment = refEtablissment;
        this.matieres = matieres;
    }

    public Enseignant(String idPerson, String refEtablissment, String prenom, String nom, String tele, String email, String address, String sex, String dateNaissance, String refEtablissment1, List<Matiere> matieres) {
        super(idPerson, refEtablissment, prenom, nom, tele, email, address, sex, dateNaissance);
        this.refEtablissment = refEtablissment1;
        this.matieres = matieres;
    }

    public List<Matiere> getMatieres() {
        return matieres;
    }

    public void setMatieres(List<Matiere> matieres) {
        this.matieres = matieres;
    }


    @Override
    public String getRefEtablissment() {
        return refEtablissment;
    }

    @Override
    public void setRefEtablissment(String refEtablissment) {
        this.refEtablissment = refEtablissment;
    }

    public List<Matiere> getMatiers() {
        return matieres;
    }

    public void setMatieres(Matiere matiere) {
        this.matieres.add(matiere);
    }
}
