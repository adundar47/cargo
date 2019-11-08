
package tr.com.yurticikargo.sswintegrationservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import tr.com.yurticikargo.wsexceptions.YurticikargoWSException;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the tr.com.yurticikargo.sswintegrationservices package. 
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

    private final static QName _ListNgiShipping_QNAME = new QName("http://yurticikargo.com.tr/sswIntegrationServices", "listNgiShipping");
    private final static QName _CustParamsVO_QNAME = new QName("http://yurticikargo.com.tr/sswIntegrationServices", "CustParamsVO");
    private final static QName _ListInvDocumentByGrpSpecialField_QNAME = new QName("http://yurticikargo.com.tr/sswIntegrationServices", "listInvDocumentByGrpSpecialField");
    private final static QName _ShippingDataV2DetailVO_QNAME = new QName("http://yurticikargo.com.tr/sswIntegrationServices", "ShippingDataV2DetailVO");
    private final static QName _ListInvDocumentInterfaceWithFailedDeliveryV2_QNAME = new QName("http://yurticikargo.com.tr/sswIntegrationServices", "listInvDocumentInterfaceWithFailedDeliveryV2");
    private final static QName _DocCargoVO_QNAME = new QName("http://yurticikargo.com.tr/sswIntegrationServices", "DocCargoVO");
    private final static QName _ListInvDocumentInterfaceWithFailedDeliveryV2Response_QNAME = new QName("http://yurticikargo.com.tr/sswIntegrationServices", "listInvDocumentInterfaceWithFailedDeliveryV2Response");
    private final static QName _GetDeliveryCollectionInfoByReference_QNAME = new QName("http://yurticikargo.com.tr/sswIntegrationServices", "getDeliveryCollectionInfoByReference");
    private final static QName _ListInvDocumentByWaybillNoResponse_QNAME = new QName("http://yurticikargo.com.tr/sswIntegrationServices", "listInvDocumentByWaybillNoResponse");
    private final static QName _ListNgiShippingResponse_QNAME = new QName("http://yurticikargo.com.tr/sswIntegrationServices", "listNgiShippingResponse");
    private final static QName _YurticikargoWSException_QNAME = new QName("http://yurticikargo.com.tr/sswIntegrationServices", "YurticikargoWSException");
    private final static QName _InvDocField2VO_QNAME = new QName("http://yurticikargo.com.tr/sswIntegrationServices", "InvDocField2VO");
    private final static QName _UnitParamsVO_QNAME = new QName("http://yurticikargo.com.tr/sswIntegrationServices", "UnitParamsVO");
    private final static QName _ListInvDocumentByWaybillNo_QNAME = new QName("http://yurticikargo.com.tr/sswIntegrationServices", "listInvDocumentByWaybillNo");
    private final static QName _GetDeliveryCollectionInfoByReferenceResponse_QNAME = new QName("http://yurticikargo.com.tr/sswIntegrationServices", "getDeliveryCollectionInfoByReferenceResponse");
    private final static QName _XShippingV2DetailVO_QNAME = new QName("http://yurticikargo.com.tr/sswIntegrationServices", "XShippingV2DetailVO");
    private final static QName _ShippingDataDetailVO_QNAME = new QName("http://yurticikargo.com.tr/sswIntegrationServices", "ShippingDataDetailVO");
    private final static QName _ListInvDocumentByCustIdV2Response_QNAME = new QName("http://yurticikargo.com.tr/sswIntegrationServices", "listInvDocumentByCustIdV2Response");
    private final static QName _ListInvDocumentInterfaceByReferenceResponse_QNAME = new QName("http://yurticikargo.com.tr/sswIntegrationServices", "listInvDocumentInterfaceByReferenceResponse");
    private final static QName _DocCargoField2VO_QNAME = new QName("http://yurticikargo.com.tr/sswIntegrationServices", "DocCargoField2VO");
    private final static QName _ShippingDataV3DetailVO_QNAME = new QName("http://yurticikargo.com.tr/sswIntegrationServices", "ShippingDataV3DetailVO");
    private final static QName _ListInvDocumentByCustIdV2_QNAME = new QName("http://yurticikargo.com.tr/sswIntegrationServices", "listInvDocumentByCustIdV2");
    private final static QName _ListInvDocumentByGrpSpecialFieldResponse_QNAME = new QName("http://yurticikargo.com.tr/sswIntegrationServices", "listInvDocumentByGrpSpecialFieldResponse");
    private final static QName _ListInvDocumentInterfaceByReference_QNAME = new QName("http://yurticikargo.com.tr/sswIntegrationServices", "listInvDocumentInterfaceByReference");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: tr.com.yurticikargo.sswintegrationservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ShippingDataV2DetailVO }
     * 
     */
    public ShippingDataV2DetailVO createShippingDataV2DetailVO() {
        return new ShippingDataV2DetailVO();
    }

    /**
     * Create an instance of {@link ListNgiShippingResponse }
     * 
     */
    public ListNgiShippingResponse createListNgiShippingResponse() {
        return new ListNgiShippingResponse();
    }

    /**
     * Create an instance of {@link GetDeliveryCollectionInfoByReference }
     * 
     */
    public GetDeliveryCollectionInfoByReference createGetDeliveryCollectionInfoByReference() {
        return new GetDeliveryCollectionInfoByReference();
    }

    /**
     * Create an instance of {@link ListInvDocumentByGrpSpecialField }
     * 
     */
    public ListInvDocumentByGrpSpecialField createListInvDocumentByGrpSpecialField() {
        return new ListInvDocumentByGrpSpecialField();
    }

    /**
     * Create an instance of {@link ListInvDocumentByWaybillNoResponse }
     * 
     */
    public ListInvDocumentByWaybillNoResponse createListInvDocumentByWaybillNoResponse() {
        return new ListInvDocumentByWaybillNoResponse();
    }

    /**
     * Create an instance of {@link CustParamsVO }
     * 
     */
    public CustParamsVO createCustParamsVO() {
        return new CustParamsVO();
    }

    /**
     * Create an instance of {@link ListInvDocumentInterfaceWithFailedDeliveryV2Response }
     * 
     */
    public ListInvDocumentInterfaceWithFailedDeliveryV2Response createListInvDocumentInterfaceWithFailedDeliveryV2Response() {
        return new ListInvDocumentInterfaceWithFailedDeliveryV2Response();
    }

    /**
     * Create an instance of {@link ListNgiShipping }
     * 
     */
    public ListNgiShipping createListNgiShipping() {
        return new ListNgiShipping();
    }

    /**
     * Create an instance of {@link GetDeliveryCollectionInfoByReferenceResponse }
     * 
     */
    public GetDeliveryCollectionInfoByReferenceResponse createGetDeliveryCollectionInfoByReferenceResponse() {
        return new GetDeliveryCollectionInfoByReferenceResponse();
    }

    /**
     * Create an instance of {@link UnitParamsVO }
     * 
     */
    public UnitParamsVO createUnitParamsVO() {
        return new UnitParamsVO();
    }

    /**
     * Create an instance of {@link ListInvDocumentByWaybillNo }
     * 
     */
    public ListInvDocumentByWaybillNo createListInvDocumentByWaybillNo() {
        return new ListInvDocumentByWaybillNo();
    }

    /**
     * Create an instance of {@link InvDocField2VO }
     * 
     */
    public InvDocField2VO createInvDocField2VO() {
        return new InvDocField2VO();
    }

    /**
     * Create an instance of {@link ListInvDocumentByCustIdV2Response }
     * 
     */
    public ListInvDocumentByCustIdV2Response createListInvDocumentByCustIdV2Response() {
        return new ListInvDocumentByCustIdV2Response();
    }

    /**
     * Create an instance of {@link ListInvDocumentInterfaceByReferenceResponse }
     * 
     */
    public ListInvDocumentInterfaceByReferenceResponse createListInvDocumentInterfaceByReferenceResponse() {
        return new ListInvDocumentInterfaceByReferenceResponse();
    }

    /**
     * Create an instance of {@link ListInvDocumentInterfaceWithFailedDeliveryV2 }
     * 
     */
    public ListInvDocumentInterfaceWithFailedDeliveryV2 createListInvDocumentInterfaceWithFailedDeliveryV2() {
        return new ListInvDocumentInterfaceWithFailedDeliveryV2();
    }

    /**
     * Create an instance of {@link ShippingDataDetailVO }
     * 
     */
    public ShippingDataDetailVO createShippingDataDetailVO() {
        return new ShippingDataDetailVO();
    }

    /**
     * Create an instance of {@link XShippingV2DetailVO }
     * 
     */
    public XShippingV2DetailVO createXShippingV2DetailVO() {
        return new XShippingV2DetailVO();
    }

    /**
     * Create an instance of {@link ListInvDocumentByGrpSpecialFieldResponse }
     * 
     */
    public ListInvDocumentByGrpSpecialFieldResponse createListInvDocumentByGrpSpecialFieldResponse() {
        return new ListInvDocumentByGrpSpecialFieldResponse();
    }

    /**
     * Create an instance of {@link ListInvDocumentInterfaceByReference }
     * 
     */
    public ListInvDocumentInterfaceByReference createListInvDocumentInterfaceByReference() {
        return new ListInvDocumentInterfaceByReference();
    }

    /**
     * Create an instance of {@link ListInvDocumentByCustIdV2 }
     * 
     */
    public ListInvDocumentByCustIdV2 createListInvDocumentByCustIdV2() {
        return new ListInvDocumentByCustIdV2();
    }

    /**
     * Create an instance of {@link DocCargoVO }
     * 
     */
    public DocCargoVO createDocCargoVO() {
        return new DocCargoVO();
    }

    /**
     * Create an instance of {@link ShippingDataV3DetailVO }
     * 
     */
    public ShippingDataV3DetailVO createShippingDataV3DetailVO() {
        return new ShippingDataV3DetailVO();
    }

    /**
     * Create an instance of {@link DocCargoField2VO }
     * 
     */
    public DocCargoField2VO createDocCargoField2VO() {
        return new DocCargoField2VO();
    }

    /**
     * Create an instance of {@link ShippingDataV3ResponseVO }
     * 
     */
    public ShippingDataV3ResponseVO createShippingDataV3ResponseVO() {
        return new ShippingDataV3ResponseVO();
    }

    /**
     * Create an instance of {@link ExtendedBaseResultVO }
     * 
     */
    public ExtendedBaseResultVO createExtendedBaseResultVO() {
        return new ExtendedBaseResultVO();
    }

    /**
     * Create an instance of {@link DocCargoLifeCycleVO }
     * 
     */
    public DocCargoLifeCycleVO createDocCargoLifeCycleVO() {
        return new DocCargoLifeCycleVO();
    }

    /**
     * Create an instance of {@link ShippingDataV2ResponseVO }
     * 
     */
    public ShippingDataV2ResponseVO createShippingDataV2ResponseVO() {
        return new ShippingDataV2ResponseVO();
    }

    /**
     * Create an instance of {@link ShippingDataResponseVO }
     * 
     */
    public ShippingDataResponseVO createShippingDataResponseVO() {
        return new ShippingDataResponseVO();
    }

    /**
     * Create an instance of {@link XShippingV2ResponseVO }
     * 
     */
    public XShippingV2ResponseVO createXShippingV2ResponseVO() {
        return new XShippingV2ResponseVO();
    }

    /**
     * Create an instance of {@link DeliveryCollectionDataResponseVO }
     * 
     */
    public DeliveryCollectionDataResponseVO createDeliveryCollectionDataResponseVO() {
        return new DeliveryCollectionDataResponseVO();
    }

    /**
     * Create an instance of {@link QListDeliveryCollectionInfoVO }
     * 
     */
    public QListDeliveryCollectionInfoVO createQListDeliveryCollectionInfoVO() {
        return new QListDeliveryCollectionInfoVO();
    }

    /**
     * Create an instance of {@link BaseResultVO }
     * 
     */
    public BaseResultVO createBaseResultVO() {
        return new BaseResultVO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListNgiShipping }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://yurticikargo.com.tr/sswIntegrationServices", name = "listNgiShipping")
    public JAXBElement<ListNgiShipping> createListNgiShipping(ListNgiShipping value) {
        return new JAXBElement<ListNgiShipping>(_ListNgiShipping_QNAME, ListNgiShipping.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustParamsVO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://yurticikargo.com.tr/sswIntegrationServices", name = "CustParamsVO")
    public JAXBElement<CustParamsVO> createCustParamsVO(CustParamsVO value) {
        return new JAXBElement<CustParamsVO>(_CustParamsVO_QNAME, CustParamsVO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListInvDocumentByGrpSpecialField }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://yurticikargo.com.tr/sswIntegrationServices", name = "listInvDocumentByGrpSpecialField")
    public JAXBElement<ListInvDocumentByGrpSpecialField> createListInvDocumentByGrpSpecialField(ListInvDocumentByGrpSpecialField value) {
        return new JAXBElement<ListInvDocumentByGrpSpecialField>(_ListInvDocumentByGrpSpecialField_QNAME, ListInvDocumentByGrpSpecialField.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShippingDataV2DetailVO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://yurticikargo.com.tr/sswIntegrationServices", name = "ShippingDataV2DetailVO")
    public JAXBElement<ShippingDataV2DetailVO> createShippingDataV2DetailVO(ShippingDataV2DetailVO value) {
        return new JAXBElement<ShippingDataV2DetailVO>(_ShippingDataV2DetailVO_QNAME, ShippingDataV2DetailVO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListInvDocumentInterfaceWithFailedDeliveryV2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://yurticikargo.com.tr/sswIntegrationServices", name = "listInvDocumentInterfaceWithFailedDeliveryV2")
    public JAXBElement<ListInvDocumentInterfaceWithFailedDeliveryV2> createListInvDocumentInterfaceWithFailedDeliveryV2(ListInvDocumentInterfaceWithFailedDeliveryV2 value) {
        return new JAXBElement<ListInvDocumentInterfaceWithFailedDeliveryV2>(_ListInvDocumentInterfaceWithFailedDeliveryV2_QNAME, ListInvDocumentInterfaceWithFailedDeliveryV2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocCargoVO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://yurticikargo.com.tr/sswIntegrationServices", name = "DocCargoVO")
    public JAXBElement<DocCargoVO> createDocCargoVO(DocCargoVO value) {
        return new JAXBElement<DocCargoVO>(_DocCargoVO_QNAME, DocCargoVO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListInvDocumentInterfaceWithFailedDeliveryV2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://yurticikargo.com.tr/sswIntegrationServices", name = "listInvDocumentInterfaceWithFailedDeliveryV2Response")
    public JAXBElement<ListInvDocumentInterfaceWithFailedDeliveryV2Response> createListInvDocumentInterfaceWithFailedDeliveryV2Response(ListInvDocumentInterfaceWithFailedDeliveryV2Response value) {
        return new JAXBElement<ListInvDocumentInterfaceWithFailedDeliveryV2Response>(_ListInvDocumentInterfaceWithFailedDeliveryV2Response_QNAME, ListInvDocumentInterfaceWithFailedDeliveryV2Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeliveryCollectionInfoByReference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://yurticikargo.com.tr/sswIntegrationServices", name = "getDeliveryCollectionInfoByReference")
    public JAXBElement<GetDeliveryCollectionInfoByReference> createGetDeliveryCollectionInfoByReference(GetDeliveryCollectionInfoByReference value) {
        return new JAXBElement<GetDeliveryCollectionInfoByReference>(_GetDeliveryCollectionInfoByReference_QNAME, GetDeliveryCollectionInfoByReference.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListInvDocumentByWaybillNoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://yurticikargo.com.tr/sswIntegrationServices", name = "listInvDocumentByWaybillNoResponse")
    public JAXBElement<ListInvDocumentByWaybillNoResponse> createListInvDocumentByWaybillNoResponse(ListInvDocumentByWaybillNoResponse value) {
        return new JAXBElement<ListInvDocumentByWaybillNoResponse>(_ListInvDocumentByWaybillNoResponse_QNAME, ListInvDocumentByWaybillNoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListNgiShippingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://yurticikargo.com.tr/sswIntegrationServices", name = "listNgiShippingResponse")
    public JAXBElement<ListNgiShippingResponse> createListNgiShippingResponse(ListNgiShippingResponse value) {
        return new JAXBElement<ListNgiShippingResponse>(_ListNgiShippingResponse_QNAME, ListNgiShippingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link YurticikargoWSException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://yurticikargo.com.tr/sswIntegrationServices", name = "YurticikargoWSException")
    public JAXBElement<YurticikargoWSException> createYurticikargoWSException(YurticikargoWSException value) {
        return new JAXBElement<YurticikargoWSException>(_YurticikargoWSException_QNAME, YurticikargoWSException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvDocField2VO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://yurticikargo.com.tr/sswIntegrationServices", name = "InvDocField2VO")
    public JAXBElement<InvDocField2VO> createInvDocField2VO(InvDocField2VO value) {
        return new JAXBElement<InvDocField2VO>(_InvDocField2VO_QNAME, InvDocField2VO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnitParamsVO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://yurticikargo.com.tr/sswIntegrationServices", name = "UnitParamsVO")
    public JAXBElement<UnitParamsVO> createUnitParamsVO(UnitParamsVO value) {
        return new JAXBElement<UnitParamsVO>(_UnitParamsVO_QNAME, UnitParamsVO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListInvDocumentByWaybillNo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://yurticikargo.com.tr/sswIntegrationServices", name = "listInvDocumentByWaybillNo")
    public JAXBElement<ListInvDocumentByWaybillNo> createListInvDocumentByWaybillNo(ListInvDocumentByWaybillNo value) {
        return new JAXBElement<ListInvDocumentByWaybillNo>(_ListInvDocumentByWaybillNo_QNAME, ListInvDocumentByWaybillNo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeliveryCollectionInfoByReferenceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://yurticikargo.com.tr/sswIntegrationServices", name = "getDeliveryCollectionInfoByReferenceResponse")
    public JAXBElement<GetDeliveryCollectionInfoByReferenceResponse> createGetDeliveryCollectionInfoByReferenceResponse(GetDeliveryCollectionInfoByReferenceResponse value) {
        return new JAXBElement<GetDeliveryCollectionInfoByReferenceResponse>(_GetDeliveryCollectionInfoByReferenceResponse_QNAME, GetDeliveryCollectionInfoByReferenceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XShippingV2DetailVO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://yurticikargo.com.tr/sswIntegrationServices", name = "XShippingV2DetailVO")
    public JAXBElement<XShippingV2DetailVO> createXShippingV2DetailVO(XShippingV2DetailVO value) {
        return new JAXBElement<XShippingV2DetailVO>(_XShippingV2DetailVO_QNAME, XShippingV2DetailVO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShippingDataDetailVO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://yurticikargo.com.tr/sswIntegrationServices", name = "ShippingDataDetailVO")
    public JAXBElement<ShippingDataDetailVO> createShippingDataDetailVO(ShippingDataDetailVO value) {
        return new JAXBElement<ShippingDataDetailVO>(_ShippingDataDetailVO_QNAME, ShippingDataDetailVO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListInvDocumentByCustIdV2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://yurticikargo.com.tr/sswIntegrationServices", name = "listInvDocumentByCustIdV2Response")
    public JAXBElement<ListInvDocumentByCustIdV2Response> createListInvDocumentByCustIdV2Response(ListInvDocumentByCustIdV2Response value) {
        return new JAXBElement<ListInvDocumentByCustIdV2Response>(_ListInvDocumentByCustIdV2Response_QNAME, ListInvDocumentByCustIdV2Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListInvDocumentInterfaceByReferenceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://yurticikargo.com.tr/sswIntegrationServices", name = "listInvDocumentInterfaceByReferenceResponse")
    public JAXBElement<ListInvDocumentInterfaceByReferenceResponse> createListInvDocumentInterfaceByReferenceResponse(ListInvDocumentInterfaceByReferenceResponse value) {
        return new JAXBElement<ListInvDocumentInterfaceByReferenceResponse>(_ListInvDocumentInterfaceByReferenceResponse_QNAME, ListInvDocumentInterfaceByReferenceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocCargoField2VO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://yurticikargo.com.tr/sswIntegrationServices", name = "DocCargoField2VO")
    public JAXBElement<DocCargoField2VO> createDocCargoField2VO(DocCargoField2VO value) {
        return new JAXBElement<DocCargoField2VO>(_DocCargoField2VO_QNAME, DocCargoField2VO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShippingDataV3DetailVO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://yurticikargo.com.tr/sswIntegrationServices", name = "ShippingDataV3DetailVO")
    public JAXBElement<ShippingDataV3DetailVO> createShippingDataV3DetailVO(ShippingDataV3DetailVO value) {
        return new JAXBElement<ShippingDataV3DetailVO>(_ShippingDataV3DetailVO_QNAME, ShippingDataV3DetailVO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListInvDocumentByCustIdV2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://yurticikargo.com.tr/sswIntegrationServices", name = "listInvDocumentByCustIdV2")
    public JAXBElement<ListInvDocumentByCustIdV2> createListInvDocumentByCustIdV2(ListInvDocumentByCustIdV2 value) {
        return new JAXBElement<ListInvDocumentByCustIdV2>(_ListInvDocumentByCustIdV2_QNAME, ListInvDocumentByCustIdV2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListInvDocumentByGrpSpecialFieldResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://yurticikargo.com.tr/sswIntegrationServices", name = "listInvDocumentByGrpSpecialFieldResponse")
    public JAXBElement<ListInvDocumentByGrpSpecialFieldResponse> createListInvDocumentByGrpSpecialFieldResponse(ListInvDocumentByGrpSpecialFieldResponse value) {
        return new JAXBElement<ListInvDocumentByGrpSpecialFieldResponse>(_ListInvDocumentByGrpSpecialFieldResponse_QNAME, ListInvDocumentByGrpSpecialFieldResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListInvDocumentInterfaceByReference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://yurticikargo.com.tr/sswIntegrationServices", name = "listInvDocumentInterfaceByReference")
    public JAXBElement<ListInvDocumentInterfaceByReference> createListInvDocumentInterfaceByReference(ListInvDocumentInterfaceByReference value) {
        return new JAXBElement<ListInvDocumentInterfaceByReference>(_ListInvDocumentInterfaceByReference_QNAME, ListInvDocumentInterfaceByReference.class, null, value);
    }

}
