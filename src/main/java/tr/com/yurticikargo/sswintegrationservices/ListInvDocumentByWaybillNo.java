
package tr.com.yurticikargo.sswintegrationservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listInvDocumentByWaybillNo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listInvDocumentByWaybillNo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custParamsVO" type="{http://yurticikargo.com.tr/sswIntegrationServices}CustParamsVO" minOccurs="0"/>
 *         &lt;element name="waybillNoArray" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateParamType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="withCargoLifecycle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listInvDocumentByWaybillNo", propOrder = {
    "userName",
    "password",
    "language",
    "custParamsVO",
    "waybillNoArray",
    "startDate",
    "endDate",
    "dateParamType",
    "withCargoLifecycle"
})
public class ListInvDocumentByWaybillNo {

    protected String userName;
    protected String password;
    protected String language;
    protected CustParamsVO custParamsVO;
    protected List<String> waybillNoArray;
    protected String startDate;
    protected String endDate;
    protected String dateParamType;
    protected String withCargoLifecycle;

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the custParamsVO property.
     * 
     * @return
     *     possible object is
     *     {@link CustParamsVO }
     *     
     */
    public CustParamsVO getCustParamsVO() {
        return custParamsVO;
    }

    /**
     * Sets the value of the custParamsVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustParamsVO }
     *     
     */
    public void setCustParamsVO(CustParamsVO value) {
        this.custParamsVO = value;
    }

    /**
     * Gets the value of the waybillNoArray property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the waybillNoArray property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWaybillNoArray().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getWaybillNoArray() {
        if (waybillNoArray == null) {
            waybillNoArray = new ArrayList<String>();
        }
        return this.waybillNoArray;
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
     * Gets the value of the dateParamType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateParamType() {
        return dateParamType;
    }

    /**
     * Sets the value of the dateParamType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateParamType(String value) {
        this.dateParamType = value;
    }

    /**
     * Gets the value of the withCargoLifecycle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWithCargoLifecycle() {
        return withCargoLifecycle;
    }

    /**
     * Sets the value of the withCargoLifecycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWithCargoLifecycle(String value) {
        this.withCargoLifecycle = value;
    }

}
