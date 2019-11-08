
package tr.com.yurticikargo.shippingorderdispatcherservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for queryShipmentDetailResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="queryShipmentDetailResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ShipmentDeliveryResultVO" type="{http://yurticikargo.com.tr/ShippingOrderDispatcherServices}shipmentDeliveryResultVO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "queryShipmentDetailResponse", propOrder = {
    "shipmentDeliveryResultVO"
})
public class QueryShipmentDetailResponse {

    @XmlElement(name = "ShipmentDeliveryResultVO")
    protected ShipmentDeliveryResultVO shipmentDeliveryResultVO;

    /**
     * Gets the value of the shipmentDeliveryResultVO property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentDeliveryResultVO }
     *     
     */
    public ShipmentDeliveryResultVO getShipmentDeliveryResultVO() {
        return shipmentDeliveryResultVO;
    }

    /**
     * Sets the value of the shipmentDeliveryResultVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentDeliveryResultVO }
     *     
     */
    public void setShipmentDeliveryResultVO(ShipmentDeliveryResultVO value) {
        this.shipmentDeliveryResultVO = value;
    }

}
