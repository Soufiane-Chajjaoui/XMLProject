package com.example.merise.MCDToJaxB;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
public class TypeNote {
    @XmlValue
    @XmlJavaTypeAdapter(MyBigDecimalAdapter.class)
    private BigDecimal note;

    public TypeNote() {
    }

    public TypeNote(BigDecimal note) {
        this.note = note;
    }

    public BigDecimal getNote() {
        return note;
    }

    public void setNote(BigDecimal note) {
        this.note = note;
    }
}
