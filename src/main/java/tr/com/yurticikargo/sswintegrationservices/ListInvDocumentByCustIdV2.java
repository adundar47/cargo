
package tr.com.yurticikargo.sswintegrationservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listInvDocumentByCustIdV2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listInvDocumentByCustIdV2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custParamsVO" type="{http://yurticikargo.com.tr/sswIntegrationServices}CustParamsVO" minOccurs="0"/>
 *         &lt;element name="unitParamsVO" type="{http://yurticikargo.com.tr/sswIntegrationServices}UnitParamsVO" minOccurs="0"/>
 *         &lt;element name="subCustomerFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateParamType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wsUserGroupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "listInvDocumentByCustIdV2", propOrder = {
    "userName",
    "password",
    "language",
    "custParamsVO",
    "unitParamsVO",
    "subCustomerFlag",
    "startDate",
    "endDate",
    "dateParamType",
    "wsUserGroupId",
    "withCargoLifecycle"
})
public class ListInvDocumentByCustIdV2 {

    protected String userName;
    protected String password;
    protected String language;
    protected CustParamsVO custParamsVO;
    protected UnitParamsVO unitParamsVO;
    protected String subCustomerFlag;
    protected String startDate;
    protected String endDate;
    protected String dateParamType;
    protected String wsUserGroupId;
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
     * Gets the value of the unitParamsVO property.
     * 
     * @return
     *     possible object is
     *     {@link UnitParamsVO }
     *     
     */
    public UnitParamsVO getUnitParamsVO() {
        return unitParamsVO;
    }

    /**
     * Sets the value of the unitParamsVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitParamsVO }
     *     
     */
    public void setUnitParamsVO(UnitParamsVO value) {
        this.unitParamsVO = value;
    }

    /**
     * Gets the value of the subCustomerFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubCustomerFlag() {
        return subCustomerFlag;
    }

    /**
     * Sets the value of the subCustomerFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubCustomerFlag(String value) {
        this.subCustomerFlag = value;
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
     * Gets the value of the wsUserGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWsUserGroupId() {
        return wsUserGroupId;
    }

    /**
     * Sets the value of the wsUserGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWsUserGroupId(String value) {
        this.wsUserGroupId = value;
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
