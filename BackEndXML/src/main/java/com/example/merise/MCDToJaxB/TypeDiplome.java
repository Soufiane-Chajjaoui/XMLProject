package com.example.merise.MCDToJaxB;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class TypeDiplome {

    @XmlAttribute(name = "idTypeDiplome")
    private String idTypeDiplome ;

    @XmlValue
    private TypeDiplomeEnum typeDiplome ;

    public TypeDiplome() {
    }

    public TypeDiplome(String idTypeDiplome, TypeDiplomeEnum typeDiplome) {
        this.idTypeDiplome = idTypeDiplome;
        this.typeDiplome = typeDiplome;
    }

    public String getIdTypeDiplome() {
        return idTypeDiplome;
    }

    public void setIdTypeDiplome(String idTypeDiplome) {
        this.idTypeDiplome = idTypeDiplome;
    }

    public TypeDiplomeEnum getTypeDiplome() {
        return typeDiplome;
    }

    public void setTypeDiplome(TypeDiplomeEnum typeDiplome) {
        this.typeDiplome = typeDiplome;
    }
}
