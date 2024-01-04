package com.example.merise.EntetiesXMLBind;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Universite {


    @XmlAttribute(name = "idUniversite" , required = true)
    private String idUniversite;
    @XmlAttribute(name = "UniversiteName" , required = true)
    private String UniversiteName;

    public Universite() {
    }

    public Universite(String idUniversite, String idUniversite1) {
        this.idUniversite = idUniversite;
        this.idUniversite = idUniversite1;
    }

    public String getIdUniversite() {
        return idUniversite;
    }

    public void setIdUniversite(String idUniversite) {
        this.idUniversite = idUniversite;
    }

}
