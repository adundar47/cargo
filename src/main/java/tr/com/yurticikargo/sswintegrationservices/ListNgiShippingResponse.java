
package tr.com.yurticikargo.sswintegrationservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listNgiShippingResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listNgiShippingResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="XShippingV2ResponseVO" type="{http://yurticikargo.com.tr/sswIntegrationServices}xShippingV2ResponseVO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listNgiShippingResponse", propOrder = {
    "xShippingV2ResponseVO"
})
public class ListNgiShippingResponse {

    @XmlElement(name = "XShippingV2ResponseVO")
    protected XShippingV2ResponseVO xShippingV2ResponseVO;

    /**
     * Gets the value of the xShippingV2ResponseVO property.
     * 
     * @return
     *     possible object is
     *     {@link XShippingV2ResponseVO }
     *     
     */
    public XShippingV2ResponseVO getXShippingV2ResponseVO() {
        return xShippingV2ResponseVO;
    }

    /**
     * Sets the value of the xShippingV2ResponseVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link XShippingV2ResponseVO }
     *     
     */
    public void setXShippingV2ResponseVO(XShippingV2ResponseVO value) {
        this.xShippingV2ResponseVO = value;
    }

}
