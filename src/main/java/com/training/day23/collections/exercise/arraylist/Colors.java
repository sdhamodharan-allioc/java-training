package com.training.day23.collections.exercise.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Colors {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Yellow");
        list.add("Green");
        list.add("orange");
        list.add("white onion");
        list.add("Blue");
        list.add("purple");
        System.out.println("output:");
        for(int i=0;i<list.size();i++)
        System.out.println(list.get(i));
        Collections.swap(list,0,1);
        System.out.println("swapping:" +list);

        List<String> list1 = new ArrayList<String>();
        list1.add("Pumkin");
        list1.add("Beans");
        list1.add("Squash");
        list1.add("white onion");
        list1.add("Brinjal");
        list1.add("Tomato");
        ((ArrayList<String>) list1).ensureCapacity(2);
        System.out.println("Veggies List1:" +list1);
        System.out.println("compare both are equal:"+list.equals(list1));

        List<String> list2 = new ArrayList<String>();
        list2.addAll(list);
        list2.addAll(list1);
        System.out.println("Added Values in List:" +list2);
        List<String> list3 = new ArrayList<String>();
       ((ArrayList<String>) list).clone();
        System.out.println("After cloning:"+list3);

        list.set(0,"Red");
        list.set(5,"Violet");

        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println("Ater Reverse List:" +list);

        System.out.println("colours List:" + list);
        Collections.copy(list,list1);
        System.out.println("After copy:" +list);

        Collections.shuffle(list1);
        System.out.println("After shuffling" +list1);
        List<String> Sublist = list1.subList(0,1);
        System.out.println("After Sublist:" +Sublist);

        list.remove(3);
        System.out.println(list.get(2));

        if(list.contains("Red"))
        {
            System.out.println("Red is Present");
        }
        else {
            System.out.println("Red is not Present");
        }
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println("  " + itr.next());
        }
    }
}