package com.src.hyg.api;

import java.net.InterfaceAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String arg[])
    {
        System.out.println("hello");
        for(int i=1;i<=10;i++)
            System.out.println("i="+i);

        //Interface = new Implementation()
        // List - Interface
        // ArrayList - Implementation

        List<String> namesList = new ArrayList<>();
        namesList.add("savithri");
        namesList.add("pandurangan");
        namesList.add("yaazhini");

        for(String name: namesList) {
            System.out.println("name=" +name);
        }

        // Map
      //  Map<Integer,String> studentMap









    }

}
