
package tr.com.yurticikargo.sswintegrationservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustParamsVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustParamsVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="invCustIdArray" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="senderCustIdArray" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="receiverCustIdArray" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustParamsVO", propOrder = {
    "invCustIdArray",
    "senderCustIdArray",
    "receiverCustIdArray"
})
public class CustParamsVO {

    protected List<String> invCustIdArray;
    protected List<String> senderCustIdArray;
    protected List<String> receiverCustIdArray;

    /**
     * Gets the value of the invCustIdArray property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invCustIdArray property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvCustIdArray().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getInvCustIdArray() {
        if (invCustIdArray == null) {
            invCustIdArray = new ArrayList<String>();
        }
        return this.invCustIdArray;
    }

    /**
     * Gets the value of the senderCustIdArray property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the senderCustIdArray property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSenderCustIdArray().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSenderCustIdArray() {
        if (senderCustIdArray == null) {
            senderCustIdArray = new ArrayList<String>();
        }
        return this.senderCustIdArray;
    }

    /**
     * Gets the value of the receiverCustIdArray property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the receiverCustIdArray property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReceiverCustIdArray().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getReceiverCustIdArray() {
        if (receiverCustIdArray == null) {
            receiverCustIdArray = new ArrayList<String>();
        }
        return this.receiverCustIdArray;
    }

}
