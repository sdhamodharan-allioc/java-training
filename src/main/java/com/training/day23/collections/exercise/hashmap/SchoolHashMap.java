package com.training.day23.collections.exercise.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SchoolHashMap {
    public static void main(String[] args) {
        HashMap<Integer,String> schoolhashmap = new HashMap<>();
        schoolhashmap.put(1,"Tripp Elementary");
        schoolhashmap.put(2,"Meridian");
        schoolhashmap.put(3,"Galvin Middle");
        schoolhashmap.put(4,"Burlie Manner");
        schoolhashmap.put(5,"Marriots Ridge");
        Set set = schoolhashmap.entrySet();
        System.out.println("Set values: " + set);
        System.out.println("Key values:" +schoolhashmap.keySet());
        System.out.println(" Get Value:" +schoolhashmap.get(2));
        System.out.println("Contains:" +schoolhashmap.containsKey(1));

        HashMap<Integer,String> schoolhashmap1 = (HashMap)schoolhashmap.clone();
        System.out.println("Clone:" +schoolhashmap1.clone());
        schoolhashmap1.clear();
        System.out.println("Clear:" +schoolhashmap1);
        System.out.println("Is Empty:" +schoolhashmap1.isEmpty());

        System.out.println("List of Schools");
        for (Map.Entry entry : schoolhashmap.entrySet()) {
            System.out.println(entry.getKey() + " . " + entry.getValue());
        }
        System.out.println("Size:" +schoolhashmap.size());

        HashMap<Integer,String> schoolhashmap2 = new HashMap<>();
        schoolhashmap2.put(6,"Luce Elementary");
        schoolhashmap2.put(7,"Patricks");
        schoolhashmap2.put(8,"Canton public");
        schoolhashmap2.put(9,"Centennial");
        schoolhashmap2.put(10,"Waterloo");
        schoolhashmap2.putAll(schoolhashmap);
        System.out.println("combined:" +schoolhashmap2);
        System.out.println("Collections:" +schoolhashmap2.values());
    }
}
