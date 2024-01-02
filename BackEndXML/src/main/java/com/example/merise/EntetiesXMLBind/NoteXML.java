package com.example.merise.EntetiesXMLBind;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NoteXML {

    private double value;

    @XmlElement(name = "Value", required = true)
    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
