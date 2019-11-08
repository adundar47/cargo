package com.kgteknoloji.cargo.modal;

public enum CargoCompanyType {
    ArasKargo("ArasKargo"), YurticiKargo("YurticiKargo"), MngKargo("MngKargo"), SuratKargo("SuratKargo"), PttKargo("PttKargo");

    private final String type;

    private CargoCompanyType(final String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }

    public static CargoCompanyType fromString(String text) {
        if (text != null) {
            for (CargoCompanyType eventType : CargoCompanyType.values()) {
                if (text.equals(eventType.type)) {
                    return eventType;
                }
            }
        }
        return null;
    }
}