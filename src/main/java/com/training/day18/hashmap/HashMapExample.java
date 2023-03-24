package com.training.day18.hashmap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Carrot");
        map.put(2, "Beans");
        map.put(3, "Brinjal");
        map.put(4, "Tomato");
        map.put(5, "Onion");
        System.out.println("List of Vegetables");
        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + " . " + entry.getValue());
        }
        Iterator<Integer> vegItereator = map.keySet().iterator();
        System.out.println("output");
        while (vegItereator.hasNext())
        {
            Integer vegid = vegItereator.next();
            String vegvalue = map.get(vegid);
            System.out.println( + vegid      + vegvalue );
        }
    }
}
