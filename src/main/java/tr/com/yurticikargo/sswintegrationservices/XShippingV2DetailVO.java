
package tr.com.yurticikargo.sswintegrationservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XShippingV2DetailVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XShippingV2DetailVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="docId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trackingUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="docNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="senderCustId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="senderCustName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receiverCustId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recCustName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invCustId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invCustName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="depUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="depCityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="departureDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="departureTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arrUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arrUnitId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arrCityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arrivalDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="docType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pickUpType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deliveryType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prodName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prodGrpName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cargoType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalCargo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="totalDesiKg" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="productPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="totalPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="totalVat" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="totalPriceWithVat" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="docCargoId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currentUnitId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currentUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cargoEventDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cargoEventTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cargoEventId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cargoReasonId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cargoEventExplanation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cargoReasonExplanation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deliveredTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deliveryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deliveryTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pickupDocumentNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="waybillNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extraInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="activeFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userCreate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateCreate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timeCreate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userUpdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="delUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="delUnitId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="delCityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="depCityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arrCityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="delCityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recAddressTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invoiceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arrUnitTelArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arrUnitTelNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arrMainUnitId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="delMainUnitId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="campaignName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="campaignId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="campaignKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="insurance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arrivalTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dayDiff" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="recCustTelArea1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recCustTelNo1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="depMainUnitId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="perfCFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="delivDurationWorkDay" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="delivDuration" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="perfLateCEventId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="perfLateCReasonId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contractId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="docFieldAllValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipmentDistance" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="estimatedDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="campaignAreaType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reroutingFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deliveryUnitArrivalDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deliveryUnitArrivalTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="waybillCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="docCarryBagNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="senderAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="senderTownName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receiverTownName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="senderPhone1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="senderGsm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receiverPhone1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receiverGsm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arrCountyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="depCountyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receiverCountyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nextDayDeliveryFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nextDayDeliveryEventId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nextDayDeliveryReasonId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="txEventDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="senderCountyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionChannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="senderCustTelArea1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="senderCustTelNo1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="delFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rejectFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rejectReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="delMainUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arrMainUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="depMainUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invDocFieldVOArray" type="{http://yurticikargo.com.tr/sswIntegrationServices}InvDocField2VO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="docCargoFieldVOArray" type="{http://yurticikargo.com.tr/sswIntegrationServices}DocCargoField2VO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="docCargoLifeCycleVOArray" type="{http://yurticikargo.com.tr/sswIntegrationServices}DocCargoLifeCycleVO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="docCargoVOArray" type="{http://yurticikargo.com.tr/sswIntegrationServices}DocCargoVO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XShippingV2DetailVO", propOrder = {
    "docId",
    "trackingUrl",
    "docNumber",
    "senderCustId",
    "senderCustName",
    "receiverCustId",
    "recCustName",
    "invCustId",
    "invCustName",
    "depUnitName",
    "depCityName",
    "departureDate",
    "departureTime",
    "arrUnitName",
    "arrUnitId",
    "arrCityName",
    "arrivalDate",
    "docType",
    "paymentType",
    "pickUpType",
    "deliveryType",
    "prodName",
    "prodGrpName",
    "cargoType",
    "totalCargo",
    "totalDesiKg",
    "productPrice",
    "totalPrice",
    "totalVat",
    "totalPriceWithVat",
    "docCargoId",
    "currentUnitId",
    "currentUnitName",
    "cargoEventDate",
    "cargoEventTime",
    "cargoEventId",
    "cargoReasonId",
    "cargoEventExplanation",
    "cargoReasonExplanation",
    "deliveredTo",
    "deliveryDate",
    "deliveryTime",
    "pickupDocumentNo",
    "waybillNo",
    "extraInfo",
    "description",
    "activeFlag",
    "userCreate",
    "dateCreate",
    "timeCreate",
    "userUpdate",
    "delUnitName",
    "delUnitId",
    "delCityName",
    "depCityId",
    "arrCityId",
    "delCityId",
    "recAddressTxt",
    "invoiceNumber",
    "arrUnitTelArea",
    "arrUnitTelNo",
    "arrMainUnitId",
    "delMainUnitId",
    "campaignName",
    "campaignId",
    "campaignKey",
    "insurance",
    "arrivalTime",
    "dayDiff",
    "recCustTelArea1",
    "recCustTelNo1",
    "depMainUnitId",
    "perfCFlag",
    "delivDurationWorkDay",
    "delivDuration",
    "perfLateCEventId",
    "perfLateCReasonId",
    "contractId",
    "docFieldAllValue",
    "shipmentDistance",
    "estimatedDeliveryDate",
    "campaignAreaType",
    "reroutingFlag",
    "deliveryUnitArrivalDate",
    "deliveryUnitArrivalTime",
    "waybillCount",
    "docCarryBagNo",
    "senderAddress",
    "senderTownName",
    "receiverTownName",
    "senderPhone1",
    "senderGsm",
    "receiverPhone1",
    "receiverGsm",
    "arrCountyId",
    "depCountyId",
    "receiverCountyName",
    "nextDayDeliveryFlag",
    "nextDayDeliveryEventId",
    "nextDayDeliveryReasonId",
    "txEventDate",
    "senderCountyName",
    "transactionChannel",
    "senderCustTelArea1",
    "senderCustTelNo1",
    "delFlag",
    "rejectFlag",
    "rejectReason",
    "delMainUnitName",
    "arrMainUnitName",
    "depMainUnitName",
    "invDocFieldVOArray",
    "docCargoFieldVOArray",
    "docCargoLifeCycleVOArray",
    "docCargoVOArray"
})
public class XShippingV2DetailVO {

