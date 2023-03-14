package com.training.day15.Cloning;

class Original {
    private String value;

    public String getValue() {
    }

class CopyOnWrite {
    private Original value;
    private boolean copied;

    public String getValue() {
        return this.value.getValue();
    }

    public String setValue(String newValue) {
        if (!copied) {
            this.value = deepCopy(this.value);
            copied = true;
        }
        this.value.setValue(newValue);
    }
}

