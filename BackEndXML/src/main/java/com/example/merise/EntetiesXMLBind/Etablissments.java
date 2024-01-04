package com.example.merise.EntetiesXMLBind;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "Etablissments")
@XmlAccessorType(XmlAccessType.FIELD)
public class Etablissments {

    @XmlElement(name = "Etablissment")
    private List<Etablissment> etablissmentList = new ArrayList<>();

    public List<Etablissment> getEtablissments() {
        return etablissmentList;
    }

    public void setEtablissments(List<Etablissment> etablissments) {
        this.etablissmentList = etablissments;
    }

    public void addEtablissment(Etablissment etablissment) {
        this.etablissmentList.add(etablissment);
    }
}
