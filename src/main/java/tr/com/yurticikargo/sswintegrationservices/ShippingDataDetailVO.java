
package tr.com.yurticikargo.sswintegrationservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShippingDataDetailVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShippingDataDetailVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transactionStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionErrCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fieldName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fieldValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="docId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invoiceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="docNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="waybillNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="docCargoId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="senderCustId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="senderCustName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="senderAddressTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invCustId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invCustName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receiverCustId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receiverCustName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receiverAddressTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="senderAddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receiverAddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="senderCityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receiverCityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="senderCityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receiverCityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="senderTownId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receiverTownId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="senderTownName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receiverTownName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="senderMobilePhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receiverMobilePhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documentReceiverMobilePhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documentDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documentTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documentDelFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receiverInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="docType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="docTypeExplanation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contractId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trackingUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipmentDistance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estimatedDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="deliveryUnitId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deliveryUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="rejectFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rejectStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rejectStatusExplanation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rejectDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rejectReasonExplanation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="returnDocId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="returnDocumentDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="returnDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="returnStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="returnStatusExplanation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invDocFieldVOArray" type="{http://yurticikargo.com.tr/sswIntegrationServices}InvDocField2VO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="docCargoFieldVOArray" type="{http://yurticikargo.com.tr/sswIntegrationServices}DocCargoField2VO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="docCargoLifeCycleVOArray" type="{http://yurticikargo.com.tr/sswIntegrationServices}DocCargoLifeCycleVO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="docCargoVOArray" type="{http://yurticikargo.com.tr/sswIntegrationServices}DocCargoVO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="returnTotalPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="returnTotalVat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="returnTotalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShippingDataDetailVO", propOrder = {
    "transactionStatus",
    "transactionErrCode",
    "transactionMessage",
    "fieldName",
    "fieldValue",
    "docId",
    "invoiceNumber",
    "docNumber",
    "waybillNo",
    "docCargoId",
    "senderCustId",
    "senderCustName",
    "senderAddressTxt",
    "invCustId",
    "invCustName",
    "receiverCustId",
    "receiverCustName",
    "receiverAddressTxt",
    "senderAddressId",
    "receiverAddressId",
    "senderCityId",
    "receiverCityId",
    "senderCityName",
    "receiverCityName",
    "senderTownId",
    "receiverTownId",
    "senderTownName",
    "receiverTownName",
    "senderMobilePhoneNumber",
    "receiverMobilePhoneNumber",
    "documentReceiverMobilePhoneNumber",
    "documentDate",
    "documentTime",
    "documentDelFlag",
    "receiverInfo",
    "docType",
    "docTypeExplanation",
    "contractId",
    "trackingUrl",
    "shipmentDistance",
    "estimatedDeliveryDate",
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
    "deliveryUnitId",
    "deliveryUnitName",
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
    "rejectFlag",
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
    "docCargoFieldVOArray",
    "docCargoLifeCycleVOArray",
    "docCargoVOArray",
    "returnTotalPrice",
    "returnTotalVat",
    "returnTotalAmount"
})
public class ShippingDataDetailVO {

    protected String transactionStatus;
    protected String transactionErrCode;
    protected String transactionMessage;
    protected String fieldName;
    protected String fieldValue;
    protected String docId;
    protected String invoiceNumber;
    protected String docNumber;
    protected String waybillNo;
    protected String docCargoId;
    protected String senderCustId;
    protected String senderCustName;
    protected String senderAddressTxt;
    protected String invCustId;
    protected String invCustName;
    protected String receiverCustId;
    protected String receiverCustName;
    protected String receiverAddressTxt;
    protected String senderAddressId;
    protected String receiverAddressId;
    protected String senderCityId;
    protected String receiverCityId;
    protected String senderCityName;
    protected String receiverCityName;
    protected String senderTownId;
    protected String receiverTownId;
    protected String senderTownName;
    protected String receiverTownName;
    protected String senderMobilePhoneNumber;
    protected String receiverMobilePhoneNumber;
    protected String documentReceiverMobilePhoneNumber;
    protected String documentDate;
    protected String documentTime;
    protected String documentDelFlag;
    protected String receiverInfo;
    protected String docType;
    protected String docTypeExplanation;
    protected String contractId;
    protected String trackingUrl;
    protected String shipmentDistance;
    protected String estimatedDeliveryDate;
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
    protected String deliveryUnitId;
    protected String deliveryUnitName;
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
    protected String rejectFlag;
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
    protected List<InvDocField2VO> invDocFieldVOArray;
    @XmlElement(nillable = true)
    protected List<DocCargoField2VO> docCargoFieldVOArray;
    @XmlElement(nillable = true)
    protected List<DocCargoLifeCycleVO> docCargoLifeCycleVOArray;
    @XmlElement(nillable = true)
    protected List<DocCargoVO> docCargoVOArray;
    protected String returnTotalPrice;
    protected String returnTotalVat;
    protected String returnTotalAmount;

