
package tr.com.yurticikargo.wsexceptions;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the tr.com.yurticikargo.wsexceptions package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _YurticikargoWSException_QNAME = new QName("http://yurticikargo.com.tr/WSExceptions/", "YurticikargoWSException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: tr.com.yurticikargo.wsexceptions
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link YurticikargoWSException }
     * 
     */
    public YurticikargoWSException createYurticikargoWSException() {
        return new YurticikargoWSException();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link YurticikargoWSException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://yurticikargo.com.tr/WSExceptions/", name = "YurticikargoWSException")
    public JAXBElement<YurticikargoWSException> createYurticikargoWSException(YurticikargoWSException value) {
        return new JAXBElement<YurticikargoWSException>(_YurticikargoWSException_QNAME, YurticikargoWSException.class, null, value);
    }

}
