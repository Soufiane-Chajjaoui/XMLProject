package com.example.merise.MCDToJaxB;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;

public class FiliereDiplome {

    @XmlAttribute(name = "idFiliere")
    @XmlID
    private String idFiliere ;

    @XmlElement
    private FiliereEnum filiere ;

}
