package com.kgteknoloji.cargo.utils;

import com.kgteknoloji.cargo.modal.ShipmentStatus;
import tr.com.yurticikargo.sswintegrationservices.ShippingDataDetailVO;

import java.text.MessageFormat;

public class Utils {

    public static final String ORDER_ID_ALREADY_EXIST = "Order id already exist. OrderId: ''{0}''";

    public static final String KEY = "TCELREF";

    public static final String ORDER_KEY = KEY + "{0}";

    public static final String OK = "OK";

    public static final long HOUR = 3600 * 1000;

    public static final String CUST_ID = "235993189";

    public static final String FIELD_NAME = "53";


    public static String getOrderIdAlreadyExistError(long orderId) {
        return MessageFormat.format(ORDER_ID_ALREADY_EXIST, orderId);
    }

    public static String getOrderKey(long orderId) {
        return MessageFormat.format(ORDER_KEY, orderId);
    }

    public static long getOrderId(String value) {
        return Integer.valueOf(value.substring(KEY.length()));
    }

    public static ShipmentStatus getType(ShippingDataDetailVO shippingDataDetailVO) {
        if (shippingDataDetailVO.getCargoEventId().equalsIgnoreCase(OK) && shippingDataDetailVO.getRejectFlag().equalsIgnoreCase("0")) {
            return ShipmentStatus.DELIVERED;
        } else if (shippingDataDetailVO.getCargoEventId().equalsIgnoreCase(OK) && shippingDataDetailVO.getRejectFlag().equalsIgnoreCase("1")) {
            return ShipmentStatus.CANCELLED;
        } else {
            return ShipmentStatus.DISTRIBUTION;
        }
    }
}
