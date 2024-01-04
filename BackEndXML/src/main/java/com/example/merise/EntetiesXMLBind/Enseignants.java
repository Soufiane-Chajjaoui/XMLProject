package com.example.merise.EntetiesXMLBind;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Enseignants {

    @XmlElement(name = "Enseignant")
    private List<Enseignant> enseignants = new ArrayList<Enseignant>();

    public Enseignants() {
    }

    public Enseignants(List<Enseignant> enseignants) {
        this.enseignants.addAll(enseignants);
    }

    public List<Enseignant> getEnseignants() {
        return enseignants;
    }

    public void setEnseignants(Enseignant enseignants) {
        this.enseignants.add(enseignants);
    }
}
