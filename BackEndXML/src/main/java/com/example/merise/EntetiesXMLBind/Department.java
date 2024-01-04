package com.example.merise.EntetiesXMLBind;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "Department")
@XmlAccessorType(XmlAccessType.FIELD)
public class Department {

    @XmlAttribute(name = "idDepartment" , required = true)
    private String idDepartment ;

    @XmlElement
    private String value ;

    public Department() {
    }

    public Department(String idDepartment, String value) {
        this.idDepartment = idDepartment;
        this.value = value;
    }

    public String getIdDepartment() {
        return idDepartment;
    }

    public void setIdDepartment(String idDepartment) {
        this.idDepartment = idDepartment;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
