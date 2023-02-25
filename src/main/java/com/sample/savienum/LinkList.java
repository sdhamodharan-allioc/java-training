package com.sample.savienum;

import java.util.LinkedList;

public class LinkList {
    public static void main(String args[])
    {
        LinkedList<String>  cars  =  new  LinkedList<String>();
        cars.add("ford");
        cars.add("oddssey");
        cars.add("crv");
        cars.add("Benz");
        cars.addFirst("kia");
        cars.addLast("accord");
        cars.removeFirst();
        cars.removeLast();
        for ( String i : cars)
        {
            System.out.println(i);
        }

        System.out.println(cars.getFirst());
        System.out.println(cars.getLast());
    }
}
