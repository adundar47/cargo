
package tr.com.yurticikargo.sswintegrationservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocCargoVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocCargoVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="docCargoId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="docId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cargoNumber" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="cargoType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="desi" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="kg" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="barcodeStringValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocCargoVO", propOrder = {
    "docCargoId",
    "docId",
    "cargoNumber",
    "cargoType",
    "desi",
    "kg",
    "barcodeStringValue"
})
public class DocCargoVO {

    protected String docCargoId;
    protected String docId;
    protected long cargoNumber;
    protected String cargoType;
    protected double desi;
    protected double kg;
    protected String barcodeStringValue;

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
     * Gets the value of the cargoNumber property.
     * 
     */
    public long getCargoNumber() {
        return cargoNumber;
    }

    /**
     * Sets the value of the cargoNumber property.
     * 
     */
    public void setCargoNumber(long value) {
        this.cargoNumber = value;
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
     * Gets the value of the desi property.
     * 
     */
    public double getDesi() {
        return desi;
    }

    /**
     * Sets the value of the desi property.
     * 
     */
    public void setDesi(double value) {
        this.desi = value;
    }

    /**
     * Gets the value of the kg property.
     * 
     */
    public double getKg() {
        return kg;
    }

    /**
     * Sets the value of the kg property.
     * 
     */
    public void setKg(double value) {
        this.kg = value;
    }

    /**
     * Gets the value of the barcodeStringValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBarcodeStringValue() {
        return barcodeStringValue;
    }

    /**
     * Sets the value of the barcodeStringValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBarcodeStringValue(String value) {
        this.barcodeStringValue = value;
    }

}
