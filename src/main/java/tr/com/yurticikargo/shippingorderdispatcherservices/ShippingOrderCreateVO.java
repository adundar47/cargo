
package tr.com.yurticikargo.shippingorderdispatcherservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for shippingOrderCreateVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="shippingOrderCreateVO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://yurticikargo.com.tr/ShippingOrderDispatcherServices}ShippingOrderVO">
 *       &lt;sequence>
 *         &lt;element name="orderData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "shippingOrderCreateVO", propOrder = {
    "orderData"
})
public class ShippingOrderCreateVO
    extends ShippingOrderVO
{

    protected String orderData;

    /**
     * Gets the value of the orderData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderData() {
        return orderData;
    }

    /**
     * Sets the value of the orderData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderData(String value) {
        this.orderData = value;
    }

}
