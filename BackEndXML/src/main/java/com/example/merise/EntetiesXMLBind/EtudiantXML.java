package com.example.merise.EntetiesXMLBind;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class EtudiantXML extends PersonXML {

    private String cne;
    private BacXML bac;

    @XmlAttribute(name = "cne", required = true)
    public String getCne() {
        return cne;
    }

    public void setCne(String CNE) {
        this.cne = CNE;
    }

    @XmlElement(name = "Bac", required = true)
    public BacXML getBac() {
        return bac;
    }

    public void setBac(BacXML bac) {
        this.bac = bac;
    }
}

