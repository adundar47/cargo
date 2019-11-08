
package tr.com.yurticikargo.sswintegrationservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for qListDeliveryCollectionInfoVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="qListDeliveryCollectionInfoVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arrivalUnitId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arrivalUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cargoStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="collectionAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="custCollectionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custDocNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custInvoiceAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="dcAppliedCredit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dcBankRefNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dcSelectedCredit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deliveryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deliveryUnitId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deliveryUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="departureUnitId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="departureUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="docFieldAllValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="docId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="docNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="docPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="docVat" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="documentDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dtCollectionDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dutyPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="dutyVat" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="invoiceStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastEventDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastEventTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="odCollectionDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receiverCustName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rejectFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="senderCustId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="senderCustName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="specialField" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ykInvoiceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "qListDeliveryCollectionInfoVO", propOrder = {
    "arrivalUnitId",
    "arrivalUnitName",
    "cargoStatus",
    "collectionAmount",
    "custCollectionType",
    "custDocNumber",
    "custInvoiceAmount",
    "dcAppliedCredit",
    "dcBankRefNo",
    "dcSelectedCredit",
    "deliveryDate",
    "deliveryUnitId",
    "deliveryUnitName",
    "departureUnitId",
    "departureUnitName",
    "docFieldAllValue",
    "docId",
    "docNumber",
    "docPrice",
    "docVat",
    "documentDate",
    "dtCollectionDate",
    "dueDate",
    "dutyPrice",
    "dutyVat",
    "invoiceStatus",
    "lastEventDate",
    "lastEventTime",
    "odCollectionDate",
    "receiverCustName",
    "rejectFlag",
    "senderCustId",
    "senderCustName",
    "specialField",
    "ykInvoiceId"
})
public class QListDeliveryCollectionInfoVO {

    protected String arrivalUnitId;
    protected String arrivalUnitName;
    protected String cargoStatus;
    protected double collectionAmount;
    protected String custCollectionType;
    protected String custDocNumber;
    protected double custInvoiceAmount;
    protected String dcAppliedCredit;
    protected String dcBankRefNo;
    protected String dcSelectedCredit;
    protected String deliveryDate;
    protected String deliveryUnitId;
    protected String deliveryUnitName;
    protected String departureUnitId;
    protected String departureUnitName;
    protected String docFieldAllValue;
    protected String docId;
    protected String docNumber;
    protected double docPrice;
    protected double docVat;
    protected String documentDate;
    protected String dtCollectionDate;
    protected String dueDate;
    protected double dutyPrice;
    protected double dutyVat;
    protected String invoiceStatus;
    protected String lastEventDate;
    protected String lastEventTime;
    protected String odCollectionDate;
    protected String receiverCustName;
    protected String rejectFlag;
    protected String senderCustId;
    protected String senderCustName;
    protected String specialField;
    protected String ykInvoiceId;

    /**
     * Gets the value of the arrivalUnitId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalUnitId() {
        return arrivalUnitId;
    }

    /**
     * Sets the value of the arrivalUnitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalUnitId(String value) {
        this.arrivalUnitId = value;
    }

    /**
     * Gets the value of the arrivalUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalUnitName() {
        return arrivalUnitName;
    }

    /**
     * Sets the value of the arrivalUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalUnitName(String value) {
        this.arrivalUnitName = value;
    }

    /**
     * Gets the value of the cargoStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCargoStatus() {
        return cargoStatus;
    }

    /**
     * Sets the value of the cargoStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCargoStatus(String value) {
        this.cargoStatus = value;
    }

    /**
     * Gets the value of the collectionAmount property.
     * 
     */
    public double getCollectionAmount() {
        return collectionAmount;
    }

    /**
     * Sets the value of the collectionAmount property.
     * 
     */
    public void setCollectionAmount(double value) {
        this.collectionAmount = value;
    }

    /**
     * Gets the value of the custCollectionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustCollectionType() {
        return custCollectionType;
    }

    /**
     * Sets the value of the custCollectionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustCollectionType(String value) {
        this.custCollectionType = value;
    }

    /**
     * Gets the value of the custDocNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustDocNumber() {
        return custDocNumber;
    }

    /**
     * Sets the value of the custDocNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustDocNumber(String value) {
        this.custDocNumber = value;
    }

    /**
     * Gets the value of the custInvoiceAmount property.
     * 
     */
    public double getCustInvoiceAmount() {
        return custInvoiceAmount;
    }

    /**
     * Sets the value of the custInvoiceAmount property.
     * 
     */
    public void setCustInvoiceAmount(double value) {
        this.custInvoiceAmount = value;
    }

