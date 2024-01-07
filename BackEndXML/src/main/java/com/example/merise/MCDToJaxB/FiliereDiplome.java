package com.example.merise.MCDToJaxB;

import javax.xml.bind.annotation.*;
import java.util.UUID;

@XmlRootElement(name = "FiliereDiplome")
@XmlAccessorType(XmlAccessType.FIELD)
public class FiliereDiplome {

    @XmlAttribute(name = "idFiliere" , required = true)
    private UUID idFiliere ;

    @XmlElement(name = "Filiere")
    private FilierDiplomeEnum filiereDiplome;
    public FiliereDiplome() {
    }

    public FiliereDiplome(UUID idF, FilierDiplomeEnum f) {
        this.idFiliere = UUID.randomUUID();
        this.filiereDiplome = f;
    }

    public UUID getIdFiliere() {
        return idFiliere;
    }

    public void setIdFiliere(UUID idF) {
        this.idFiliere = idF;
    }

    public FilierDiplomeEnum getFiliereDiplome() {
        return filiereDiplome;
    }

    public void setFiliereDiplome(FilierDiplomeEnum filiere) {
        this.filiereDiplome = filiere;
    }
}
