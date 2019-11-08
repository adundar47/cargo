
package tr.com.yurticikargo.sswintegrationservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for shippingDataV2ResponseVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="shippingDataV2ResponseVO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://yurticikargo.com.tr/sswIntegrationServices}extendedBaseResultVO">
 *       &lt;sequence>
 *         &lt;element name="shippingDataV2DetailVOArray" type="{http://yurticikargo.com.tr/sswIntegrationServices}ShippingDataV2DetailVO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "shippingDataV2ResponseVO", propOrder = {
    "shippingDataV2DetailVOArray"
})
public class ShippingDataV2ResponseVO
    extends ExtendedBaseResultVO
{

    @XmlElement(nillable = true)
    protected List<ShippingDataV2DetailVO> shippingDataV2DetailVOArray;

    /**
     * Gets the value of the shippingDataV2DetailVOArray property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shippingDataV2DetailVOArray property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShippingDataV2DetailVOArray().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShippingDataV2DetailVO }
     * 
     * 
     */
    public List<ShippingDataV2DetailVO> getShippingDataV2DetailVOArray() {
        if (shippingDataV2DetailVOArray == null) {
            shippingDataV2DetailVOArray = new ArrayList<ShippingDataV2DetailVO>();
        }
        return this.shippingDataV2DetailVOArray;
    }

}
