//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.05.05 at 12:24:05 AM EDT 
//


package org.cdisc.ns.odm.v130;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ODMcomplexTypeDefinition-GlobalVariables complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ODMcomplexTypeDefinition-GlobalVariables"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}StudyName"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}StudyDescription"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}ProtocolName"/&gt;
 *         &lt;group ref="{http://www.cdisc.org/ns/odm/v1.3}GlobalVariablesElementExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3}GlobalVariablesAttributeExtension"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-GlobalVariables", propOrder = {
    "studyName",
    "studyDescription",
    "protocolName"
})
public class ODMcomplexTypeDefinitionGlobalVariables
    implements Serializable
{

    @XmlElement(name = "StudyName", required = true)
    protected ODMcomplexTypeDefinitionStudyName studyName;
    @XmlElement(name = "StudyDescription", required = true)
    protected ODMcomplexTypeDefinitionStudyDescription studyDescription;
    @XmlElement(name = "ProtocolName", required = true)
    protected ODMcomplexTypeDefinitionProtocolName protocolName;

    /**
     * Gets the value of the studyName property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionStudyName }
     *     
     */
    public ODMcomplexTypeDefinitionStudyName getStudyName() {
        return studyName;
    }

    /**
     * Sets the value of the studyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionStudyName }
     *     
     */
    public void setStudyName(ODMcomplexTypeDefinitionStudyName value) {
        this.studyName = value;
    }

    public boolean isSetStudyName() {
        return (this.studyName!= null);
    }

    /**
     * Gets the value of the studyDescription property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionStudyDescription }
     *     
     */
    public ODMcomplexTypeDefinitionStudyDescription getStudyDescription() {
        return studyDescription;
    }

    /**
     * Sets the value of the studyDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionStudyDescription }
     *     
     */
    public void setStudyDescription(ODMcomplexTypeDefinitionStudyDescription value) {
        this.studyDescription = value;
    }

    public boolean isSetStudyDescription() {
        return (this.studyDescription!= null);
    }

    /**
     * Gets the value of the protocolName property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionProtocolName }
     *     
     */
    public ODMcomplexTypeDefinitionProtocolName getProtocolName() {
        return protocolName;
    }

    /**
     * Sets the value of the protocolName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionProtocolName }
     *     
     */
    public void setProtocolName(ODMcomplexTypeDefinitionProtocolName value) {
        this.protocolName = value;
    }

    public boolean isSetProtocolName() {
        return (this.protocolName!= null);
    }

}