    protected String docId;
    protected String trackingUrl;
    protected String docNumber;
    protected String senderCustId;
    protected String senderCustName;
    protected String receiverCustId;
    protected String recCustName;
    protected String invCustId;
    protected String invCustName;
    protected String depUnitName;
    protected String depCityName;
    protected String departureDate;
    protected String departureTime;
    protected String arrUnitName;
    protected String arrUnitId;
    protected String arrCityName;
    protected String arrivalDate;
    protected String docType;
    protected String paymentType;
    protected String pickUpType;
    protected String deliveryType;
    protected String prodName;
    protected String prodGrpName;
    protected String cargoType;
    protected int totalCargo;
    protected double totalDesiKg;
    protected double productPrice;
    protected double totalPrice;
    protected double totalVat;
    protected double totalPriceWithVat;
    protected String docCargoId;
    protected String currentUnitId;
    protected String currentUnitName;
    protected String cargoEventDate;
    protected String cargoEventTime;
    protected String cargoEventId;
    protected String cargoReasonId;
    protected String cargoEventExplanation;
    protected String cargoReasonExplanation;
    protected String deliveredTo;
    protected String deliveryDate;
    protected String deliveryTime;
    protected String pickupDocumentNo;
    protected String waybillNo;
    protected String extraInfo;
    protected String description;
    protected String activeFlag;
    protected String userCreate;
    protected String dateCreate;
    protected String timeCreate;
    protected String userUpdate;
    protected String delUnitName;
    protected String delUnitId;
    protected String delCityName;
    protected String depCityId;
    protected String arrCityId;
    protected String delCityId;
    protected String recAddressTxt;
    protected String invoiceNumber;
    protected String arrUnitTelArea;
    protected String arrUnitTelNo;
    protected String arrMainUnitId;
    protected String delMainUnitId;
    protected String campaignName;
    protected String campaignId;
    protected String campaignKey;
    protected String insurance;
    protected String arrivalTime;
    protected int dayDiff;
    protected String recCustTelArea1;
    protected String recCustTelNo1;
    protected String depMainUnitId;
    protected String perfCFlag;
    protected int delivDurationWorkDay;
    protected int delivDuration;
    protected String perfLateCEventId;
    protected String perfLateCReasonId;
    protected String contractId;
    protected String docFieldAllValue;
    protected int shipmentDistance;
    protected String estimatedDeliveryDate;
    protected String campaignAreaType;
    protected String reroutingFlag;
    protected String deliveryUnitArrivalDate;
    protected String deliveryUnitArrivalTime;
    protected int waybillCount;
    protected String docCarryBagNo;
    protected String senderAddress;
    protected String senderTownName;
    protected String receiverTownName;
    protected String senderPhone1;
    protected String senderGsm;
    protected String receiverPhone1;
    protected String receiverGsm;
    protected String arrCountyId;
    protected String depCountyId;
    protected String receiverCountyName;
    protected String nextDayDeliveryFlag;
    protected String nextDayDeliveryEventId;
    protected String nextDayDeliveryReasonId;
    protected String txEventDate;
    protected String senderCountyName;
    protected String transactionChannel;
    protected String senderCustTelArea1;
    protected String senderCustTelNo1;
    protected String delFlag;
    protected String rejectFlag;
    protected String rejectReason;
    protected String delMainUnitName;
    protected String arrMainUnitName;
    protected String depMainUnitName;
    @XmlElement(nillable = true)
    protected List<InvDocField2VO> invDocFieldVOArray;
    @XmlElement(nillable = true)
    protected List<DocCargoField2VO> docCargoFieldVOArray;
    @XmlElement(nillable = true)
    protected List<DocCargoLifeCycleVO> docCargoLifeCycleVOArray;
    @XmlElement(nillable = true)
    protected List<DocCargoVO> docCargoVOArray;

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
     * Gets the value of the recCustName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecCustName() {
        return recCustName;
    }

