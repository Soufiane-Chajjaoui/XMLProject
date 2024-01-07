package com.example.merise.MCDToJaxB;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@XmlAccessorType(XmlAccessType.FIELD)
public class Condidature {

    @XmlAttribute(name = "idCondidature")
    private UUID idCondidature;
    @XmlElement(name = "Choix")
    private List<FiliereEnum> choix = new ArrayList<>();

    public Condidature() {
        this.idCondidature = UUID.randomUUID();
    }

    public Condidature(UUID idCondidature, List<FiliereEnum> choix) {
        this.idCondidature = UUID.randomUUID();
        this.choix = choix;
    }

    public UUID getIdCondidature() {
        return idCondidature;
    }

    public void setIdCondidature(UUID idCondidature) {
        this.idCondidature = UUID.randomUUID();
    }

    public List<FiliereEnum> getChoix() {
        return choix;
    }

    public void setChoix(List<FiliereEnum> choix) {
        this.choix.addAll(choix);
    }
}
