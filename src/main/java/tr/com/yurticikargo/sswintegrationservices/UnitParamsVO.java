
package tr.com.yurticikargo.sswintegrationservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnitParamsVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnitParamsVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="departureUnitId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deliveryUnitId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnitParamsVO", propOrder = {
    "departureUnitId",
    "deliveryUnitId"
})
public class UnitParamsVO {

    protected String departureUnitId;
    protected String deliveryUnitId;

    /**
     * Gets the value of the departureUnitId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureUnitId() {
        return departureUnitId;
    }

    /**
     * Sets the value of the departureUnitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureUnitId(String value) {
        this.departureUnitId = value;
    }

    /**
     * Gets the value of the deliveryUnitId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryUnitId() {
        return deliveryUnitId;
    }

    /**
     * Sets the value of the deliveryUnitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryUnitId(String value) {
        this.deliveryUnitId = value;
    }

}