    /**
     * Sets the value of the recCustName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecCustName(String value) {
        this.recCustName = value;
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
     * Gets the value of the depUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepUnitName() {
        return depUnitName;
    }

    /**
     * Sets the value of the depUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepUnitName(String value) {
        this.depUnitName = value;
    }

    /**
     * Gets the value of the depCityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepCityName() {
        return depCityName;
    }

    /**
     * Sets the value of the depCityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepCityName(String value) {
        this.depCityName = value;
    }

    /**
     * Gets the value of the departureDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureDate() {
        return departureDate;
    }

    /**
     * Sets the value of the departureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureDate(String value) {
        this.departureDate = value;
    }

    /**
     * Gets the value of the departureTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureTime() {
        return departureTime;
    }

    /**
     * Sets the value of the departureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureTime(String value) {
        this.departureTime = value;
    }

    /**
     * Gets the value of the arrUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrUnitName() {
        return arrUnitName;
    }

    /**
     * Sets the value of the arrUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrUnitName(String value) {
        this.arrUnitName = value;
    }

    /**
     * Gets the value of the arrUnitId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrUnitId() {
        return arrUnitId;
    }

    /**
     * Sets the value of the arrUnitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrUnitId(String value) {
        this.arrUnitId = value;
    }

    /**
     * Gets the value of the arrCityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrCityName() {
        return arrCityName;
    }

    /**
     * Sets the value of the arrCityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrCityName(String value) {
        this.arrCityName = value;
    }

    /**
     * Gets the value of the arrivalDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalDate() {
        return arrivalDate;
    }

    /**
     * Sets the value of the arrivalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalDate(String value) {
        this.arrivalDate = value;
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
     * Gets the value of the paymentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * Sets the value of the paymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentType(String value) {
        this.paymentType = value;
    }

    /**
     * Gets the value of the pickUpType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickUpType() {
        return pickUpType;
    }

    /**
     * Sets the value of the pickUpType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickUpType(String value) {
        this.pickUpType = value;
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
     * Gets the value of the prodName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdName() {
        return prodName;
    }

    /**
     * Sets the value of the prodName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdName(String value) {
        this.prodName = value;
    }

    /**
     * Gets the value of the prodGrpName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdGrpName() {
        return prodGrpName;
    }

    /**
     * Sets the value of the prodGrpName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdGrpName(String value) {
        this.prodGrpName = value;
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
     * Gets the value of the totalCargo property.
     * 
     */
    public int getTotalCargo() {
        return totalCargo;
    }

