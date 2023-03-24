package com.sample.fileoperation;

public class FieldData {
    FIELD field;
    String value;

    public FieldData(FIELD field, String value) {

        this.field = field;
        this.value = value;
    }

    public FIELD getField() {
        return field;
    }

    public void setField(FIELD field) {
        this.field = field;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
