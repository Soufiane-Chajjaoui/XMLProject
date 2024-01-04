package com.example.merise.EntetiesXMLBind;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Department {

    @XmlAttribute(name = "RefEtablissment")
    private String refEtablissment;

    private String nomDep;

    public Department() {
    }

    public Department(String refEtablissment, String nomDep) {
        this.refEtablissment = refEtablissment;
        this.nomDep = nomDep;
    }

    public String getRefEtablissment() {
        return refEtablissment;
    }

    public void setRefEtablissment(String refEtablissment) {
        this.refEtablissment = refEtablissment;
    }

    public String getNomDep() {
        return nomDep;
    }

    public void setNomDep(String nomDep) {
        this.nomDep = nomDep;
    }
}
