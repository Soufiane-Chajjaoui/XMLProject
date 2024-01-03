package com.example.merise.EntetiesXMLBind;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NotesXML {

    private String national;
    private String regional;

    @XmlElement(name = "National")
    public String getNational() {
        return national;
    }

    public void setNational(String national) {
        this.national = national;
    }

    @XmlElement(name = "Regional")
    public String getRegional() {
        return regional;
    }

    public void setRegional(String regional) {
        this.regional = regional;
    }
}
