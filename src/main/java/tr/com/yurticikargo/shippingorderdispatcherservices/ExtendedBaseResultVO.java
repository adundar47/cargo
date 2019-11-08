
package tr.com.yurticikargo.shippingorderdispatcherservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for extendedBaseResultVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="extendedBaseResultVO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://yurticikargo.com.tr/ShippingOrderDispatcherServices}baseResultVO">
 *       &lt;sequence>
 *         &lt;element name="errCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "extendedBaseResultVO", propOrder = {
    "errCode"
})
@XmlSeeAlso({
    ShippingCancelResultVO.class,
    ShippingOrderResultVO.class,
    ShippingDeliveryResultVO.class,
    ShipmentDeliveryResultVO.class
})
public class ExtendedBaseResultVO
    extends BaseResultVO
{

    protected String errCode;

    /**
     * Gets the value of the errCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrCode() {
        return errCode;
    }

    /**
     * Sets the value of the errCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrCode(String value) {
        this.errCode = value;
    }

}
