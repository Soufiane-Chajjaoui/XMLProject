//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2024.01.15 à 03:42:44 PM WET 
//


package org.xmlProjet.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour mention.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="mention">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PASSABLE"/>
 *     &lt;enumeration value="BIEN"/>
 *     &lt;enumeration value="ASSEZ_BIEN"/>
 *     &lt;enumeration value="TRES_BIEN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "mention")
@XmlEnum
public enum Mention {

    PASSABLE,
    BIEN,
    ASSEZ_BIEN,
    TRES_BIEN;

    public String value() {
        return name();
    }

    public static Mention fromValue(String v) {
        return valueOf(v);
    }

}
