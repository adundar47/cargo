package com.kgteknoloji.cargo.modal;

public enum ShipmentStatus {
    DELIVERED("DELIVERED"), CANCELLED("CANCELLED"), DISTRIBUTION("DISTRIBUTION");

    private final String type;

    private ShipmentStatus(final String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }

    public static ShipmentStatus fromString(String text) {
        if (text != null) {
            for (ShipmentStatus eventType : ShipmentStatus.values()) {
                if (text.equals(eventType.type)) {
                    return eventType;
                }
            }
        }
        return null;
    }
}
