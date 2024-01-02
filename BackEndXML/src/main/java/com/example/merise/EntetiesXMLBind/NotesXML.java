package com.example.merise.EntetiesXMLBind;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NotesXML {

    private NoteXML noteNational;
    private NoteXML noteRegional;

    @XmlElement(name = "NoteNational", required = true)
    public NoteXML getNoteNational() {
        return noteNational;
    }

    public void setNoteNational(NoteXML noteNational) {
        this.noteNational = noteNational;
    }

    @XmlElement(name = "NoteRegional", required = true)
    public NoteXML getNoteRegional() {
        return noteRegional;
    }

    public void setNoteRegional(NoteXML noteRegional) {
        this.noteRegional = noteRegional;
    }
}
