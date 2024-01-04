package com.example.merise.EntetiesXMLBind;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Etablissments {

    @XmlElement(name = "Etablissment" , required = true)
    private Etablissment Etablissment ;
}
