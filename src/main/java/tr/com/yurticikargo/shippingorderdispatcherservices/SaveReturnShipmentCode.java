
package tr.com.yurticikargo.shippingorderdispatcherservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for saveReturnShipmentCode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="saveReturnShipmentCode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="wsUserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wsPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wsLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fieldName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="returnCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maxCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveReturnShipmentCode", propOrder = {
    "wsUserName",
    "wsPassword",
    "wsLanguage",
    "fieldName",
    "returnCode",
    "startDate",
    "endDate",
    "maxCount"
})
public class SaveReturnShipmentCode {

    protected String wsUserName;
    protected String wsPassword;
    protected String wsLanguage;
    protected String fieldName;
    protected String returnCode;
    protected String startDate;
    protected String endDate;
    protected int maxCount;

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
     * Gets the value of the wsLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWsLanguage() {
        return wsLanguage;
    }

    /**
     * Sets the value of the wsLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWsLanguage(String value) {
        this.wsLanguage = value;
    }

    /**
     * Gets the value of the fieldName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * Sets the value of the fieldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldName(String value) {
        this.fieldName = value;
    }

    /**
     * Gets the value of the returnCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnCode() {
        return returnCode;
    }

    /**
     * Sets the value of the returnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnCode(String value) {
        this.returnCode = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(String value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the maxCount property.
     * 
     */
    public int getMaxCount() {
        return maxCount;
    }

    /**
     * Sets the value of the maxCount property.
     * 
     */
    public void setMaxCount(int value) {
        this.maxCount = value;
    }

}
