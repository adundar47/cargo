
package tr.com.yurticikargo.shippingorderdispatcherservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipmentDeliveryItemDetailVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentDeliveryItemDetailVO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://yurticikargo.com.tr/ShippingOrderDispatcherServices}ShippingDeliveryItemDetailVO">
 *       &lt;sequence>
 *         &lt;element name="estimatedDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estimatedDeliveryTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="perfCFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="delivDurationWorkDay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="delivDuration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="perfLateCEvent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="perfLateCReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receiverPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receiverGsm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipmentDistance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentDeliveryItemDetailVO", propOrder = {
    "estimatedDeliveryDate",
    "estimatedDeliveryTime",
    "perfCFlag",
    "delivDurationWorkDay",
    "delivDuration",
    "perfLateCEvent",
    "perfLateCReason",
    "receiverPhone",
    "receiverGsm",
    "shipmentDistance"
})
public class ShipmentDeliveryItemDetailVO
    extends ShippingDeliveryItemDetailVO
{

    protected String estimatedDeliveryDate;
    protected String estimatedDeliveryTime;
    protected String perfCFlag;
    protected String delivDurationWorkDay;
    protected String delivDuration;
    protected String perfLateCEvent;
    protected String perfLateCReason;
    protected String receiverPhone;
    protected String receiverGsm;
    protected String shipmentDistance;

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
     * Gets the value of the estimatedDeliveryTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstimatedDeliveryTime() {
        return estimatedDeliveryTime;
    }

    /**
     * Sets the value of the estimatedDeliveryTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstimatedDeliveryTime(String value) {
        this.estimatedDeliveryTime = value;
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
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelivDurationWorkDay() {
        return delivDurationWorkDay;
    }

    /**
     * Sets the value of the delivDurationWorkDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelivDurationWorkDay(String value) {
        this.delivDurationWorkDay = value;
    }

    /**
     * Gets the value of the delivDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelivDuration() {
        return delivDuration;
    }

    /**
     * Sets the value of the delivDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelivDuration(String value) {
        this.delivDuration = value;
    }

    /**
     * Gets the value of the perfLateCEvent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerfLateCEvent() {
        return perfLateCEvent;
    }

    /**
     * Sets the value of the perfLateCEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerfLateCEvent(String value) {
        this.perfLateCEvent = value;
    }

    /**
     * Gets the value of the perfLateCReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerfLateCReason() {
        return perfLateCReason;
    }

    /**
     * Sets the value of the perfLateCReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerfLateCReason(String value) {
        this.perfLateCReason = value;
    }

    /**
     * Gets the value of the receiverPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverPhone() {
        return receiverPhone;
    }

    /**
     * Sets the value of the receiverPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverPhone(String value) {
        this.receiverPhone = value;
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

}
