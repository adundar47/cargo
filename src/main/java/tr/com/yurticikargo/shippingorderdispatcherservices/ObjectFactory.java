
package tr.com.yurticikargo.shippingorderdispatcherservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import tr.com.yurticikargo.wsexceptions.YurticikargoWSException;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the tr.com.yurticikargo.shippingorderdispatcherservices package. 
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

    private final static QName _CancelShipment_QNAME = new QName("http://yurticikargo.com.tr/ShippingOrderDispatcherServices", "cancelShipment");
    private final static QName _QueryShipmentResponse_QNAME = new QName("http://yurticikargo.com.tr/ShippingOrderDispatcherServices", "queryShipmentResponse");
    private final static QName _YurticikargoWSException_QNAME = new QName("http://yurticikargo.com.tr/ShippingOrderDispatcherServices", "YurticikargoWSException");
    private final static QName _ShippingDeliveryItemDetailVO_QNAME = new QName("http://yurticikargo.com.tr/ShippingOrderDispatcherServices", "ShippingDeliveryItemDetailVO");
    private final static QName _CreateShipmentResponse_QNAME = new QName("http://yurticikargo.com.tr/ShippingOrderDispatcherServices", "createShipmentResponse");
    private final static QName _QueryShipment_QNAME = new QName("http://yurticikargo.com.tr/ShippingOrderDispatcherServices", "queryShipment");
    private final static QName _ShipmentDeliveryItemDetailVO_QNAME = new QName("http://yurticikargo.com.tr/ShippingOrderDispatcherServices", "ShipmentDeliveryItemDetailVO");
    private final static QName _CreateShipment_QNAME = new QName("http://yurticikargo.com.tr/ShippingOrderDispatcherServices", "createShipment");
    private final static QName _SaveReturnShipmentCodeResponse_QNAME = new QName("http://yurticikargo.com.tr/ShippingOrderDispatcherServices", "saveReturnShipmentCodeResponse");
    private final static QName _CreateShipmentDetail_QNAME = new QName("http://yurticikargo.com.tr/ShippingOrderDispatcherServices", "createShipmentDetail");
    private final static QName _CancelReturnShipmentCode_QNAME = new QName("http://yurticikargo.com.tr/ShippingOrderDispatcherServices", "cancelReturnShipmentCode");
    private final static QName _CancelReturnShipmentCodeResponse_QNAME = new QName("http://yurticikargo.com.tr/ShippingOrderDispatcherServices", "cancelReturnShipmentCodeResponse");
    private final static QName _ShippingOrderVO_QNAME = new QName("http://yurticikargo.com.tr/ShippingOrderDispatcherServices", "ShippingOrderVO");
    private final static QName _CancelShipmentResponse_QNAME = new QName("http://yurticikargo.com.tr/ShippingOrderDispatcherServices", "cancelShipmentResponse");
    private final static QName _SaveReturnShipmentCode_QNAME = new QName("http://yurticikargo.com.tr/ShippingOrderDispatcherServices", "saveReturnShipmentCode");
    private final static QName _CreateShipmentDetailResponse_QNAME = new QName("http://yurticikargo.com.tr/ShippingOrderDispatcherServices", "createShipmentDetailResponse");
    private final static QName _QueryShipmentDetailResponse_QNAME = new QName("http://yurticikargo.com.tr/ShippingOrderDispatcherServices", "queryShipmentDetailResponse");
    private final static QName _QueryShipmentDetail_QNAME = new QName("http://yurticikargo.com.tr/ShippingOrderDispatcherServices", "queryShipmentDetail");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: tr.com.yurticikargo.shippingorderdispatcherservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ShipmentDeliveryItemDetailVO }
     * 
     */
    public ShipmentDeliveryItemDetailVO createShipmentDeliveryItemDetailVO() {
        return new ShipmentDeliveryItemDetailVO();
    }

    /**
     * Create an instance of {@link CreateShipment }
     * 
     */
    public CreateShipment createCreateShipment() {
        return new CreateShipment();
    }

    /**
     * Create an instance of {@link SaveReturnShipmentCodeResponse }
     * 
     */
    public SaveReturnShipmentCodeResponse createSaveReturnShipmentCodeResponse() {
        return new SaveReturnShipmentCodeResponse();
    }

    /**
     * Create an instance of {@link CreateShipmentResponse }
     * 
     */
    public CreateShipmentResponse createCreateShipmentResponse() {
        return new CreateShipmentResponse();
    }

    /**
     * Create an instance of {@link QueryShipment }
     * 
     */
    public QueryShipment createQueryShipment() {
        return new QueryShipment();
    }

    /**
     * Create an instance of {@link CreateShipmentDetail }
     * 
     */
    public CreateShipmentDetail createCreateShipmentDetail() {
        return new CreateShipmentDetail();
    }

    /**
     * Create an instance of {@link CancelShipment }
     * 
     */
    public CancelShipment createCancelShipment() {
        return new CancelShipment();
    }

    /**
     * Create an instance of {@link QueryShipmentResponse }
     * 
     */
    public QueryShipmentResponse createQueryShipmentResponse() {
        return new QueryShipmentResponse();
    }

    /**
     * Create an instance of {@link CreateShipmentDetailResponse }
     * 
     */
    public CreateShipmentDetailResponse createCreateShipmentDetailResponse() {
        return new CreateShipmentDetailResponse();
    }

    /**
     * Create an instance of {@link QueryShipmentDetailResponse }
     * 
     */
    public QueryShipmentDetailResponse createQueryShipmentDetailResponse() {
        return new QueryShipmentDetailResponse();
    }

    /**
     * Create an instance of {@link SaveReturnShipmentCode }
     * 
     */
    public SaveReturnShipmentCode createSaveReturnShipmentCode() {
        return new SaveReturnShipmentCode();
    }

    /**
     * Create an instance of {@link QueryShipmentDetail }
     * 
     */
    public QueryShipmentDetail createQueryShipmentDetail() {
        return new QueryShipmentDetail();
    }

    /**
     * Create an instance of {@link CancelReturnShipmentCode }
     * 
     */
    public CancelReturnShipmentCode createCancelReturnShipmentCode() {
        return new CancelReturnShipmentCode();
    }

    /**
     * Create an instance of {@link CancelReturnShipmentCodeResponse }
     * 
     */
    public CancelReturnShipmentCodeResponse createCancelReturnShipmentCodeResponse() {
        return new CancelReturnShipmentCodeResponse();
    }

    /**
     * Create an instance of {@link ShippingOrderVO }
     * 
     */
    public ShippingOrderVO createShippingOrderVO() {
        return new ShippingOrderVO();
    }

    /**
     * Create an instance of {@link CancelShipmentResponse }
     * 
     */
    public CancelShipmentResponse createCancelShipmentResponse() {
        return new CancelShipmentResponse();
    }

    /**
     * Create an instance of {@link ShippingCancelResultVO }
     * 
     */
    public ShippingCancelResultVO createShippingCancelResultVO() {
        return new ShippingCancelResultVO();
    }

    /**
     * Create an instance of {@link ShippingOrderResultVO }
     * 
     */
    public ShippingOrderResultVO createShippingOrderResultVO() {
        return new ShippingOrderResultVO();
    }

    /**
     * Create an instance of {@link ShippingDeliveryResultVO }
     * 
     */
    public ShippingDeliveryResultVO createShippingDeliveryResultVO() {
        return new ShippingDeliveryResultVO();
    }

    /**
     * Create an instance of {@link ShippingDeliveryItemDetailVO }
     * 
     */
    public ShippingDeliveryItemDetailVO createShippingDeliveryItemDetailVO() {
        return new ShippingDeliveryItemDetailVO();
    }

    /**
     * Create an instance of {@link InvDocFieldVO }
     * 
     */
    public InvDocFieldVO createInvDocFieldVO() {
        return new InvDocFieldVO();
    }

    /**
     * Create an instance of {@link ExtendedBaseResultVO }
     * 
     */
    public ExtendedBaseResultVO createExtendedBaseResultVO() {
        return new ExtendedBaseResultVO();
    }

    /**
     * Create an instance of {@link ShippingDeliveryDetailVO }
     * 
     */
    public ShippingDeliveryDetailVO createShippingDeliveryDetailVO() {
        return new ShippingDeliveryDetailVO();
    }

    /**
     * Create an instance of {@link InvDocCargoVO }
     * 
     */
    public InvDocCargoVO createInvDocCargoVO() {
        return new InvDocCargoVO();
    }

    /**
     * Create an instance of {@link ShipmentDeliveryDetailVO }
     * 
     */
    public ShipmentDeliveryDetailVO createShipmentDeliveryDetailVO() {
        return new ShipmentDeliveryDetailVO();
    }

    /**
     * Create an instance of {@link ShippingOrderCreateVO }
     * 
     */
    public ShippingOrderCreateVO createShippingOrderCreateVO() {
        return new ShippingOrderCreateVO();
    }

    /**
     * Create an instance of {@link ShipmentDeliveryResultVO }
     * 
     */
    public ShipmentDeliveryResultVO createShipmentDeliveryResultVO() {
        return new ShipmentDeliveryResultVO();
    }

    /**
     * Create an instance of {@link ShippingOrderDetailVO }
     * 
     */
    public ShippingOrderDetailVO createShippingOrderDetailVO() {
        return new ShippingOrderDetailVO();
    }

    /**
     * Create an instance of {@link ShippingCancelDetailVO }
     * 
     */
    public ShippingCancelDetailVO createShippingCancelDetailVO() {
        return new ShippingCancelDetailVO();
    }

    /**
     * Create an instance of {@link BaseResultVO }
     * 
     */
    public BaseResultVO createBaseResultVO() {
        return new BaseResultVO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelShipment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://yurticikargo.com.tr/ShippingOrderDispatcherServices", name = "cancelShipment")
    public JAXBElement<CancelShipment> createCancelShipment(CancelShipment value) {
        return new JAXBElement<CancelShipment>(_CancelShipment_QNAME, CancelShipment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryShipmentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://yurticikargo.com.tr/ShippingOrderDispatcherServices", name = "queryShipmentResponse")
    public JAXBElement<QueryShipmentResponse> createQueryShipmentResponse(QueryShipmentResponse value) {
        return new JAXBElement<QueryShipmentResponse>(_QueryShipmentResponse_QNAME, QueryShipmentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link YurticikargoWSException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://yurticikargo.com.tr/ShippingOrderDispatcherServices", name = "YurticikargoWSException")
    public JAXBElement<YurticikargoWSException> createYurticikargoWSException(YurticikargoWSException value) {
        return new JAXBElement<YurticikargoWSException>(_YurticikargoWSException_QNAME, YurticikargoWSException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://yurticikargo.com.tr/ShippingOrderDispatcherServices", name = "ShippingDeliveryItemDetailVO")
    public JAXBElement<Object> createShippingDeliveryItemDetailVO(Object value) {
        return new JAXBElement<Object>(_ShippingDeliveryItemDetailVO_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateShipmentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://yurticikargo.com.tr/ShippingOrderDispatcherServices", name = "createShipmentResponse")
    public JAXBElement<CreateShipmentResponse> createCreateShipmentResponse(CreateShipmentResponse value) {
        return new JAXBElement<CreateShipmentResponse>(_CreateShipmentResponse_QNAME, CreateShipmentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryShipment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://yurticikargo.com.tr/ShippingOrderDispatcherServices", name = "queryShipment")
    public JAXBElement<QueryShipment> createQueryShipment(QueryShipment value) {
        return new JAXBElement<QueryShipment>(_QueryShipment_QNAME, QueryShipment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShipmentDeliveryItemDetailVO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://yurticikargo.com.tr/ShippingOrderDispatcherServices", name = "ShipmentDeliveryItemDetailVO")
    public JAXBElement<ShipmentDeliveryItemDetailVO> createShipmentDeliveryItemDetailVO(ShipmentDeliveryItemDetailVO value) {
        return new JAXBElement<ShipmentDeliveryItemDetailVO>(_ShipmentDeliveryItemDetailVO_QNAME, ShipmentDeliveryItemDetailVO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateShipment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://yurticikargo.com.tr/ShippingOrderDispatcherServices", name = "createShipment")
    public JAXBElement<CreateShipment> createCreateShipment(CreateShipment value) {
        return new JAXBElement<CreateShipment>(_CreateShipment_QNAME, CreateShipment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveReturnShipmentCodeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://yurticikargo.com.tr/ShippingOrderDispatcherServices", name = "saveReturnShipmentCodeResponse")
    public JAXBElement<SaveReturnShipmentCodeResponse> createSaveReturnShipmentCodeResponse(SaveReturnShipmentCodeResponse value) {
        return new JAXBElement<SaveReturnShipmentCodeResponse>(_SaveReturnShipmentCodeResponse_QNAME, SaveReturnShipmentCodeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateShipmentDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://yurticikargo.com.tr/ShippingOrderDispatcherServices", name = "createShipmentDetail")
    public JAXBElement<CreateShipmentDetail> createCreateShipmentDetail(CreateShipmentDetail value) {
        return new JAXBElement<CreateShipmentDetail>(_CreateShipmentDetail_QNAME, CreateShipmentDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelReturnShipmentCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://yurticikargo.com.tr/ShippingOrderDispatcherServices", name = "cancelReturnShipmentCode")
    public JAXBElement<CancelReturnShipmentCode> createCancelReturnShipmentCode(CancelReturnShipmentCode value) {
        return new JAXBElement<CancelReturnShipmentCode>(_CancelReturnShipmentCode_QNAME, CancelReturnShipmentCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelReturnShipmentCodeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://yurticikargo.com.tr/ShippingOrderDispatcherServices", name = "cancelReturnShipmentCodeResponse")
    public JAXBElement<CancelReturnShipmentCodeResponse> createCancelReturnShipmentCodeResponse(CancelReturnShipmentCodeResponse value) {
        return new JAXBElement<CancelReturnShipmentCodeResponse>(_CancelReturnShipmentCodeResponse_QNAME, CancelReturnShipmentCodeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShippingOrderVO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://yurticikargo.com.tr/ShippingOrderDispatcherServices", name = "ShippingOrderVO")
    public JAXBElement<ShippingOrderVO> createShippingOrderVO(ShippingOrderVO value) {
        return new JAXBElement<ShippingOrderVO>(_ShippingOrderVO_QNAME, ShippingOrderVO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelShipmentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://yurticikargo.com.tr/ShippingOrderDispatcherServices", name = "cancelShipmentResponse")
    public JAXBElement<CancelShipmentResponse> createCancelShipmentResponse(CancelShipmentResponse value) {
        return new JAXBElement<CancelShipmentResponse>(_CancelShipmentResponse_QNAME, CancelShipmentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveReturnShipmentCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://yurticikargo.com.tr/ShippingOrderDispatcherServices", name = "saveReturnShipmentCode")
    public JAXBElement<SaveReturnShipmentCode> createSaveReturnShipmentCode(SaveReturnShipmentCode value) {
        return new JAXBElement<SaveReturnShipmentCode>(_SaveReturnShipmentCode_QNAME, SaveReturnShipmentCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateShipmentDetailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://yurticikargo.com.tr/ShippingOrderDispatcherServices", name = "createShipmentDetailResponse")
    public JAXBElement<CreateShipmentDetailResponse> createCreateShipmentDetailResponse(CreateShipmentDetailResponse value) {
        return new JAXBElement<CreateShipmentDetailResponse>(_CreateShipmentDetailResponse_QNAME, CreateShipmentDetailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryShipmentDetailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://yurticikargo.com.tr/ShippingOrderDispatcherServices", name = "queryShipmentDetailResponse")
    public JAXBElement<QueryShipmentDetailResponse> createQueryShipmentDetailResponse(QueryShipmentDetailResponse value) {
        return new JAXBElement<QueryShipmentDetailResponse>(_QueryShipmentDetailResponse_QNAME, QueryShipmentDetailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryShipmentDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://yurticikargo.com.tr/ShippingOrderDispatcherServices", name = "queryShipmentDetail")
    public JAXBElement<QueryShipmentDetail> createQueryShipmentDetail(QueryShipmentDetail value) {
        return new JAXBElement<QueryShipmentDetail>(_QueryShipmentDetail_QNAME, QueryShipmentDetail.class, null, value);
    }

}
