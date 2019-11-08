
package tr.com.yurticikargo.shippingorderdispatcherservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShippingOrderVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShippingOrderVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cargoKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invoiceKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receiverCustName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receiverAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="townName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receiverPhone1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receiverPhone2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receiverPhone3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxOfficeId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="taxNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxOfficeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="desi" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="kg" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cargoCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="waybillNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="specialField1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="specialField2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="specialField3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ttInvoiceAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ttDocumentId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ttCollectionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ttDocumentSaveType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dcSelectedCredit" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="dcCreditRule" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgGeoCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="privilegeOrder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custProdId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgReceiverCustId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShippingOrderVO", propOrder = {
    "cargoKey",
    "invoiceKey",
    "receiverCustName",
    "receiverAddress",
    "cityName",
    "townName",
    "receiverPhone1",
    "receiverPhone2",
    "receiverPhone3",
    "emailAddress",
    "taxOfficeId",
    "taxNumber",
    "taxOfficeName",
    "desi",
    "kg",
    "cargoCount",
    "waybillNo",
    "specialField1",
    "specialField2",
    "specialField3",
    "ttInvoiceAmount",
    "ttDocumentId",
    "ttCollectionType",
    "ttDocumentSaveType",
    "dcSelectedCredit",
    "dcCreditRule",
    "description",
    "orgGeoCode",
    "privilegeOrder",
    "custProdId",
    "orgReceiverCustId"
})
@XmlSeeAlso({
    ShippingOrderCreateVO.class
})
public class ShippingOrderVO {

    protected String cargoKey;
    protected String invoiceKey;
    protected String receiverCustName;
    protected String receiverAddress;
    protected String cityName;
    protected String townName;
    protected String receiverPhone1;
    protected String receiverPhone2;
    protected String receiverPhone3;
    protected String emailAddress;
    protected long taxOfficeId;
    protected String taxNumber;
    protected String taxOfficeName;
    protected Double desi;
    protected Double kg;
    protected int cargoCount;
    protected String waybillNo;
    protected String specialField1;
    protected String specialField2;
    protected String specialField3;
    protected Double ttInvoiceAmount;
    protected long ttDocumentId;
    protected String ttCollectionType;
    protected String ttDocumentSaveType;
    protected long dcSelectedCredit;
    protected long dcCreditRule;
    protected String description;
    protected String orgGeoCode;
    protected String privilegeOrder;
    protected String custProdId;
    protected String orgReceiverCustId;

    /**
     * Gets the value of the cargoKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCargoKey() {
        return cargoKey;
    }

    /**
     * Sets the value of the cargoKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCargoKey(String value) {
        this.cargoKey = value;
    }

    /**
     * Gets the value of the invoiceKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceKey() {
        return invoiceKey;
    }

    /**
     * Sets the value of the invoiceKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceKey(String value) {
        this.invoiceKey = value;
    }

    /**
     * Gets the value of the receiverCustName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverCustName() {
        return receiverCustName;
    }

    /**
     * Sets the value of the receiverCustName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverCustName(String value) {
        this.receiverCustName = value;
    }

    /**
     * Gets the value of the receiverAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverAddress() {
        return receiverAddress;
    }

    /**
     * Sets the value of the receiverAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverAddress(String value) {
        this.receiverAddress = value;
    }

    /**
     * Gets the value of the cityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * Sets the value of the cityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityName(String value) {
        this.cityName = value;
    }

    /**
     * Gets the value of the townName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTownName() {
        return townName;
    }

    /**
     * Sets the value of the townName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTownName(String value) {
        this.townName = value;
    }

    /**
     * Gets the value of the receiverPhone1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverPhone1() {
        return receiverPhone1;
    }

    /**
     * Sets the value of the receiverPhone1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverPhone1(String value) {
        this.receiverPhone1 = value;
    }

    /**
     * Gets the value of the receiverPhone2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverPhone2() {
        return receiverPhone2;
    }

    /**
     * Sets the value of the receiverPhone2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverPhone2(String value) {
        this.receiverPhone2 = value;
    }

    /**
     * Gets the value of the receiverPhone3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverPhone3() {
        return receiverPhone3;
    }

    /**
     * Sets the value of the receiverPhone3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverPhone3(String value) {
        this.receiverPhone3 = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the taxOfficeId property.
     * 
     */
    public long getTaxOfficeId() {
        return taxOfficeId;
    }

    /**
     * Sets the value of the taxOfficeId property.
     * 
     */
    public void setTaxOfficeId(long value) {
        this.taxOfficeId = value;
    }

