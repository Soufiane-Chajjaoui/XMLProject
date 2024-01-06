package com.example.merise.MCDToJaxB;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "FiliereDiplome")
@XmlAccessorType(XmlAccessType.FIELD)
public class FiliereDiplome {

    @XmlAttribute(name = "idFiliere" , required = true)
    private String idFiliere ;

    @XmlElement(name = "Filiere")
    private FiliereEnum someOtherNameForFiliereEnum;
    public FiliereDiplome() {
    }

    public FiliereDiplome(String idF, FiliereEnum f) {
        this.idFiliere = idF;
        this.someOtherNameForFiliereEnum = f;
    }

    public String getIdFiliere() {
        return idFiliere;
    }

    public void setIdFiliere(String idF) {
        this.idFiliere = idF;
    }

    public FiliereEnum getfiliere_enum() {
        return someOtherNameForFiliereEnum;
    }

    public void setfiliere_enum(FiliereEnum filiere) {
        this.someOtherNameForFiliereEnum = filiere;
    }
}
