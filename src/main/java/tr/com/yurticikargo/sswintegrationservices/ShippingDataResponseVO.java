
package tr.com.yurticikargo.sswintegrationservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for shippingDataResponseVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="shippingDataResponseVO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://yurticikargo.com.tr/sswIntegrationServices}baseResultVO">
 *       &lt;sequence>
 *         &lt;element name="shippingDataDetailVOArray" type="{http://yurticikargo.com.tr/sswIntegrationServices}ShippingDataDetailVO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "shippingDataResponseVO", propOrder = {
    "shippingDataDetailVOArray"
})
public class ShippingDataResponseVO
    extends BaseResultVO
{

    @XmlElement(nillable = true)
    protected List<ShippingDataDetailVO> shippingDataDetailVOArray;

    /**
     * Gets the value of the shippingDataDetailVOArray property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shippingDataDetailVOArray property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShippingDataDetailVOArray().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShippingDataDetailVO }
     * 
     * 
     */
    public List<ShippingDataDetailVO> getShippingDataDetailVOArray() {
        if (shippingDataDetailVOArray == null) {
            shippingDataDetailVOArray = new ArrayList<ShippingDataDetailVO>();
        }
        return this.shippingDataDetailVOArray;
    }

}
