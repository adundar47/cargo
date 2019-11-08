
package tr.com.yurticikargo.shippingorderdispatcherservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for shippingOrderResultVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="shippingOrderResultVO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://yurticikargo.com.tr/ShippingOrderDispatcherServices}extendedBaseResultVO">
 *       &lt;sequence>
 *         &lt;element name="count" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="jobId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="shippingOrderDetailVO" type="{http://yurticikargo.com.tr/ShippingOrderDispatcherServices}shippingOrderDetailVO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "shippingOrderResultVO", propOrder = {
    "count",
    "jobId",
    "shippingOrderDetailVO"
})
public class ShippingOrderResultVO
    extends ExtendedBaseResultVO
{

    protected long count;
    protected long jobId;
    @XmlElement(nillable = true)
    protected List<ShippingOrderDetailVO> shippingOrderDetailVO;

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
     * Gets the value of the jobId property.
     * 
     */
    public long getJobId() {
        return jobId;
    }

    /**
     * Sets the value of the jobId property.
     * 
     */
    public void setJobId(long value) {
        this.jobId = value;
    }

    /**
     * Gets the value of the shippingOrderDetailVO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shippingOrderDetailVO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShippingOrderDetailVO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShippingOrderDetailVO }
     * 
     * 
     */
    public List<ShippingOrderDetailVO> getShippingOrderDetailVO() {
        if (shippingOrderDetailVO == null) {
            shippingOrderDetailVO = new ArrayList<ShippingOrderDetailVO>();
        }
        return this.shippingOrderDetailVO;
    }

}
