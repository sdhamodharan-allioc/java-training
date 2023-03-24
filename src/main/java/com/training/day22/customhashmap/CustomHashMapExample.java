package com.training.day22.customhashmap;

import java.util.HashMap;
import java.util.Map;


public class CustomHashMapExample {
    public static void main(String[] args) {
        Map<Student,String > map = new HashMap<>();
        map.put(new Student(105, "Babu"), "First");
        map.put(new Student(203,"Mani"),"Second");
        map.put(new Student(307,"Anand"),"Third");
        map.put(new Student(405,"Naveen"),"Fourth");
        map.put(new Student(507,"Tharun"),"Fifth");

        System.out.println("output :"+map);
        for( Map.Entry<Student, String>  entry: map.entrySet()) {
            System.out.println("Key:   "+entry.getKey()+"    Value:    "+entry.getValue());
        }

    }
}
