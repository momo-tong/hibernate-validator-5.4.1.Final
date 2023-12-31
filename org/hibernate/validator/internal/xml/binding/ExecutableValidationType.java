//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.16 at 05:15:33 PM UTC 
//


package org.hibernate.validator.internal.xml.binding;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for executable-validationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="executable-validationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="default-validated-executable-types" type="{http://jboss.org/xml/ns/javax/validation/configuration}default-validated-executable-typesType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "executable-validationType", namespace = "http://jboss.org/xml/ns/javax/validation/configuration", propOrder = {
    "defaultValidatedExecutableTypes"
})
public class ExecutableValidationType {

    @XmlElement(name = "default-validated-executable-types")
    protected DefaultValidatedExecutableTypesType defaultValidatedExecutableTypes;
    @XmlAttribute(name = "enabled")
    protected Boolean enabled;

    /**
     * Gets the value of the defaultValidatedExecutableTypes property.
     * 
     * @return
     *     possible object is
     *     {@link DefaultValidatedExecutableTypesType }
     *     
     */
    public DefaultValidatedExecutableTypesType getDefaultValidatedExecutableTypes() {
        return defaultValidatedExecutableTypes;
    }

    /**
     * Sets the value of the defaultValidatedExecutableTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultValidatedExecutableTypesType }
     *     
     */
    public void setDefaultValidatedExecutableTypes(DefaultValidatedExecutableTypesType value) {
        this.defaultValidatedExecutableTypes = value;
    }

    /**
     * Gets the value of the enabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getEnabled() {
        if (enabled == null) {
            return true;
        } else {
            return enabled;
        }
    }

    /**
     * Sets the value of the enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnabled(Boolean value) {
        this.enabled = value;
    }

}
