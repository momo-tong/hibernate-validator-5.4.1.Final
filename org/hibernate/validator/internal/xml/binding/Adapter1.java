//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.16 at 05:15:33 PM UTC 
//


package org.hibernate.validator.internal.xml.binding;

import javax.validation.executable.ExecutableType;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter1
    extends XmlAdapter<String, ExecutableType>
{


    public ExecutableType unmarshal(String value) {
        return (javax.validation.executable.ExecutableType.valueOf(value));
    }

    public String marshal(ExecutableType value) {
        if (value == null) {
            return null;
        }
        return value.toString();
    }

}
