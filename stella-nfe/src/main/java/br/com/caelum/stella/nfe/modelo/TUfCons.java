//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.04.23 at 03:29:27 PM BRT 
//


package br.com.caelum.stella.nfe.modelo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;



@XmlType(name = "TUfCons")
@XmlEnum
public enum TUfCons {

    AC,
    AL,
    AM,
    AP,
    BA,
    CE,
    DF,
    ES,
    GO,
    MA,
    MG,
    MS,
    MT,
    PA,
    PB,
    PE,
    PI,
    PR,
    RJ,
    RN,
    RO,
    RR,
    RS,
    SC,
    SE,
    SP,
    TO,
    SU;

    public String value() {
        return name();
    }

    public static TUfCons fromValue(String v) {
        return valueOf(v);
    }

}
