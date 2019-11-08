
package tr.com.yurticikargo.sswintegrationservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listInvDocumentByWaybillNoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listInvDocumentByWaybillNoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ShippingDataResponseVO" type="{http://yurticikargo.com.tr/sswIntegrationServices}shippingDataResponseVO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listInvDocumentByWaybillNoResponse", propOrder = {
    "shippingDataResponseVO"
})
public class ListInvDocumentByWaybillNoResponse {

    @XmlElement(name = "ShippingDataResponseVO")
    protected ShippingDataResponseVO shippingDataResponseVO;

    /**
     * Gets the value of the shippingDataResponseVO property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingDataResponseVO }
     *     
     */
    public ShippingDataResponseVO getShippingDataResponseVO() {
        return shippingDataResponseVO;
    }

    /**
     * Sets the value of the shippingDataResponseVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingDataResponseVO }
     *     
     */
    public void setShippingDataResponseVO(ShippingDataResponseVO value) {
        this.shippingDataResponseVO = value;
    }

}