    /**
     * Gets the value of the transactionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionStatus() {
        return transactionStatus;
    }

    /**
     * Sets the value of the transactionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionStatus(String value) {
        this.transactionStatus = value;
    }

    /**
     * Gets the value of the transactionErrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionErrCode() {
        return transactionErrCode;
    }

    /**
     * Sets the value of the transactionErrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionErrCode(String value) {
        this.transactionErrCode = value;
    }

    /**
     * Gets the value of the transactionMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionMessage() {
        return transactionMessage;
    }

    /**
     * Sets the value of the transactionMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionMessage(String value) {
        this.transactionMessage = value;
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
     * Gets the value of the fieldValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldValue() {
        return fieldValue;
    }

    /**
     * Sets the value of the fieldValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldValue(String value) {
        this.fieldValue = value;
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
     * Gets the value of the docCargoId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocCargoId() {
        return docCargoId;
    }

    /**
     * Sets the value of the docCargoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocCargoId(String value) {
        this.docCargoId = value;
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
     * Gets the value of the invCustId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvCustId() {
        return invCustId;
    }

    /**
     * Sets the value of the invCustId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvCustId(String value) {
        this.invCustId = value;
    }

    /**
     * Gets the value of the invCustName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvCustName() {
        return invCustName;
    }

    /**
     * Sets the value of the invCustName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvCustName(String value) {
        this.invCustName = value;
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
     * Gets the value of the senderAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderAddressId() {
        return senderAddressId;
    }

    /**
     * Sets the value of the senderAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderAddressId(String value) {
        this.senderAddressId = value;
    }

    /**
     * Gets the value of the receiverAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverAddressId() {
        return receiverAddressId;
    }

    /**
     * Sets the value of the receiverAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverAddressId(String value) {
        this.receiverAddressId = value;
    }

    /**
     * Gets the value of the senderCityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderCityId() {
        return senderCityId;
    }

    /**
     * Sets the value of the senderCityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderCityId(String value) {
        this.senderCityId = value;
    }

    /**
     * Gets the value of the receiverCityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverCityId() {
        return receiverCityId;
    }

    /**
     * Sets the value of the receiverCityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverCityId(String value) {
        this.receiverCityId = value;
    }

    /**
     * Gets the value of the senderCityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderCityName() {
        return senderCityName;
    }

    /**
     * Sets the value of the senderCityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderCityName(String value) {
        this.senderCityName = value;
    }

    /**
     * Gets the value of the receiverCityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverCityName() {
        return receiverCityName;
    }

    /**
     * Sets the value of the receiverCityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverCityName(String value) {
        this.receiverCityName = value;
    }

    /**
     * Gets the value of the senderTownId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderTownId() {
        return senderTownId;
    }

    /**
     * Sets the value of the senderTownId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderTownId(String value) {
        this.senderTownId = value;
    }

    /**
     * Gets the value of the receiverTownId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverTownId() {
        return receiverTownId;
    }

    /**
     * Sets the value of the receiverTownId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverTownId(String value) {
        this.receiverTownId = value;
    }

    /**
     * Gets the value of the senderTownName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderTownName() {
        return senderTownName;
    }

    /**
     * Sets the value of the senderTownName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderTownName(String value) {
        this.senderTownName = value;
    }

    /**
     * Gets the value of the receiverTownName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverTownName() {
        return receiverTownName;
    }

    /**
     * Sets the value of the receiverTownName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverTownName(String value) {
        this.receiverTownName = value;
    }

    /**
     * Gets the value of the senderMobilePhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderMobilePhoneNumber() {
        return senderMobilePhoneNumber;
    }

    /**
     * Sets the value of the senderMobilePhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderMobilePhoneNumber(String value) {
        this.senderMobilePhoneNumber = value;
    }

    /**
     * Gets the value of the receiverMobilePhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverMobilePhoneNumber() {
        return receiverMobilePhoneNumber;
    }

    /**
     * Sets the value of the receiverMobilePhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverMobilePhoneNumber(String value) {
        this.receiverMobilePhoneNumber = value;
    }

    /**
     * Gets the value of the documentReceiverMobilePhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentReceiverMobilePhoneNumber() {
        return documentReceiverMobilePhoneNumber;
    }

    /**
     * Sets the value of the documentReceiverMobilePhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentReceiverMobilePhoneNumber(String value) {
        this.documentReceiverMobilePhoneNumber = value;
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
     * Gets the value of the shipmentDistance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentDistance() {
        return shipmentDistance;
    }

    /**
     * Sets the value of the shipmentDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentDistance(String value) {
        this.shipmentDistance = value;
    }

    /**
     * Gets the value of the estimatedDeliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstimatedDeliveryDate() {
        return estimatedDeliveryDate;
    }

    /**
     * Sets the value of the estimatedDeliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstimatedDeliveryDate(String value) {
        this.estimatedDeliveryDate = value;
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
     * {@link InvDocField2VO }
     * 
     * 
     */
    public List<InvDocField2VO> getInvDocFieldVOArray() {
        if (invDocFieldVOArray == null) {
            invDocFieldVOArray = new ArrayList<InvDocField2VO>();
        }
        return this.invDocFieldVOArray;
    }