    /**
     * Sets the value of the totalCargo property.
     * 
     */
    public void setTotalCargo(int value) {
        this.totalCargo = value;
    }

    /**
     * Gets the value of the totalDesiKg property.
     * 
     */
    public double getTotalDesiKg() {
        return totalDesiKg;
    }

    /**
     * Sets the value of the totalDesiKg property.
     * 
     */
    public void setTotalDesiKg(double value) {
        this.totalDesiKg = value;
    }

    /**
     * Gets the value of the productPrice property.
     * 
     */
    public double getProductPrice() {
        return productPrice;
    }

    /**
     * Sets the value of the productPrice property.
     * 
     */
    public void setProductPrice(double value) {
        this.productPrice = value;
    }

    /**
     * Gets the value of the totalPrice property.
     * 
     */
    public double getTotalPrice() {
        return totalPrice;
    }

    /**
     * Sets the value of the totalPrice property.
     * 
     */
    public void setTotalPrice(double value) {
        this.totalPrice = value;
    }

    /**
     * Gets the value of the totalVat property.
     * 
     */
    public double getTotalVat() {
        return totalVat;
    }

    /**
     * Sets the value of the totalVat property.
     * 
     */
    public void setTotalVat(double value) {
        this.totalVat = value;
    }

    /**
     * Gets the value of the totalPriceWithVat property.
     * 
     */
    public double getTotalPriceWithVat() {
        return totalPriceWithVat;
    }

