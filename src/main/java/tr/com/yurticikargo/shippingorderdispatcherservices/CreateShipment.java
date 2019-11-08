
package tr.com.yurticikargo.shippingorderdispatcherservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createShipment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createShipment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="wsUserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wsPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShippingOrderVO" type="{http://yurticikargo.com.tr/ShippingOrderDispatcherServices}ShippingOrderVO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createShipment", propOrder = {
    "wsUserName",
    "wsPassword",
    "userLanguage",
    "shippingOrderVO"
})
public class CreateShipment {

    protected String wsUserName;
    protected String wsPassword;
    protected String userLanguage;
    @XmlElement(name = "ShippingOrderVO")
    protected List<ShippingOrderVO> shippingOrderVO;

    /**
     * Gets the value of the wsUserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWsUserName() {
        return wsUserName;
    }

    /**
     * Sets the value of the wsUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWsUserName(String value) {
        this.wsUserName = value;
    }

    /**
     * Gets the value of the wsPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWsPassword() {
        return wsPassword;
    }

    /**
     * Sets the value of the wsPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWsPassword(String value) {
        this.wsPassword = value;
    }

    /**
     * Gets the value of the userLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserLanguage() {
        return userLanguage;
    }

    /**
     * Sets the value of the userLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserLanguage(String value) {
        this.userLanguage = value;
    }

    /**
     * Gets the value of the shippingOrderVO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shippingOrderVO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShippingOrderVO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShippingOrderVO }
     * 
     * 
     */
    public List<ShippingOrderVO> getShippingOrderVO() {
        if (shippingOrderVO == null) {
            shippingOrderVO = new ArrayList<ShippingOrderVO>();
        }
        return this.shippingOrderVO;
    }

}
