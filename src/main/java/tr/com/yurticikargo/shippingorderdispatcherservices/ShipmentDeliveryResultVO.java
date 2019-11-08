
package tr.com.yurticikargo.shippingorderdispatcherservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for shipmentDeliveryResultVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="shipmentDeliveryResultVO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://yurticikargo.com.tr/ShippingOrderDispatcherServices}extendedBaseResultVO">
 *       &lt;sequence>
 *         &lt;element name="count" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="deliveryResultData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="senderCustId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="shipmentDeliveryDetailVO" type="{http://yurticikargo.com.tr/ShippingOrderDispatcherServices}shipmentDeliveryDetailVO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "shipmentDeliveryResultVO", propOrder = {
    "count",
    "deliveryResultData",
    "senderCustId",
    "shipmentDeliveryDetailVO"
})
public class ShipmentDeliveryResultVO
    extends ExtendedBaseResultVO
{

    protected long count;
    protected String deliveryResultData;
    protected long senderCustId;
    @XmlElement(nillable = true)
    protected List<ShipmentDeliveryDetailVO> shipmentDeliveryDetailVO;

    /**
     * Gets the value of the count property.
     * 
     */
    public long getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     */
    public void setCount(long value) {
        this.count = value;
    }

    /**
     * Gets the value of the deliveryResultData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryResultData() {
        return deliveryResultData;
    }

    /**
     * Sets the value of the deliveryResultData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryResultData(String value) {
        this.deliveryResultData = value;
    }

    /**
     * Gets the value of the senderCustId property.
     * 
     */
    public long getSenderCustId() {
        return senderCustId;
    }

    /**
     * Sets the value of the senderCustId property.
     * 
     */
    public void setSenderCustId(long value) {
        this.senderCustId = value;
    }

    /**
     * Gets the value of the shipmentDeliveryDetailVO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipmentDeliveryDetailVO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipmentDeliveryDetailVO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentDeliveryDetailVO }
     * 
     * 
     */
    public List<ShipmentDeliveryDetailVO> getShipmentDeliveryDetailVO() {
        if (shipmentDeliveryDetailVO == null) {
            shipmentDeliveryDetailVO = new ArrayList<ShipmentDeliveryDetailVO>();
        }
        return this.shipmentDeliveryDetailVO;
    }

}
