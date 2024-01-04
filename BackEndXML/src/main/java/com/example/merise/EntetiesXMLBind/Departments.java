package com.example.merise.EntetiesXMLBind;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class Departments {

    @XmlElement(name = "Departments")
    private List<Department> departments = new ArrayList<Department>();

    public Departments() {
    }

    public Departments(List<Department> departments) {
        this.departments = departments;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(Department department) {
        this.departments.add(department);
    }
}
