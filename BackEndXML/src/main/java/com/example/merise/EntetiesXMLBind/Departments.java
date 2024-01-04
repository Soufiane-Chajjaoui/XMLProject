package com.example.merise.EntetiesXMLBind;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Departments {
    @XmlElement(name = "Departments")
    private List<Department> departments;
}