    /**
     * Sets the value of the totalPriceWithVat property.
     * 
     */
    public void setTotalPriceWithVat(double value) {
        this.totalPriceWithVat = value;
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
     * Gets the value of the cargoEventDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCargoEventDate() {
        return cargoEventDate;
    }

    /**
     * Sets the value of the cargoEventDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCargoEventDate(String value) {
        this.cargoEventDate = value;
    }

    /**
     * Gets the value of the cargoEventTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCargoEventTime() {
        return cargoEventTime;
    }

    /**
     * Sets the value of the cargoEventTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCargoEventTime(String value) {
        this.cargoEventTime = value;
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
     * Gets the value of the deliveredTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveredTo() {
        return deliveredTo;
    }

    /**
     * Sets the value of the deliveredTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveredTo(String value) {
        this.deliveredTo = value;
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
     * Gets the value of the pickupDocumentNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickupDocumentNo() {
        return pickupDocumentNo;
    }

    /**
     * Sets the value of the pickupDocumentNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickupDocumentNo(String value) {
        this.pickupDocumentNo = value;
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
     * Gets the value of the extraInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtraInfo() {
        return extraInfo;
    }

    /**
     * Sets the value of the extraInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtraInfo(String value) {
        this.extraInfo = value;
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
     * Gets the value of the activeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActiveFlag() {
        return activeFlag;
    }

    /**
     * Sets the value of the activeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActiveFlag(String value) {
        this.activeFlag = value;
    }

    /**
     * Gets the value of the userCreate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserCreate() {
        return userCreate;
    }

    /**
     * Sets the value of the userCreate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserCreate(String value) {
        this.userCreate = value;
    }

    /**
     * Gets the value of the dateCreate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateCreate() {
        return dateCreate;
    }

    /**
     * Sets the value of the dateCreate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateCreate(String value) {
        this.dateCreate = value;
    }

    /**
     * Gets the value of the timeCreate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeCreate() {
        return timeCreate;
    }

    /**
     * Sets the value of the timeCreate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeCreate(String value) {
        this.timeCreate = value;
    }

    /**
     * Gets the value of the userUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserUpdate() {
        return userUpdate;
    }

    /**
     * Sets the value of the userUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserUpdate(String value) {
        this.userUpdate = value;
    }

    /**
     * Gets the value of the delUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelUnitName() {
        return delUnitName;
    }

    /**
     * Sets the value of the delUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelUnitName(String value) {
        this.delUnitName = value;
    }

    /**
     * Gets the value of the delUnitId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelUnitId() {
        return delUnitId;
    }

    /**
     * Sets the value of the delUnitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelUnitId(String value) {
        this.delUnitId = value;
    }

    /**
     * Gets the value of the delCityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelCityName() {
        return delCityName;
    }

    /**
     * Sets the value of the delCityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelCityName(String value) {
        this.delCityName = value;
    }

    /**
     * Gets the value of the depCityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepCityId() {
        return depCityId;
    }

    /**
     * Sets the value of the depCityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepCityId(String value) {
        this.depCityId = value;
    }

    /**
     * Gets the value of the arrCityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrCityId() {
        return arrCityId;
    }

    /**
     * Sets the value of the arrCityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrCityId(String value) {
        this.arrCityId = value;
    }

    /**
     * Gets the value of the delCityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelCityId() {
        return delCityId;
    }

    /**
     * Sets the value of the delCityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelCityId(String value) {
        this.delCityId = value;
    }

    /**
     * Gets the value of the recAddressTxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecAddressTxt() {
        return recAddressTxt;
    }

    /**
     * Sets the value of the recAddressTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecAddressTxt(String value) {
        this.recAddressTxt = value;
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
     * Gets the value of the arrUnitTelArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrUnitTelArea() {
        return arrUnitTelArea;
    }

    /**
     * Sets the value of the arrUnitTelArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrUnitTelArea(String value) {
        this.arrUnitTelArea = value;
    }

    /**
     * Gets the value of the arrUnitTelNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrUnitTelNo() {
        return arrUnitTelNo;
    }

    /**
     * Sets the value of the arrUnitTelNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrUnitTelNo(String value) {
        this.arrUnitTelNo = value;
    }

    /**
     * Gets the value of the arrMainUnitId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrMainUnitId() {
        return arrMainUnitId;
    }

    /**
     * Sets the value of the arrMainUnitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrMainUnitId(String value) {
        this.arrMainUnitId = value;
    }

    /**
     * Gets the value of the delMainUnitId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelMainUnitId() {
        return delMainUnitId;
    }

    /**
     * Sets the value of the delMainUnitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelMainUnitId(String value) {
        this.delMainUnitId = value;
    }

    /**
     * Gets the value of the campaignName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampaignName() {
        return campaignName;
    }

    /**
     * Sets the value of the campaignName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampaignName(String value) {
        this.campaignName = value;
    }

    /**
     * Gets the value of the campaignId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampaignId() {
        return campaignId;
    }

    /**
     * Sets the value of the campaignId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampaignId(String value) {
        this.campaignId = value;
    }

    /**
     * Gets the value of the campaignKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampaignKey() {
        return campaignKey;
    }

    /**
     * Sets the value of the campaignKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampaignKey(String value) {
        this.campaignKey = value;
    }

    /**
     * Gets the value of the insurance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsurance() {
        return insurance;
    }

    /**
     * Sets the value of the insurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsurance(String value) {
        this.insurance = value;
    }

    /**
     * Gets the value of the arrivalTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalTime() {
        return arrivalTime;
    }

    /**
     * Sets the value of the arrivalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalTime(String value) {
        this.arrivalTime = value;
    }

    /**
     * Gets the value of the dayDiff property.
     * 
     */
    public int getDayDiff() {
        return dayDiff;
    }

    /**
     * Sets the value of the dayDiff property.
     * 
     */
    public void setDayDiff(int value) {
        this.dayDiff = value;
    }

    /**
     * Gets the value of the recCustTelArea1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecCustTelArea1() {
        return recCustTelArea1;
    }

    /**
     * Sets the value of the recCustTelArea1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecCustTelArea1(String value) {
        this.recCustTelArea1 = value;
    }

    /**
     * Gets the value of the recCustTelNo1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecCustTelNo1() {
        return recCustTelNo1;
    }

    /**
     * Sets the value of the recCustTelNo1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecCustTelNo1(String value) {
        this.recCustTelNo1 = value;
    }

    /**
     * Gets the value of the depMainUnitId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepMainUnitId() {
        return depMainUnitId;
    }

    /**
     * Sets the value of the depMainUnitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepMainUnitId(String value) {
        this.depMainUnitId = value;
    }

    /**
     * Gets the value of the perfCFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerfCFlag() {
        return perfCFlag;
    }

    /**
     * Sets the value of the perfCFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerfCFlag(String value) {
        this.perfCFlag = value;
    }

    /**
     * Gets the value of the delivDurationWorkDay property.
     * 
     */
    public int getDelivDurationWorkDay() {
        return delivDurationWorkDay;
    }

    /**
     * Sets the value of the delivDurationWorkDay property.
     * 
     */
    public void setDelivDurationWorkDay(int value) {
        this.delivDurationWorkDay = value;
    }

    /**
     * Gets the value of the delivDuration property.
     * 
     */
    public int getDelivDuration() {
        return delivDuration;
    }

    /**
     * Sets the value of the delivDuration property.
     * 
     */
    public void setDelivDuration(int value) {
        this.delivDuration = value;
    }

    /**
     * Gets the value of the perfLateCEventId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerfLateCEventId() {
        return perfLateCEventId;
    }

    /**
     * Sets the value of the perfLateCEventId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerfLateCEventId(String value) {
        this.perfLateCEventId = value;
    }

    /**
     * Gets the value of the perfLateCReasonId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerfLateCReasonId() {
        return perfLateCReasonId;
    }

    /**
     * Sets the value of the perfLateCReasonId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerfLateCReasonId(String value) {
        this.perfLateCReasonId = value;
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
     * Gets the value of the shipmentDistance property.
     * 
     */
    public int getShipmentDistance() {
        return shipmentDistance;
    }

    /**
     * Sets the value of the shipmentDistance property.
     * 
     */
    public void setShipmentDistance(int value) {
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
     * Gets the value of the campaignAreaType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampaignAreaType() {
        return campaignAreaType;
    }

    /**
     * Sets the value of the campaignAreaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampaignAreaType(String value) {
        this.campaignAreaType = value;
    }

    /**
     * Gets the value of the reroutingFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReroutingFlag() {
        return reroutingFlag;
    }

    /**
     * Sets the value of the reroutingFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReroutingFlag(String value) {
        this.reroutingFlag = value;
    }

    /**
     * Gets the value of the deliveryUnitArrivalDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryUnitArrivalDate() {
        return deliveryUnitArrivalDate;
    }

    /**
     * Sets the value of the deliveryUnitArrivalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryUnitArrivalDate(String value) {
        this.deliveryUnitArrivalDate = value;
    }

    /**
     * Gets the value of the deliveryUnitArrivalTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryUnitArrivalTime() {
        return deliveryUnitArrivalTime;
    }

    /**
     * Sets the value of the deliveryUnitArrivalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryUnitArrivalTime(String value) {
        this.deliveryUnitArrivalTime = value;
    }

    /**
     * Gets the value of the waybillCount property.
     * 
     */
    public int getWaybillCount() {
        return waybillCount;
    }

    /**
     * Sets the value of the waybillCount property.
     * 
     */
    public void setWaybillCount(int value) {
        this.waybillCount = value;
    }

    /**
     * Gets the value of the docCarryBagNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocCarryBagNo() {
        return docCarryBagNo;
    }

    /**
     * Sets the value of the docCarryBagNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocCarryBagNo(String value) {
        this.docCarryBagNo = value;
    }

    /**
     * Gets the value of the senderAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderAddress() {
        return senderAddress;
    }

    /**
     * Sets the value of the senderAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderAddress(String value) {
        this.senderAddress = value;
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
     * Gets the value of the senderPhone1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderPhone1() {
        return senderPhone1;
    }

    /**
     * Sets the value of the senderPhone1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderPhone1(String value) {
        this.senderPhone1 = value;
    }

    /**
     * Gets the value of the senderGsm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderGsm() {
        return senderGsm;
    }

    /**
     * Sets the value of the senderGsm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderGsm(String value) {
        this.senderGsm = value;
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
     * Gets the value of the receiverGsm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverGsm() {
        return receiverGsm;
    }

    /**
     * Sets the value of the receiverGsm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverGsm(String value) {
        this.receiverGsm = value;
    }

    /**
     * Gets the value of the arrCountyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrCountyId() {
        return arrCountyId;
    }

    /**
     * Sets the value of the arrCountyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrCountyId(String value) {
        this.arrCountyId = value;
    }

    /**
     * Gets the value of the depCountyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepCountyId() {
        return depCountyId;
    }

    /**
     * Sets the value of the depCountyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepCountyId(String value) {
        this.depCountyId = value;
    }

    /**
     * Gets the value of the receiverCountyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverCountyName() {
        return receiverCountyName;
    }

    /**
     * Sets the value of the receiverCountyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverCountyName(String value) {
        this.receiverCountyName = value;
    }

    /**
     * Gets the value of the nextDayDeliveryFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextDayDeliveryFlag() {
        return nextDayDeliveryFlag;
    }

    /**
     * Sets the value of the nextDayDeliveryFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextDayDeliveryFlag(String value) {
        this.nextDayDeliveryFlag = value;
    }

    /**
     * Gets the value of the nextDayDeliveryEventId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextDayDeliveryEventId() {
        return nextDayDeliveryEventId;
    }

    /**
     * Sets the value of the nextDayDeliveryEventId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextDayDeliveryEventId(String value) {
        this.nextDayDeliveryEventId = value;
    }

    /**
     * Gets the value of the nextDayDeliveryReasonId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextDayDeliveryReasonId() {
        return nextDayDeliveryReasonId;
    }

    /**
     * Sets the value of the nextDayDeliveryReasonId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextDayDeliveryReasonId(String value) {
        this.nextDayDeliveryReasonId = value;
    }

    /**
     * Gets the value of the txEventDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxEventDate() {
        return txEventDate;
    }

    /**
     * Sets the value of the txEventDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxEventDate(String value) {
        this.txEventDate = value;
    }

    /**
     * Gets the value of the senderCountyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderCountyName() {
        return senderCountyName;
    }

    /**
     * Sets the value of the senderCountyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderCountyName(String value) {
        this.senderCountyName = value;
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
     * Gets the value of the senderCustTelArea1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderCustTelArea1() {
        return senderCustTelArea1;
    }

    /**
     * Sets the value of the senderCustTelArea1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderCustTelArea1(String value) {
        this.senderCustTelArea1 = value;
    }

    /**
     * Gets the value of the senderCustTelNo1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderCustTelNo1() {
        return senderCustTelNo1;
    }

    /**
     * Sets the value of the senderCustTelNo1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderCustTelNo1(String value) {
        this.senderCustTelNo1 = value;
    }

    /**
     * Gets the value of the delFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * Sets the value of the delFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelFlag(String value) {
        this.delFlag = value;
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
     * Gets the value of the rejectReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRejectReason() {
        return rejectReason;
    }

    /**
     * Sets the value of the rejectReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRejectReason(String value) {
        this.rejectReason = value;
    }

    /**
     * Gets the value of the delMainUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelMainUnitName() {
        return delMainUnitName;
    }

    /**
     * Sets the value of the delMainUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelMainUnitName(String value) {
        this.delMainUnitName = value;
    }

    /**
     * Gets the value of the arrMainUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrMainUnitName() {
        return arrMainUnitName;
    }

    /**
     * Sets the value of the arrMainUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrMainUnitName(String value) {
        this.arrMainUnitName = value;
    }

    /**
     * Gets the value of the depMainUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepMainUnitName() {
        return depMainUnitName;
    }

    /**
     * Sets the value of the depMainUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepMainUnitName(String value) {
        this.depMainUnitName = value;
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

}
