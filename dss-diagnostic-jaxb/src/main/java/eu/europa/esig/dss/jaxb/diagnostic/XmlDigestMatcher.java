//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package eu.europa.esig.dss.jaxb.diagnostic;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import eu.europa.esig.dss.validation.DigestMatcherType;


/**
 * <p>Java class for DigestMatcher complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DigestMatcher"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dss.esig.europa.eu/validation/diagnostic}DigestAlgoAndValue"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataFound" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="DataIntact" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="type" use="required" type="{http://dss.esig.europa.eu/validation/diagnostic}DigestMatcherType" /&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DigestMatcher", propOrder = {
    "dataFound",
    "dataIntact"
})
public class XmlDigestMatcher
    extends XmlDigestAlgoAndValue
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "DataFound")
    protected boolean dataFound;
    @XmlElement(name = "DataIntact")
    protected boolean dataIntact;
    @XmlAttribute(name = "type", required = true)
    @XmlJavaTypeAdapter(Adapter3 .class)
    protected DigestMatcherType type;
    @XmlAttribute(name = "name")
    protected String name;

    /**
     * Gets the value of the dataFound property.
     * 
     */
    public boolean isDataFound() {
        return dataFound;
    }

    /**
     * Sets the value of the dataFound property.
     * 
     */
    public void setDataFound(boolean value) {
        this.dataFound = value;
    }

    /**
     * Gets the value of the dataIntact property.
     * 
     */
    public boolean isDataIntact() {
        return dataIntact;
    }

    /**
     * Sets the value of the dataIntact property.
     * 
     */
    public void setDataIntact(boolean value) {
        this.dataIntact = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DigestMatcherType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(DigestMatcherType value) {
        this.type = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}