package com.example.merise.EntetiesXMLBind;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class EtudiantXML extends PersonXML {

    private String CNE;
    private BacXML bac;

    @XmlElement(name = "CNE", required = true)
    public String getCNE() {
        return CNE;
    }

    public void setCNE(String CNE) {
        this.CNE = CNE;
    }

    @XmlElement(name = "Bac", required = true)
    public BacXML getBac() {
        return bac;
    }

    public void setBac(BacXML bac) {
        this.bac = bac;
    }
}

