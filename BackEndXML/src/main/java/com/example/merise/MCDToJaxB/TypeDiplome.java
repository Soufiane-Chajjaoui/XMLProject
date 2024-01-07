package com.example.merise.MCDToJaxB;

import javax.xml.bind.annotation.*;
import java.util.UUID;

@XmlAccessorType(XmlAccessType.FIELD)
public class TypeDiplome {

    @XmlAttribute(name = "idTypeDiplome")
    private UUID idTypeDiplome ;

    @XmlValue
    private TypeDiplomeEnum typeDiplome ;

    public TypeDiplome() {
    }

    public TypeDiplome(UUID idTypeDiplome, TypeDiplomeEnum typeDiplome) {
        this.idTypeDiplome = UUID.randomUUID();
        this.typeDiplome = typeDiplome;
    }

    public UUID getIdTypeDiplome() {
        return idTypeDiplome;
    }

    public void setIdTypeDiplome(UUID idTypeDiplome) {
        this.idTypeDiplome = idTypeDiplome;
    }

    public TypeDiplomeEnum getTypeDiplome() {
        return typeDiplome;
    }

    public void setTypeDiplome(TypeDiplomeEnum typeDiplome) {
        this.typeDiplome = typeDiplome;
    }
}
