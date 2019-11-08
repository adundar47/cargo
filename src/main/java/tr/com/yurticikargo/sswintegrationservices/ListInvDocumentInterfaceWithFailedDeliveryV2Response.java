
package tr.com.yurticikargo.sswintegrationservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listInvDocumentInterfaceWithFailedDeliveryV2Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listInvDocumentInterfaceWithFailedDeliveryV2Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ShippingDataResponseVO" type="{http://yurticikargo.com.tr/sswIntegrationServices}shippingDataV2ResponseVO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listInvDocumentInterfaceWithFailedDeliveryV2Response", propOrder = {
    "shippingDataResponseVO"
})
public class ListInvDocumentInterfaceWithFailedDeliveryV2Response {

    @XmlElement(name = "ShippingDataResponseVO")
    protected ShippingDataV2ResponseVO shippingDataResponseVO;

    /**
     * Gets the value of the shippingDataResponseVO property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingDataV2ResponseVO }
     *     
     */
    public ShippingDataV2ResponseVO getShippingDataResponseVO() {
        return shippingDataResponseVO;
    }

    /**
     * Sets the value of the shippingDataResponseVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingDataV2ResponseVO }
     *     
     */
    public void setShippingDataResponseVO(ShippingDataV2ResponseVO value) {
        this.shippingDataResponseVO = value;
    }

}
