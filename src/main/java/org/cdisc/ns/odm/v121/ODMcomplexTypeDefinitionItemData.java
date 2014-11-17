//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.03.09 at 11:44:30 AM EST 
//


package org.cdisc.ns.odm.v121;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.openclinica.ns.odm_ext_v121.v31.OCodmComplexTypeDefinitionAuditLogs;
import org.openclinica.ns.odm_ext_v121.v31.OCodmComplexTypeDefinitionDiscrepancyNotes;


/**
 * <p>Java class for ODMcomplexTypeDefinition-ItemData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ODMcomplexTypeDefinition-ItemData">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cdisc.org/ns/odm/v1.2}ODMcomplexTypeDefinition-ItemData">
 *       &lt;redefine>
 *         &lt;complexType name="ODMcomplexTypeDefinition-ItemData">
 *           &lt;complexContent>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *               &lt;sequence>
 *                 &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}AuditRecord" minOccurs="0"/>
 *                 &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}Signature" minOccurs="0"/>
 *                 &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}MeasurementUnitRef" minOccurs="0"/>
 *                 &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}Annotation" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;group ref="{http://www.cdisc.org/ns/odm/v1.2}ItemDataElementExtension" maxOccurs="unbounded" minOccurs="0"/>
 *               &lt;/sequence>
 *               &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.2}ItemDataAttributeDefinition"/>
 *               &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.2}ItemDataAttributeExtension"/>
 *             &lt;/restriction>
 *           &lt;/complexContent>
 *         &lt;/complexType>
 *       &lt;/redefine>
 *       &lt;sequence>
 *         &lt;element ref="{http://www.openclinica.org/ns/odm_ext_v121/v3.1}AuditLogs" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.openclinica.org/ns/odm_ext_v121/v3.1}DiscrepancyNotes" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-ItemData", propOrder = {
    "auditLogs",
    "discrepancyNotes"
})
public class ODMcomplexTypeDefinitionItemData
    extends OriginalODMcomplexTypeDefinitionItemData
{

    @XmlElement(name = "AuditLogs", namespace = "http://www.openclinica.org/ns/odm_ext_v121/v3.1")
    protected List<OCodmComplexTypeDefinitionAuditLogs> auditLogs;
    @XmlElement(name = "DiscrepancyNotes", namespace = "http://www.openclinica.org/ns/odm_ext_v121/v3.1")
    protected List<OCodmComplexTypeDefinitionDiscrepancyNotes> discrepancyNotes;

    /**
     * Gets the value of the auditLogs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the auditLogs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuditLogs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OCodmComplexTypeDefinitionAuditLogs }
     * 
     * 
     */
    public List<OCodmComplexTypeDefinitionAuditLogs> getAuditLogs() {
        if (auditLogs == null) {
            auditLogs = new ArrayList<OCodmComplexTypeDefinitionAuditLogs>();
        }
        return this.auditLogs;
    }

    /**
     * Gets the value of the discrepancyNotes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the discrepancyNotes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiscrepancyNotes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OCodmComplexTypeDefinitionDiscrepancyNotes }
     * 
     * 
     */
    public List<OCodmComplexTypeDefinitionDiscrepancyNotes> getDiscrepancyNotes() {
        if (discrepancyNotes == null) {
            discrepancyNotes = new ArrayList<OCodmComplexTypeDefinitionDiscrepancyNotes>();
        }
        return this.discrepancyNotes;
    }

}
