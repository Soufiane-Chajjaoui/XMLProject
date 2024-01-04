package com.example.merise.EntetiesXMLBind;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "Etablissments")
public class Etablissments {

    @XmlElement(name = "Etablissment")
    private List<Etablissment> etablissments = new ArrayList<>();

    public List<Etablissment> getEtablissments() {
        return etablissments;
    }

    public void setEtablissments(List<Etablissment> etablissments) {
        this.etablissments = etablissments;
    }

    public void addEtablissment(Etablissment etablissment) {
        this.etablissments.add(etablissment);
    }
}