    /**
     * Gets the value of the taxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxNumber() {
        return taxNumber;
    }

    /**
     * Sets the value of the taxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxNumber(String value) {
        this.taxNumber = value;
    }

    /**
     * Gets the value of the taxOfficeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxOfficeName() {
        return taxOfficeName;
    }

    /**
     * Sets the value of the taxOfficeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxOfficeName(String value) {
        this.taxOfficeName = value;
    }

    /**
     * Gets the value of the desi property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDesi() {
        return desi;
    }

    /**
     * Sets the value of the desi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDesi(Double value) {
        this.desi = value;
    }

    /**
     * Gets the value of the kg property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getKg() {
        return kg;
    }

    /**
     * Sets the value of the kg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setKg(Double value) {
        this.kg = value;
    }

    /**
     * Gets the value of the cargoCount property.
     * 
     */
    public int getCargoCount() {
        return cargoCount;
    }

    /**
     * Sets the value of the cargoCount property.
     * 
     */
    public void setCargoCount(int value) {
        this.cargoCount = value;
    }

    /**
     * Gets the value of the waybillNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaybillNo() {
        return waybillNo;
    }

    /**
     * Sets the value of the waybillNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaybillNo(String value) {
        this.waybillNo = value;
    }

    /**
     * Gets the value of the specialField1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialField1() {
        return specialField1;
    }

    /**
     * Sets the value of the specialField1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialField1(String value) {
        this.specialField1 = value;
    }

    /**
     * Gets the value of the specialField2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialField2() {
        return specialField2;
    }

    /**
     * Sets the value of the specialField2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialField2(String value) {
        this.specialField2 = value;
    }

    /**
     * Gets the value of the specialField3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialField3() {
        return specialField3;
    }

    /**
     * Sets the value of the specialField3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialField3(String value) {
        this.specialField3 = value;
    }

    /**
     * Gets the value of the ttInvoiceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTtInvoiceAmount() {
        return ttInvoiceAmount;
    }

    /**
     * Sets the value of the ttInvoiceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTtInvoiceAmount(Double value) {
        this.ttInvoiceAmount = value;
    }

    /**
     * Gets the value of the ttDocumentId property.
     * 
     */
    public long getTtDocumentId() {
        return ttDocumentId;
    }

    /**
     * Sets the value of the ttDocumentId property.
     * 
     */
    public void setTtDocumentId(long value) {
        this.ttDocumentId = value;
    }

    /**
     * Gets the value of the ttCollectionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTtCollectionType() {
        return ttCollectionType;
    }

    /**
     * Sets the value of the ttCollectionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTtCollectionType(String value) {
        this.ttCollectionType = value;
    }

    /**
     * Gets the value of the ttDocumentSaveType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTtDocumentSaveType() {
        return ttDocumentSaveType;
    }

    /**
     * Sets the value of the ttDocumentSaveType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTtDocumentSaveType(String value) {
        this.ttDocumentSaveType = value;
    }

    /**
     * Gets the value of the dcSelectedCredit property.
     * 
     */
    public long getDcSelectedCredit() {
        return dcSelectedCredit;
    }

    /**
     * Sets the value of the dcSelectedCredit property.
     * 
     */
    public void setDcSelectedCredit(long value) {
        this.dcSelectedCredit = value;
    }

    /**
     * Gets the value of the dcCreditRule property.
     * 
     */
    public long getDcCreditRule() {
        return dcCreditRule;
    }

    /**
     * Sets the value of the dcCreditRule property.
     * 
     */
    public void setDcCreditRule(long value) {
        this.dcCreditRule = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the orgGeoCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgGeoCode() {
        return orgGeoCode;
    }

    /**
     * Sets the value of the orgGeoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgGeoCode(String value) {
        this.orgGeoCode = value;
    }

    /**
     * Gets the value of the privilegeOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrivilegeOrder() {
        return privilegeOrder;
    }

    /**
     * Sets the value of the privilegeOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrivilegeOrder(String value) {
        this.privilegeOrder = value;
    }

    /**
     * Gets the value of the custProdId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustProdId() {
        return custProdId;
    }

    /**
     * Sets the value of the custProdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustProdId(String value) {
        this.custProdId = value;
    }

    /**
     * Gets the value of the orgReceiverCustId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgReceiverCustId() {
        return orgReceiverCustId;
    }

    /**
     * Sets the value of the orgReceiverCustId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgReceiverCustId(String value) {
        this.orgReceiverCustId = value;
    }

}
