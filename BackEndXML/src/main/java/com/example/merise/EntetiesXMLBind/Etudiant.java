package com.example.merise.EntetiesXMLBind;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Etudiant")
public class Etudiant extends Person {

    private String cne;
    private Bac bac;
    @XmlAttribute(name = "cne", required = true)
    public String getCne() {
        return cne;
    }

    public void setCne(String CNE) {
        this.cne = CNE;
    }

    @XmlElement(name = "Bac", required = true)
    public Bac getBac() {
        return bac;
    }

    public void setBac(Bac bac) {
        this.bac = bac;
    }
}

