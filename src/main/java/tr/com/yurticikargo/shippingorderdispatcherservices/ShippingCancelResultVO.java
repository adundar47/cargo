
package tr.com.yurticikargo.shippingorderdispatcherservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for shippingCancelResultVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="shippingCancelResultVO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://yurticikargo.com.tr/ShippingOrderDispatcherServices}extendedBaseResultVO">
 *       &lt;sequence>
 *         &lt;element name="count" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="senderCustId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="shippingCancelDetailVO" type="{http://yurticikargo.com.tr/ShippingOrderDispatcherServices}shippingCancelDetailVO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "shippingCancelResultVO", propOrder = {
    "count",
    "senderCustId",
    "shippingCancelDetailVO"
})
public class ShippingCancelResultVO
    extends ExtendedBaseResultVO
{

    protected long count;
    protected long senderCustId;
    @XmlElement(nillable = true)
    protected List<ShippingCancelDetailVO> shippingCancelDetailVO;

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
     * Gets the value of the shippingCancelDetailVO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shippingCancelDetailVO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShippingCancelDetailVO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShippingCancelDetailVO }
     * 
     * 
     */
    public List<ShippingCancelDetailVO> getShippingCancelDetailVO() {
        if (shippingCancelDetailVO == null) {
            shippingCancelDetailVO = new ArrayList<ShippingCancelDetailVO>();
        }
        return this.shippingCancelDetailVO;
    }

}
