package com.sample.fileoperation;

import java.util.Set;
import java.util.TreeSet;

public enum FIELD {
        KEY_ID("Key ID :", 1),
        USER("User :", 2),
        DESC("Description :", 3),
        KEY_TYPE("Key Type :", 4),
        KEY_SIZE("Key Size :", 5),
        EXP_DATE("Expiration Date :", 6);

    public  String key;
    public  int order;

    FIELD(String key, int order) {
            this.key = key;
            this.order = order;
    }

}
