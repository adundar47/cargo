
package tr.com.yurticikargo.sswintegrationservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocCargoLifeCycleVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocCargoLifeCycleVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="docCargoId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eventDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eventId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eventName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eventTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reasonId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reasonName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="townName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unitId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="desi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="desiKg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocCargoLifeCycleVO", propOrder = {
    "docCargoId",
    "cityName",
    "eventDate",
    "eventId",
    "eventName",
    "eventTime",
    "reasonId",
    "reasonName",
    "townName",
    "unitId",
    "unitName",
    "desi",
    "kg",
    "desiKg"
})
public class DocCargoLifeCycleVO {

    protected String docCargoId;
    protected String cityName;
    protected String eventDate;
    protected String eventId;
    protected String eventName;
    protected String eventTime;
    protected String reasonId;
    protected String reasonName;
    protected String townName;
    protected String unitId;
    protected String unitName;
    protected String desi;
    protected String kg;
    protected String desiKg;

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
     * Gets the value of the eventDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventDate() {
        return eventDate;
    }

    /**
     * Sets the value of the eventDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventDate(String value) {
        this.eventDate = value;
    }

    /**
     * Gets the value of the eventId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventId() {
        return eventId;
    }

    /**
     * Sets the value of the eventId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventId(String value) {
        this.eventId = value;
    }

    /**
     * Gets the value of the eventName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventName() {
        return eventName;
    }

    /**
     * Sets the value of the eventName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventName(String value) {
        this.eventName = value;
    }

    /**
     * Gets the value of the eventTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventTime() {
        return eventTime;
    }

    /**
     * Sets the value of the eventTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventTime(String value) {
        this.eventTime = value;
    }

    /**
     * Gets the value of the reasonId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonId() {
        return reasonId;
    }

    /**
     * Sets the value of the reasonId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonId(String value) {
        this.reasonId = value;
    }

    /**
     * Gets the value of the reasonName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonName() {
        return reasonName;
    }

    /**
     * Sets the value of the reasonName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonName(String value) {
        this.reasonName = value;
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
     * Gets the value of the unitId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitId() {
        return unitId;
    }

    /**
     * Sets the value of the unitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitId(String value) {
        this.unitId = value;
    }

    /**
     * Gets the value of the unitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitName() {
        return unitName;
    }

    /**
     * Sets the value of the unitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitName(String value) {
        this.unitName = value;
    }

    /**
     * Gets the value of the desi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesi() {
        return desi;
    }

    /**
     * Sets the value of the desi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesi(String value) {
        this.desi = value;
    }

    /**
     * Gets the value of the kg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKg() {
        return kg;
    }

    /**
     * Sets the value of the kg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKg(String value) {
        this.kg = value;
    }

    /**
     * Gets the value of the desiKg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesiKg() {
        return desiKg;
    }

    /**
     * Sets the value of the desiKg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesiKg(String value) {
        this.desiKg = value;
    }

}
