package com.example.merise.MCDToJaxB;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class TypeDiplome {

    @XmlAttribute(name = "idTypeDiplome")
    private String idTypeDiplome ;

    @XmlElement(name = "TypeDiplome")
    private TypeDiplomeEnum typeDiplome ;

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
