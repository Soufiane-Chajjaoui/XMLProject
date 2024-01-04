package com.example.merise.EntetiesXMLBind;


import javax.xml.bind.annotation.*;


@XmlRootElement(name = "Etablissment")
@XmlAccessorType(XmlAccessType.FIELD)
public class Etablissment {

    @XmlAttribute(name = "idEtablissment" , required = true)
    @XmlID
    private String idEtablissment ;
    @XmlElement(name = "Etudiants" , required = true)
    private Etudiants etudiants ;
    @XmlElement(name = "Enseignants" , required = true)
    private Enseignants enseignants ;

    public Etablissment() {
    }

    public Etablissment(String idetablissment){
        this.idEtablissment = idetablissment ;
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

    public String getIdEtablissment() {
        return idEtablissment;
    }

    public void setIdEtablissment(String idEtablissment) {
        this.idEtablissment = idEtablissment;
    }
}
