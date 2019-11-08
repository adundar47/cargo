
package tr.com.yurticikargo.sswintegrationservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for xShippingV2ResponseVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xShippingV2ResponseVO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://yurticikargo.com.tr/sswIntegrationServices}baseResultVO">
 *       &lt;sequence>
 *         &lt;element name="shippingDetailVOArray" type="{http://yurticikargo.com.tr/sswIntegrationServices}XShippingV2DetailVO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xShippingV2ResponseVO", propOrder = {
    "shippingDetailVOArray"
})
public class XShippingV2ResponseVO
    extends BaseResultVO
{

    @XmlElement(nillable = true)
    protected List<XShippingV2DetailVO> shippingDetailVOArray;

    /**
     * Gets the value of the shippingDetailVOArray property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shippingDetailVOArray property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShippingDetailVOArray().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XShippingV2DetailVO }
     * 
     * 
     */
    public List<XShippingV2DetailVO> getShippingDetailVOArray() {
        if (shippingDetailVOArray == null) {
            shippingDetailVOArray = new ArrayList<XShippingV2DetailVO>();
        }
        return this.shippingDetailVOArray;
    }

}
