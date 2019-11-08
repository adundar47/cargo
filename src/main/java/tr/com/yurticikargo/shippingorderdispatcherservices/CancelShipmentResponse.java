
package tr.com.yurticikargo.shippingorderdispatcherservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cancelShipmentResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cancelShipmentResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ShippingOrderResultVO" type="{http://yurticikargo.com.tr/ShippingOrderDispatcherServices}shippingCancelResultVO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cancelShipmentResponse", propOrder = {
    "shippingOrderResultVO"
})
public class CancelShipmentResponse {

    @XmlElement(name = "ShippingOrderResultVO")
    protected ShippingCancelResultVO shippingOrderResultVO;

    /**
     * Gets the value of the shippingOrderResultVO property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingCancelResultVO }
     *     
     */
    public ShippingCancelResultVO getShippingOrderResultVO() {
        return shippingOrderResultVO;
    }

    /**
     * Sets the value of the shippingOrderResultVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingCancelResultVO }
     *     
     */
    public void setShippingOrderResultVO(ShippingCancelResultVO value) {
        this.shippingOrderResultVO = value;
    }

}