    /**
     * Gets the value of the dcAppliedCredit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDcAppliedCredit() {
        return dcAppliedCredit;
    }

    /**
     * Sets the value of the dcAppliedCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDcAppliedCredit(String value) {
        this.dcAppliedCredit = value;
    }

    /**
     * Gets the value of the dcBankRefNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDcBankRefNo() {
        return dcBankRefNo;
    }

    /**
     * Sets the value of the dcBankRefNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDcBankRefNo(String value) {
        this.dcBankRefNo = value;
    }

    /**
     * Gets the value of the dcSelectedCredit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDcSelectedCredit() {
        return dcSelectedCredit;
    }

    /**
     * Sets the value of the dcSelectedCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDcSelectedCredit(String value) {
        this.dcSelectedCredit = value;
    }

    /**
     * Gets the value of the deliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryDate() {
        return deliveryDate;
    }

    /**
     * Sets the value of the deliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryDate(String value) {
        this.deliveryDate = value;
    }

    /**
     * Gets the value of the deliveryUnitId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryUnitId() {
        return deliveryUnitId;
    }

    /**
     * Sets the value of the deliveryUnitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryUnitId(String value) {
        this.deliveryUnitId = value;
    }

    /**
     * Gets the value of the deliveryUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryUnitName() {
        return deliveryUnitName;
    }

    /**
     * Sets the value of the deliveryUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryUnitName(String value) {
        this.deliveryUnitName = value;
    }

    /**
     * Gets the value of the departureUnitId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureUnitId() {
        return departureUnitId;
    }

    /**
     * Sets the value of the departureUnitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureUnitId(String value) {
        this.departureUnitId = value;
    }

    /**
     * Gets the value of the departureUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureUnitName() {
        return departureUnitName;
    }

    /**
     * Sets the value of the departureUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureUnitName(String value) {
        this.departureUnitName = value;
    }

    /**
     * Gets the value of the docFieldAllValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocFieldAllValue() {
        return docFieldAllValue;
    }

    /**
     * Sets the value of the docFieldAllValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocFieldAllValue(String value) {
        this.docFieldAllValue = value;
    }

    /**
     * Gets the value of the docId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocId() {
        return docId;
    }

    /**
     * Sets the value of the docId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocId(String value) {
        this.docId = value;
    }

    /**
     * Gets the value of the docNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocNumber() {
        return docNumber;
    }

    /**
     * Sets the value of the docNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocNumber(String value) {
        this.docNumber = value;
    }

    /**
     * Gets the value of the docPrice property.
     * 
     */
    public double getDocPrice() {
        return docPrice;
    }

    /**
     * Sets the value of the docPrice property.
     * 
     */
    public void setDocPrice(double value) {
        this.docPrice = value;
    }

    /**
     * Gets the value of the docVat property.
     * 
     */
    public double getDocVat() {
        return docVat;
    }

    /**
     * Sets the value of the docVat property.
     * 
     */
    public void setDocVat(double value) {
        this.docVat = value;
    }

    /**
     * Gets the value of the documentDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentDate() {
        return documentDate;
    }

    /**
     * Sets the value of the documentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentDate(String value) {
        this.documentDate = value;
    }

    /**
     * Gets the value of the dtCollectionDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtCollectionDate() {
        return dtCollectionDate;
    }

    /**
     * Sets the value of the dtCollectionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtCollectionDate(String value) {
        this.dtCollectionDate = value;
    }

    /**
     * Gets the value of the dueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDueDate() {
        return dueDate;
    }

    /**
     * Sets the value of the dueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDueDate(String value) {
        this.dueDate = value;
    }

    /**
     * Gets the value of the dutyPrice property.
     * 
     */
    public double getDutyPrice() {
        return dutyPrice;
    }

    /**
     * Sets the value of the dutyPrice property.
     * 
     */
    public void setDutyPrice(double value) {
        this.dutyPrice = value;
    }

    /**
     * Gets the value of the dutyVat property.
     * 
     */
    public double getDutyVat() {
        return dutyVat;
    }

    /**
     * Sets the value of the dutyVat property.
     * 
     */
    public void setDutyVat(double value) {
        this.dutyVat = value;
    }

    /**
     * Gets the value of the invoiceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceStatus() {
        return invoiceStatus;
    }

    /**
     * Sets the value of the invoiceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceStatus(String value) {
        this.invoiceStatus = value;
    }

    /**
     * Gets the value of the lastEventDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastEventDate() {
        return lastEventDate;
    }

    /**
     * Sets the value of the lastEventDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastEventDate(String value) {
        this.lastEventDate = value;
    }

    /**
     * Gets the value of the lastEventTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastEventTime() {
        return lastEventTime;
    }

    /**
     * Sets the value of the lastEventTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastEventTime(String value) {
        this.lastEventTime = value;
    }

    /**
     * Gets the value of the odCollectionDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOdCollectionDate() {
        return odCollectionDate;
    }

    /**
     * Sets the value of the odCollectionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOdCollectionDate(String value) {
        this.odCollectionDate = value;
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
     * Gets the value of the rejectFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRejectFlag() {
        return rejectFlag;
    }

    /**
     * Sets the value of the rejectFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRejectFlag(String value) {
        this.rejectFlag = value;
    }

    /**
     * Gets the value of the senderCustId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderCustId() {
        return senderCustId;
    }

    /**
     * Sets the value of the senderCustId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderCustId(String value) {
        this.senderCustId = value;
    }

    /**
     * Gets the value of the senderCustName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderCustName() {
        return senderCustName;
    }

    /**
     * Sets the value of the senderCustName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderCustName(String value) {
        this.senderCustName = value;
    }

    /**
     * Gets the value of the specialField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialField() {
        return specialField;
    }

    /**
     * Sets the value of the specialField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialField(String value) {
        this.specialField = value;
    }

    /**
     * Gets the value of the ykInvoiceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYkInvoiceId() {
        return ykInvoiceId;
    }

    /**
     * Sets the value of the ykInvoiceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYkInvoiceId(String value) {
        this.ykInvoiceId = value;
    }

}
