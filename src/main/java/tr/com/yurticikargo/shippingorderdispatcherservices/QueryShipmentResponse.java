
package tr.com.yurticikargo.shippingorderdispatcherservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for queryShipmentResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="queryShipmentResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ShippingDeliveryVO" type="{http://yurticikargo.com.tr/ShippingOrderDispatcherServices}shippingDeliveryResultVO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "queryShipmentResponse", propOrder = {
    "shippingDeliveryVO"
})
public class QueryShipmentResponse {

    @XmlElement(name = "ShippingDeliveryVO")
    protected ShippingDeliveryResultVO shippingDeliveryVO;

    /**
     * Gets the value of the shippingDeliveryVO property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingDeliveryResultVO }
     *     
     */
    public ShippingDeliveryResultVO getShippingDeliveryVO() {
        return shippingDeliveryVO;
    }

    /**
     * Sets the value of the shippingDeliveryVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingDeliveryResultVO }
     *     
     */
    public void setShippingDeliveryVO(ShippingDeliveryResultVO value) {
        this.shippingDeliveryVO = value;
    }

}
