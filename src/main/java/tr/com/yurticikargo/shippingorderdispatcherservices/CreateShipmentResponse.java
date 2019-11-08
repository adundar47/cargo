
package tr.com.yurticikargo.shippingorderdispatcherservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createShipmentResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createShipmentResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ShippingOrderResultVO" type="{http://yurticikargo.com.tr/ShippingOrderDispatcherServices}shippingOrderResultVO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createShipmentResponse", propOrder = {
    "shippingOrderResultVO"
})
public class CreateShipmentResponse {

    @XmlElement(name = "ShippingOrderResultVO")
    protected ShippingOrderResultVO shippingOrderResultVO;

    /**
     * Gets the value of the shippingOrderResultVO property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingOrderResultVO }
     *     
     */
    public ShippingOrderResultVO getShippingOrderResultVO() {
        return shippingOrderResultVO;
    }

    /**
     * Sets the value of the shippingOrderResultVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingOrderResultVO }
     *     
     */
    public void setShippingOrderResultVO(ShippingOrderResultVO value) {
        this.shippingOrderResultVO = value;
    }

}
