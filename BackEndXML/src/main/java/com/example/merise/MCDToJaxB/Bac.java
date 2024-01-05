package com.example.merise.MCDToJaxB;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Bac")
public class Bac {

    private TypeBac specBac;
    private String dateBac;
    private String national;
    private String regional;

    @XmlElement(name = "SpecBac", required = true)
    public TypeBac getSpecBac() {
        return specBac;
    }

    public void setSpecBac(TypeBac specBac) {
        this.specBac = specBac;
    }

    @XmlElement(name = "National" , required = true )
    public String getNational() {
        return national;
    }

    public void setNational(String national) {
        this.national = national;
    }

    @XmlElement(name = "Regional" , required = true)
    public String getRegional() {
        return regional;
    }

    public void setRegional(String regional) {
        this.regional = regional;
    }

    @XmlElement(name = "DateBac", required = true)
    public String getDateBac() {
        return dateBac;
    }

    public void setDateBac(String dateBac) {
        this.dateBac = dateBac;
    }
}
