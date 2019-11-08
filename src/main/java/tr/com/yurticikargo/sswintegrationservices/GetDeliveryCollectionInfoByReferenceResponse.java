
package tr.com.yurticikargo.sswintegrationservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getDeliveryCollectionInfoByReferenceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getDeliveryCollectionInfoByReferenceResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DeliveryCollectionDataResponseVO" type="{http://yurticikargo.com.tr/sswIntegrationServices}deliveryCollectionDataResponseVO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDeliveryCollectionInfoByReferenceResponse", propOrder = {
    "deliveryCollectionDataResponseVO"
})
public class GetDeliveryCollectionInfoByReferenceResponse {

    @XmlElement(name = "DeliveryCollectionDataResponseVO")
    protected DeliveryCollectionDataResponseVO deliveryCollectionDataResponseVO;

    /**
     * Gets the value of the deliveryCollectionDataResponseVO property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryCollectionDataResponseVO }
     *     
     */
    public DeliveryCollectionDataResponseVO getDeliveryCollectionDataResponseVO() {
        return deliveryCollectionDataResponseVO;
    }

    /**
     * Sets the value of the deliveryCollectionDataResponseVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryCollectionDataResponseVO }
     *     
     */
    public void setDeliveryCollectionDataResponseVO(DeliveryCollectionDataResponseVO value) {
        this.deliveryCollectionDataResponseVO = value;
    }

}