    /**
     * Gets the value of the docCargoFieldVOArray property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the docCargoFieldVOArray property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocCargoFieldVOArray().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocCargoField2VO }
     * 
     * 
     */
    public List<DocCargoField2VO> getDocCargoFieldVOArray() {
        if (docCargoFieldVOArray == null) {
            docCargoFieldVOArray = new ArrayList<DocCargoField2VO>();
        }
        return this.docCargoFieldVOArray;
    }

    /**
     * Gets the value of the docCargoLifeCycleVOArray property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the docCargoLifeCycleVOArray property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocCargoLifeCycleVOArray().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocCargoLifeCycleVO }
     * 
     * 
     */
    public List<DocCargoLifeCycleVO> getDocCargoLifeCycleVOArray() {
        if (docCargoLifeCycleVOArray == null) {
            docCargoLifeCycleVOArray = new ArrayList<DocCargoLifeCycleVO>();
        }
        return this.docCargoLifeCycleVOArray;
    }

    /**
     * Gets the value of the docCargoVOArray property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the docCargoVOArray property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocCargoVOArray().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocCargoVO }
     * 
     * 
     */
    public List<DocCargoVO> getDocCargoVOArray() {
        if (docCargoVOArray == null) {
            docCargoVOArray = new ArrayList<DocCargoVO>();
        }
        return this.docCargoVOArray;
    }

    /**
     * Gets the value of the returnTotalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnTotalPrice() {
        return returnTotalPrice;
    }

    /**
     * Sets the value of the returnTotalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnTotalPrice(String value) {
        this.returnTotalPrice = value;
    }

    /**
     * Gets the value of the returnTotalVat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnTotalVat() {
        return returnTotalVat;
    }

    /**
     * Sets the value of the returnTotalVat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnTotalVat(String value) {
        this.returnTotalVat = value;
    }

    /**
     * Gets the value of the returnTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnTotalAmount() {
        return returnTotalAmount;
    }

    /**
     * Sets the value of the returnTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnTotalAmount(String value) {
        this.returnTotalAmount = value;
    }

}
