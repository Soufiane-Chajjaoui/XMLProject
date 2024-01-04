package com.example.merise.EntetiesXMLBind;

import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Matiere {

    @XmlAttribute(name = "idMatiere")
    private String idMatiere;

    @XmlValue
    private String matiere;

    public Matiere() {

    }

    public Matiere(String idMatiere, String matiere) {
        this.idMatiere = idMatiere;
        this.matiere = matiere;
    }

    public String getIdMatiere() {
        return idMatiere;
    }

    public void setIdMatiere(String idMatiere) {
        this.idMatiere = idMatiere;
    }

    public String getMatiere() {
        return matiere;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }
}
