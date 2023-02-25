package com.sample.maps;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        Map<String, String> stateCityMap = new HashMap<>();
        stateCityMap.put("TN", "Chennai");
        stateCityMap.put("AP", "Hyderabad");
        stateCityMap.put("KL", "Trivandrum");

        System.out.println(stateCityMap);


    }
}
