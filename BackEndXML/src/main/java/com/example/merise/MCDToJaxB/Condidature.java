package com.example.merise.MCDToJaxB;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class Condidature {

    @XmlAttribute(name = "idCondidature")
    private String idCondidature;
    @XmlElement(name = "Choix")
    private List<FiliereEnum> choix = new ArrayList<>();

    public Condidature() {
    }

    public Condidature(String idCondidature, List<FiliereEnum> choix) {
        this.idCondidature = idCondidature;
        this.choix = choix;
    }

    public String getIdCondidature() {
        return idCondidature;
    }

    public void setIdCondidature(String idCondidature) {
        this.idCondidature = idCondidature;
    }

    public List<FiliereEnum> getChoix() {
        return choix;
    }

    public void setChoix(FiliereEnum choix) {
        this.choix.add(choix);
    }
}
