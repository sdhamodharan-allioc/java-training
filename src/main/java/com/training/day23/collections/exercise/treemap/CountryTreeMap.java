package com.training.day23.collections.exercise.treemap;

import java.util.*;

public class CountryTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> treemap;
        treemap = new TreeMap<Integer, String>(new SortKey());
        treemap.put(5, "India");
        treemap.put(2, "America");
        treemap.put(1, "Europe");
        treemap.put(4, "Russia");
        treemap.put(3, "Canada");
        System.out.println("TreeMap:" +treemap);
        System.out.println("Greatest key associate with value:" +treemap.floorEntry(5));
        System.out.println("Least key associate with value:" +treemap.floorEntry(1));
        System.out.println("First Key and Last Key:" +treemap.firstKey() +" " +treemap.lastKey());
        System.out.println("Least Key and Greatest Key:" +treemap.firstEntry()  +" " +treemap.lastEntry());
        System.out.println("Navigable Keys:" +treemap.navigableKeySet());
        System.out.println("Contains Key:" +treemap.containsKey(2));
        System.out.println("Contains Value:" +treemap.containsValue("India"));
        System.out.println("Key Values:" +treemap.keySet());
        System.out.println("Reversing Key Values:" +treemap.descendingKeySet());
        System.out.println("Greatest key:" +treemap.floorKey(5));
        System.out.println("Least Key:" +treemap.floorKey(1));
        System.out.println("Get Less than or equal  Key Value:" +treemap.headMap(1,true));
        System.out.println("Get Less than Key Value:" +treemap.headMap(4));
        System.out.println("Get higher than Key Value:" +treemap.higherEntry(3));
        System.out.println("Get higher than Key Value:" +treemap.higherEntry(5));
        System.out.println("Before Poll:" +treemap);
        System.out.println("Remove and get a key-value mapping associated with the least key :" +treemap.pollFirstEntry());
        System.out.println("After Poll:" +treemap);
        System.out.println("Remove and get a key-value mapping associated with the greatest key :" +treemap.pollLastEntry());
        System.out.println("After Poll:" +treemap);
        System.out.println("Sub Key Values:" +treemap.subMap(2,true,3,true));
        System.out.println("Greater than the key values:" +treemap.tailMap(2,false));
        System.out.println("Ceiling Entry:" +treemap.ceilingEntry(2));
        System.out.println("Ceiling Entry:" +treemap.ceilingEntry(5));
        System.out.println("Ceiling Key:" +treemap.ceilingKey(2));
        for (Map.Entry<Integer, String> entry : treemap.entrySet()) {
            System.out.println(entry.getKey() + "." + entry.getValue());
        }
        TreeMap<Integer, String> treemap1 = (TreeMap)treemap.clone();
        System.out.println("Clone:" +treemap1);
        treemap1.clear();
        System.out.println("source" +treemap);
        System.out.println("Destn :" +treemap1);

    }
}

