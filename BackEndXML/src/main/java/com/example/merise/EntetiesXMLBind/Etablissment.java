package com.example.merise.EntetiesXMLBind;


import javax.xml.bind.annotation.*;


@XmlRootElement(name = "Etablissment")
@XmlAccessorType(XmlAccessType.FIELD)
public class Etablissment {


    @XmlAttribute(name = "idEtablissment", required = true)
    @XmlID
    private String idEtablissment;

    @XmlAttribute(name = "NomEtablissment", required = true)
    private String nomEtablissment;

    @XmlAttribute(name = "VileEtablissment", required = true)
    private String villeEtablissment;

    @XmlAttribute(name = "RefUniversite", required = true)
    private String refUniversite;

    @XmlElement(name = "Etudiants", required = true)
    private Etudiants etudiants;

    @XmlElement(name = "Enseignants", required = true)
    private Enseignants enseignants;

    public Etablissment() {
    }

    public Etablissment(String idEtablissment, String nomEtablissment, String villeEtablissment, String refUniversite) {
        this.idEtablissment = idEtablissment;
        this.nomEtablissment = nomEtablissment;
        this.villeEtablissment = villeEtablissment;
        this.refUniversite = refUniversite;
    }


    public Etablissment(String idetablissment){
        this.idEtablissment = idetablissment ;
    }

    public String getNomEtablissment() {
        return nomEtablissment;
    }

    public void setNomEtablissment(String nomEtablissment) {
        this.nomEtablissment = nomEtablissment;
    }

    public String getVilleEtablissment() {
        return villeEtablissment;
    }

    public void setVilleEtablissment(String villeEtablissment) {
        this.villeEtablissment = villeEtablissment;
    }

    public String getRefUniversite() {
        return refUniversite;
    }

    public void setRefUniversite(String refUniversite) {
        this.refUniversite = refUniversite;
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
