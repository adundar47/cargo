
package tr.com.yurticikargo.sswintegrationservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShippingDataV2DetailVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShippingDataV2DetailVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="docId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionChannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fieldName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fieldValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documentDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="departureUnitId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="departureUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estimatedDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipmentDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="delInfoDeliveryFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="senderCustId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="senderCustName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invCustId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invCustName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arrivalUnitId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arrivalUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deliveryUnitId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deliveryUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currentUnitId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currentUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cargoEventId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cargoEventExplanation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cargoReasonId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cargoReasonExplanation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rejectFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rejectUnitId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rejectRequestDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rejectStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rejectStatusExplanation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rejectDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rejectReasonExplanation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="docCargoId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receiverCustId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receiverCustName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receiverAddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receiverAddressText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShippingDataV2DetailVO", propOrder = {
    "docId",
    "transactionChannel",
    "fieldName",
    "fieldValue",
    "documentDate",
    "departureUnitId",
    "departureUnitName",
    "estimatedDeliveryDate",
    "shipmentDeliveryDate",
    "delInfoDeliveryFlag",
    "senderCustId",
    "senderCustName",
    "invCustId",
    "invCustName",
    "arrivalUnitId",
    "arrivalUnitName",
    "deliveryUnitId",
    "deliveryUnitName",
    "currentUnitId",
    "currentUnitName",
    "cargoEventId",
    "cargoEventExplanation",
    "cargoReasonId",
    "cargoReasonExplanation",
    "rejectFlag",
    "rejectUnitId",
    "rejectRequestDate",
    "rejectStatus",
    "rejectStatusExplanation",
    "rejectDescription",
    "rejectReasonExplanation",
    "docCargoId",
    "receiverCustId",
    "receiverCustName",
    "receiverAddressId",
    "receiverAddressText"
})
public class ShippingDataV2DetailVO {

    protected String docId;
    protected String transactionChannel;
    protected String fieldName;
    protected String fieldValue;
    protected String documentDate;
    protected String departureUnitId;
    protected String departureUnitName;
    protected String estimatedDeliveryDate;
    protected String shipmentDeliveryDate;
    protected String delInfoDeliveryFlag;
    protected String senderCustId;
    protected String senderCustName;
    protected String invCustId;
    protected String invCustName;
    protected String arrivalUnitId;
    protected String arrivalUnitName;
    protected String deliveryUnitId;
    protected String deliveryUnitName;
    protected String currentUnitId;
    protected String currentUnitName;
    protected String cargoEventId;
    protected String cargoEventExplanation;
    protected String cargoReasonId;
    protected String cargoReasonExplanation;
    protected String rejectFlag;
    protected String rejectUnitId;
    protected String rejectRequestDate;
    protected String rejectStatus;
    protected String rejectStatusExplanation;
    protected String rejectDescription;
    protected String rejectReasonExplanation;
    protected String docCargoId;
    protected String receiverCustId;
    protected String receiverCustName;
    protected String receiverAddressId;
    protected String receiverAddressText;

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
     * Gets the value of the transactionChannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionChannel() {
        return transactionChannel;
    }

    /**
     * Sets the value of the transactionChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionChannel(String value) {
        this.transactionChannel = value;
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
     * Gets the value of the shipmentDeliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentDeliveryDate() {
        return shipmentDeliveryDate;
    }

    /**
     * Sets the value of the shipmentDeliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentDeliveryDate(String value) {
        this.shipmentDeliveryDate = value;
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
     * Gets the value of the currentUnitId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentUnitId() {
        return currentUnitId;
    }

    /**
     * Sets the value of the currentUnitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentUnitId(String value) {
        this.currentUnitId = value;
    }

    /**
     * Gets the value of the currentUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentUnitName() {
        return currentUnitName;
    }

    /**
     * Sets the value of the currentUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentUnitName(String value) {
        this.currentUnitName = value;
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
     * Gets the value of the rejectUnitId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRejectUnitId() {
        return rejectUnitId;
    }

    /**
     * Sets the value of the rejectUnitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRejectUnitId(String value) {
        this.rejectUnitId = value;
    }

    /**
     * Gets the value of the rejectRequestDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRejectRequestDate() {
        return rejectRequestDate;
    }

    /**
     * Sets the value of the rejectRequestDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRejectRequestDate(String value) {
        this.rejectRequestDate = value;
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
     * Gets the value of the receiverAddressText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverAddressText() {
        return receiverAddressText;
    }

    /**
     * Sets the value of the receiverAddressText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverAddressText(String value) {
        this.receiverAddressText = value;
    }

}
