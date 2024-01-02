package com.example.merise.EntetiesXMLBind;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class BacXML {
    
    private String specBac;
    private NotesXML notes;
    private String dateBac;

    @XmlElement(name = "SpecBac", required = true)
    public String getSpecBac() {
        return specBac;
    }

    public void setSpecBac(String specBac) {
        this.specBac = specBac;
    }

    @XmlElement(name = "Notes", required = true)
    public NotesXML getNotes() {
        return notes;
    }

    public void setNotes(NotesXML notes) {
        this.notes = notes;
    }

    @XmlElement(name = "DateBac", required = true)
    public String getDateBac() {
        return dateBac;
    }

    public void setDateBac(String dateBac) {
        this.dateBac = dateBac;
    }
}
