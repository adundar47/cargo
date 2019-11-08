
package tr.com.yurticikargo.shippingorderdispatcherservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShippingDeliveryItemDetailVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShippingDeliveryItemDetailVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cargoKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="docId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invoiceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="docNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="waybillNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documentDebitId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="senderCustId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="senderCustName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="senderAddressTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receiverCustId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receiverCustName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receiverAddressTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documentDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documentTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documentDelFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receiverInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="docType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="docTypeExplanation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contractId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trackingUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cargoType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cargoTypeExplanation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pickupType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pickupTypeExplanation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deliveryType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deliveryTypeExplanation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deliveryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deliveryTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalVat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="product" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalDesi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalKg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalDesiKg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalCargo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arrivalUnitId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arrivalUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="departureUnitId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="departureUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arrivalTrCenterUnitId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arrivalTrCenterName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="departureTrCenterUnitId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="departureTrCenterName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deliveryUnitId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deliveryUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deliveryUnitType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deliveryUnitTypeExplanation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cargoEventId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cargoEventExplanation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cargoReasonId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cargoReasonExplanation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documentEventId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documentReasonId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documentEventExplanation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documentReasonExplanation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="delInfoDeliveryFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="delInfoDelUnitId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="delEmpName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="delEmpId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rejectStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rejectStatusExplanation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rejectDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rejectReasonExplanation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="returnDocId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="returnDocumentDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="returnDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="returnStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="returnStatusExplanation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invDocFieldVOArray" type="{http://yurticikargo.com.tr/ShippingOrderDispatcherServices}InvDocFieldVO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="invDocCargoVOArray" type="{http://yurticikargo.com.tr/ShippingOrderDispatcherServices}InvDocCargoVO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShippingDeliveryItemDetailVO", propOrder = {
    "cargoKey",
    "docId",
    "invoiceNumber",
    "docNumber",
    "waybillNo",
    "documentDebitId",
    "senderCustId",
    "senderCustName",
    "senderAddressTxt",
    "receiverCustId",
    "receiverCustName",
    "receiverAddressTxt",
    "documentDate",
    "documentTime",
    "documentDelFlag",
    "receiverInfo",
    "docType",
    "docTypeExplanation",
    "contractId",
    "trackingUrl",
    "cargoType",
    "cargoTypeExplanation",
    "pickupType",
    "pickupTypeExplanation",
    "deliveryType",
    "deliveryTypeExplanation",
    "deliveryDate",
    "deliveryTime",
    "totalPrice",
    "totalVat",
    "totalAmount",
    "product",
    "totalDesi",
    "totalKg",
    "totalDesiKg",
    "totalCargo",
    "arrivalUnitId",
    "arrivalUnitName",
    "departureUnitId",
    "departureUnitName",
    "arrivalTrCenterUnitId",
    "arrivalTrCenterName",
    "departureTrCenterUnitId",
    "departureTrCenterName",
    "deliveryUnitId",
    "deliveryUnitName",
    "deliveryUnitType",
    "deliveryUnitTypeExplanation",
    "cargoEventId",
    "cargoEventExplanation",
    "cargoReasonId",
    "cargoReasonExplanation",
    "documentEventId",
    "documentReasonId",
    "documentEventExplanation",
    "documentReasonExplanation",
    "delInfoDeliveryFlag",
    "delInfoDelUnitId",
    "delEmpName",
    "delEmpId",
    "rejectStatus",
    "rejectStatusExplanation",
    "rejectDescription",
    "rejectReasonExplanation",
    "returnDocId",
    "returnDocumentDate",
    "returnDeliveryDate",
    "returnStatus",
    "returnStatusExplanation",
    "invDocFieldVOArray",
    "invDocCargoVOArray"
})
@XmlSeeAlso({
    ShipmentDeliveryItemDetailVO.class
})
public class ShippingDeliveryItemDetailVO {

