package com.example.merise.MCDToJaxB;

import javax.xml.bind.annotation.XmlEnum;

@XmlEnum
public enum TypeDiplomeEnum {
    BTS("Brevet de technicien supérieur" ), // Replace null with the associated Etablissment for BTS
    DUT("ECOLE SUPERIEUR DE TECHNOLOGIE"); // Replace with the actual Etablissment name

    TypeDiplomeEnum(String s) {
    }
}
