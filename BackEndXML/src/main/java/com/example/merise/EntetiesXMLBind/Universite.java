package com.example.merise.EntetiesXMLBind;

import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Universite {

    @XmlAttribute(name = "idUniversite" , required = true)
    private String idUniversite;

    @XmlAttribute(name = "UniversiteNom")
    private String UniversiteNom ;

    @XmlElement(name = "Etablissments" , required = true)
    private Etablissments etablissments ;



    public Universite() {
    }



    public String getIdUniversite() {
        return idUniversite;
    }

    public void setIdUniversite(String idUniversite) {
        this.idUniversite = idUniversite;
    }

    public String getUniversiteNom() {
        return UniversiteNom;
    }

    public void setUniversiteNom(String universiteNom) {
        UniversiteNom = universiteNom;
    }
}
