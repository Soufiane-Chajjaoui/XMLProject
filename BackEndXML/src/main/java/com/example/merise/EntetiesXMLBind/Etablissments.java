package com.example.merise.EntetiesXMLBind;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Etablissments {

    @XmlElement
    private List<Etablissment> etablissments ;



    public Etablissments( Etablissment etablissment) {
        this.etablissments.add(etablissment);
    }
}