    protected String cargoKey;
    protected String docId;
    protected String invoiceNumber;
    protected String docNumber;
    protected String waybillNo;
    protected String documentDebitId;
    protected String senderCustId;
    protected String senderCustName;
    protected String senderAddressTxt;
    protected String receiverCustId;
    protected String receiverCustName;
    protected String receiverAddressTxt;
    protected String documentDate;
    protected String documentTime;
    protected String documentDelFlag;
    protected String receiverInfo;
    protected String docType;
    protected String docTypeExplanation;
    protected String contractId;
    protected String trackingUrl;
    protected String cargoType;
    protected String cargoTypeExplanation;
    protected String pickupType;
    protected String pickupTypeExplanation;
    protected String deliveryType;
    protected String deliveryTypeExplanation;
    protected String deliveryDate;
    protected String deliveryTime;
    protected String totalPrice;
    protected String totalVat;
    protected String totalAmount;
    protected String product;
    protected String totalDesi;
    protected String totalKg;
    protected String totalDesiKg;
    protected String totalCargo;
    protected String arrivalUnitId;
    protected String arrivalUnitName;
    protected String departureUnitId;
    protected String departureUnitName;
    protected String arrivalTrCenterUnitId;
    protected String arrivalTrCenterName;
    protected String departureTrCenterUnitId;
    protected String departureTrCenterName;
    protected String deliveryUnitId;
    protected String deliveryUnitName;
    protected String deliveryUnitType;
    protected String deliveryUnitTypeExplanation;
    protected String cargoEventId;
    protected String cargoEventExplanation;
    protected String cargoReasonId;
    protected String cargoReasonExplanation;
    protected String documentEventId;
    protected String documentReasonId;
    protected String documentEventExplanation;
    protected String documentReasonExplanation;
    protected String delInfoDeliveryFlag;
    protected String delInfoDelUnitId;
    protected String delEmpName;
    protected String delEmpId;
    protected String rejectStatus;
    protected String rejectStatusExplanation;
    protected String rejectDescription;
    protected String rejectReasonExplanation;
    protected String returnDocId;
    protected String returnDocumentDate;
    protected String returnDeliveryDate;
    protected String returnStatus;
    protected String returnStatusExplanation;
    @XmlElement(nillable = true)
    protected List<InvDocFieldVO> invDocFieldVOArray;
    @XmlElement(nillable = true)
    protected List<InvDocCargoVO> invDocCargoVOArray;

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
     * Gets the value of the invoiceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * Sets the value of the invoiceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceNumber(String value) {
        this.invoiceNumber = value;
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
     * Gets the value of the documentDebitId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentDebitId() {
        return documentDebitId;
    }

    /**
     * Sets the value of the documentDebitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentDebitId(String value) {
        this.documentDebitId = value;
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
     * Gets the value of the senderAddressTxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderAddressTxt() {
        return senderAddressTxt;
    }

    /**
     * Sets the value of the senderAddressTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderAddressTxt(String value) {
        this.senderAddressTxt = value;
    }

    /**
     * Gets the value of the receiverCustId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverCustId() {
        return receiverCustId;
    }

    /**
     * Sets the value of the receiverCustId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverCustId(String value) {
        this.receiverCustId = value;
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
     * Gets the value of the receiverAddressTxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverAddressTxt() {
        return receiverAddressTxt;
    }

    /**
     * Sets the value of the receiverAddressTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverAddressTxt(String value) {
        this.receiverAddressTxt = value;
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
     * Gets the value of the documentTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentTime() {
        return documentTime;
    }

    /**
     * Sets the value of the documentTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentTime(String value) {
        this.documentTime = value;
    }

    /**
     * Gets the value of the documentDelFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentDelFlag() {
        return documentDelFlag;
    }

    /**
     * Sets the value of the documentDelFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentDelFlag(String value) {
        this.documentDelFlag = value;
    }

    /**
     * Gets the value of the receiverInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverInfo() {
        return receiverInfo;
    }

    /**
     * Sets the value of the receiverInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverInfo(String value) {
        this.receiverInfo = value;
    }

    /**
     * Gets the value of the docType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocType() {
        return docType;
    }

    /**
     * Sets the value of the docType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocType(String value) {
        this.docType = value;
    }

    /**
     * Gets the value of the docTypeExplanation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocTypeExplanation() {
        return docTypeExplanation;
    }

    /**
     * Sets the value of the docTypeExplanation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocTypeExplanation(String value) {
        this.docTypeExplanation = value;
    }

    /**
     * Gets the value of the contractId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractId() {
        return contractId;
    }

    /**
     * Sets the value of the contractId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractId(String value) {
        this.contractId = value;
    }

    /**
     * Gets the value of the trackingUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingUrl() {
        return trackingUrl;
    }

    /**
     * Sets the value of the trackingUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingUrl(String value) {
        this.trackingUrl = value;
    }

    /**
     * Gets the value of the cargoType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCargoType() {
        return cargoType;
    }

    /**
     * Sets the value of the cargoType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCargoType(String value) {
        this.cargoType = value;
    }

    /**
     * Gets the value of the cargoTypeExplanation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCargoTypeExplanation() {
        return cargoTypeExplanation;
    }

    /**
     * Sets the value of the cargoTypeExplanation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCargoTypeExplanation(String value) {
        this.cargoTypeExplanation = value;
    }

    /**
     * Gets the value of the pickupType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickupType() {
        return pickupType;
    }

    /**
     * Sets the value of the pickupType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickupType(String value) {
        this.pickupType = value;
    }

    /**
     * Gets the value of the pickupTypeExplanation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickupTypeExplanation() {
        return pickupTypeExplanation;
    }

    /**
     * Sets the value of the pickupTypeExplanation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickupTypeExplanation(String value) {
        this.pickupTypeExplanation = value;
    }

    /**
     * Gets the value of the deliveryType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryType() {
        return deliveryType;
    }

    /**
     * Sets the value of the deliveryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryType(String value) {
        this.deliveryType = value;
    }

    /**
     * Gets the value of the deliveryTypeExplanation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryTypeExplanation() {
        return deliveryTypeExplanation;
    }

    /**
     * Sets the value of the deliveryTypeExplanation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryTypeExplanation(String value) {
        this.deliveryTypeExplanation = value;
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
     * Gets the value of the deliveryTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryTime() {
        return deliveryTime;
    }

    /**
     * Sets the value of the deliveryTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryTime(String value) {
        this.deliveryTime = value;
    }

    /**
     * Gets the value of the totalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalPrice() {
        return totalPrice;
    }

    /**
     * Sets the value of the totalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalPrice(String value) {
        this.totalPrice = value;
    }

    /**
     * Gets the value of the totalVat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalVat() {
        return totalVat;
    }

    /**
     * Sets the value of the totalVat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalVat(String value) {
        this.totalVat = value;
    }

    /**
     * Gets the value of the totalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalAmount(String value) {
        this.totalAmount = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduct(String value) {
        this.product = value;
    }

    /**
     * Gets the value of the totalDesi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalDesi() {
        return totalDesi;
    }

    /**
     * Sets the value of the totalDesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalDesi(String value) {
        this.totalDesi = value;
    }

    /**
     * Gets the value of the totalKg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalKg() {
        return totalKg;
    }

    /**
     * Sets the value of the totalKg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalKg(String value) {
        this.totalKg = value;
    }

    /**
     * Gets the value of the totalDesiKg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalDesiKg() {
        return totalDesiKg;
    }

    /**
     * Sets the value of the totalDesiKg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalDesiKg(String value) {
        this.totalDesiKg = value;
    }

    /**
     * Gets the value of the totalCargo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalCargo() {
        return totalCargo;
    }

    /**
     * Sets the value of the totalCargo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalCargo(String value) {
        this.totalCargo = value;
    }

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
     * Gets the value of the arrivalTrCenterUnitId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalTrCenterUnitId() {
        return arrivalTrCenterUnitId;
    }

    /**
     * Sets the value of the arrivalTrCenterUnitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalTrCenterUnitId(String value) {
        this.arrivalTrCenterUnitId = value;
    }

    /**
     * Gets the value of the arrivalTrCenterName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalTrCenterName() {
        return arrivalTrCenterName;
    }

    /**
     * Sets the value of the arrivalTrCenterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalTrCenterName(String value) {
        this.arrivalTrCenterName = value;
    }

    /**
     * Gets the value of the departureTrCenterUnitId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureTrCenterUnitId() {
        return departureTrCenterUnitId;
    }

    /**
     * Sets the value of the departureTrCenterUnitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureTrCenterUnitId(String value) {
        this.departureTrCenterUnitId = value;
    }

    /**
     * Gets the value of the departureTrCenterName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureTrCenterName() {
        return departureTrCenterName;
    }

    /**
     * Sets the value of the departureTrCenterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureTrCenterName(String value) {
        this.departureTrCenterName = value;
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
     * Gets the value of the deliveryUnitType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryUnitType() {
        return deliveryUnitType;
    }

    /**
     * Sets the value of the deliveryUnitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryUnitType(String value) {
        this.deliveryUnitType = value;
    }

    /**
     * Gets the value of the deliveryUnitTypeExplanation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryUnitTypeExplanation() {
        return deliveryUnitTypeExplanation;
    }

    /**
     * Sets the value of the deliveryUnitTypeExplanation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryUnitTypeExplanation(String value) {
        this.deliveryUnitTypeExplanation = value;
    }

    /**
     * Gets the value of the cargoEventId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCargoEventId() {
        return cargoEventId;
    }

    /**
     * Sets the value of the cargoEventId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCargoEventId(String value) {
        this.cargoEventId = value;
    }

    /**
     * Gets the value of the cargoEventExplanation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCargoEventExplanation() {
        return cargoEventExplanation;
    }

    /**
     * Sets the value of the cargoEventExplanation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCargoEventExplanation(String value) {
        this.cargoEventExplanation = value;
    }

    /**
     * Gets the value of the cargoReasonId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCargoReasonId() {
        return cargoReasonId;
    }

    /**
     * Sets the value of the cargoReasonId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCargoReasonId(String value) {
        this.cargoReasonId = value;
    }

    /**
     * Gets the value of the cargoReasonExplanation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCargoReasonExplanation() {
        return cargoReasonExplanation;
    }

    /**
     * Sets the value of the cargoReasonExplanation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCargoReasonExplanation(String value) {
        this.cargoReasonExplanation = value;
    }

    /**
     * Gets the value of the documentEventId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentEventId() {
        return documentEventId;
    }

    /**
     * Sets the value of the documentEventId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentEventId(String value) {
        this.documentEventId = value;
    }

    /**
     * Gets the value of the documentReasonId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentReasonId() {
        return documentReasonId;
    }

    /**
     * Sets the value of the documentReasonId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentReasonId(String value) {
        this.documentReasonId = value;
    }

    /**
     * Gets the value of the documentEventExplanation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentEventExplanation() {
        return documentEventExplanation;
    }

    /**
     * Sets the value of the documentEventExplanation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentEventExplanation(String value) {
        this.documentEventExplanation = value;
    }

    /**
     * Gets the value of the documentReasonExplanation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentReasonExplanation() {
        return documentReasonExplanation;
    }

    /**
     * Sets the value of the documentReasonExplanation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentReasonExplanation(String value) {
        this.documentReasonExplanation = value;
    }

    /**
     * Gets the value of the delInfoDeliveryFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelInfoDeliveryFlag() {
        return delInfoDeliveryFlag;
    }

    /**
     * Sets the value of the delInfoDeliveryFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelInfoDeliveryFlag(String value) {
        this.delInfoDeliveryFlag = value;
    }

    /**
     * Gets the value of the delInfoDelUnitId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelInfoDelUnitId() {
        return delInfoDelUnitId;
    }

    /**
     * Sets the value of the delInfoDelUnitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelInfoDelUnitId(String value) {
        this.delInfoDelUnitId = value;
    }

    /**
     * Gets the value of the delEmpName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelEmpName() {
        return delEmpName;
    }

    /**
     * Sets the value of the delEmpName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelEmpName(String value) {
        this.delEmpName = value;
    }

    /**
     * Gets the value of the delEmpId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelEmpId() {
        return delEmpId;
    }

    /**
     * Sets the value of the delEmpId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelEmpId(String value) {
        this.delEmpId = value;
    }

    /**
     * Gets the value of the rejectStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRejectStatus() {
        return rejectStatus;
    }

    /**
     * Sets the value of the rejectStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRejectStatus(String value) {
        this.rejectStatus = value;
    }

    /**
     * Gets the value of the rejectStatusExplanation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRejectStatusExplanation() {
        return rejectStatusExplanation;
    }

    /**
     * Sets the value of the rejectStatusExplanation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRejectStatusExplanation(String value) {
        this.rejectStatusExplanation = value;
    }

    /**
     * Gets the value of the rejectDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRejectDescription() {
        return rejectDescription;
    }

    /**
     * Sets the value of the rejectDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRejectDescription(String value) {
        this.rejectDescription = value;
    }

    /**
     * Gets the value of the rejectReasonExplanation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRejectReasonExplanation() {
        return rejectReasonExplanation;
    }

    /**
     * Sets the value of the rejectReasonExplanation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRejectReasonExplanation(String value) {
        this.rejectReasonExplanation = value;
    }

    /**
     * Gets the value of the returnDocId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnDocId() {
        return returnDocId;
    }

    /**
     * Sets the value of the returnDocId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnDocId(String value) {
        this.returnDocId = value;
    }

    /**
     * Gets the value of the returnDocumentDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnDocumentDate() {
        return returnDocumentDate;
    }

    /**
     * Sets the value of the returnDocumentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnDocumentDate(String value) {
        this.returnDocumentDate = value;
    }

    /**
     * Gets the value of the returnDeliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnDeliveryDate() {
        return returnDeliveryDate;
    }

    /**
     * Sets the value of the returnDeliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnDeliveryDate(String value) {
        this.returnDeliveryDate = value;
    }

    /**
     * Gets the value of the returnStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnStatus() {
        return returnStatus;
    }

    /**
     * Sets the value of the returnStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnStatus(String value) {
        this.returnStatus = value;
    }

    /**
     * Gets the value of the returnStatusExplanation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnStatusExplanation() {
        return returnStatusExplanation;
    }

    /**
     * Sets the value of the returnStatusExplanation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnStatusExplanation(String value) {
        this.returnStatusExplanation = value;
    }

    /**
     * Gets the value of the invDocFieldVOArray property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invDocFieldVOArray property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvDocFieldVOArray().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvDocFieldVO }
     * 
     * 
     */
    public List<InvDocFieldVO> getInvDocFieldVOArray() {
        if (invDocFieldVOArray == null) {
            invDocFieldVOArray = new ArrayList<InvDocFieldVO>();
        }
        return this.invDocFieldVOArray;
    }

    /**
     * Gets the value of the invDocCargoVOArray property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invDocCargoVOArray property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvDocCargoVOArray().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvDocCargoVO }
     * 
     * 
     */
    public List<InvDocCargoVO> getInvDocCargoVOArray() {
        if (invDocCargoVOArray == null) {
            invDocCargoVOArray = new ArrayList<InvDocCargoVO>();
        }
        return this.invDocCargoVOArray;
    }

}
