package com.kgteknoloji.cargo.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tr.com.yurticikargo.shippingorderdispatcherservices.ShippingOrderDispatcherServices;
import tr.com.yurticikargo.sswintegrationservices.WsReportWithReferenceServices;

@Configuration
public class ServiceConfig {

    @Bean
    @Qualifier("shippingOrderDispatcherServices")
    public ShippingOrderDispatcherServices shippingOrderDispatcherServices() {
        tr.com.yurticikargo.shippingorderdispatcherservices.KOPSWebServices ws = new tr.com.yurticikargo.shippingorderdispatcherservices.KOPSWebServices();
        ShippingOrderDispatcherServices services = ws.getShippingOrderDispatcherServicesPort();
        return services;
    }

    @Bean
    @Qualifier("sswIntegrationServices")
    public WsReportWithReferenceServices sswIntegrationServices() {
        tr.com.yurticikargo.sswintegrationservices.KOPSWebServices ws = new tr.com.yurticikargo.sswintegrationservices.KOPSWebServices();
        WsReportWithReferenceServices services = ws.getWsReportWithReferenceServicesPort();
        return services;
    }


}
