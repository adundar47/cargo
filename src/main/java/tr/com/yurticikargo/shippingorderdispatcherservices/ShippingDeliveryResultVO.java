
package tr.com.yurticikargo.shippingorderdispatcherservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for shippingDeliveryResultVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="shippingDeliveryResultVO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://yurticikargo.com.tr/ShippingOrderDispatcherServices}extendedBaseResultVO">
 *       &lt;sequence>
 *         &lt;element name="count" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="senderCustId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="shippingDeliveryDetailVO" type="{http://yurticikargo.com.tr/ShippingOrderDispatcherServices}shippingDeliveryDetailVO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "shippingDeliveryResultVO", propOrder = {
    "count",
    "senderCustId",
    "shippingDeliveryDetailVO"
})
public class ShippingDeliveryResultVO
    extends ExtendedBaseResultVO
{

    protected long count;
    protected long senderCustId;
    @XmlElement(nillable = true)
    protected List<ShippingDeliveryDetailVO> shippingDeliveryDetailVO;

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
     * Gets the value of the shippingDeliveryDetailVO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shippingDeliveryDetailVO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShippingDeliveryDetailVO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShippingDeliveryDetailVO }
     * 
     * 
     */
    public List<ShippingDeliveryDetailVO> getShippingDeliveryDetailVO() {
        if (shippingDeliveryDetailVO == null) {
            shippingDeliveryDetailVO = new ArrayList<ShippingDeliveryDetailVO>();
        }
        return this.shippingDeliveryDetailVO;
    }

}
