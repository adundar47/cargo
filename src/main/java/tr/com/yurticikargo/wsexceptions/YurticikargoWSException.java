
package tr.com.yurticikargo.wsexceptions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for YurticikargoWSException complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="YurticikargoWSException">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="errorCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="errText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "YurticikargoWSException", propOrder = {
    "errorCode",
    "errText"
})
public class YurticikargoWSException {

    protected int errorCode;
    protected String errText;

    /**
     * Gets the value of the errorCode property.
     * 
     */
    public int getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     */
    public void setErrorCode(int value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the errText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrText() {
        return errText;
    }

    /**
     * Sets the value of the errText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrText(String value) {
        this.errText = value;
    }

}
