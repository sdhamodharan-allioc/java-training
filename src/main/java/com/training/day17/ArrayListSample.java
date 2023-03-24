package com.training.day17;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class ArrayListSample {
    public static void main(String[] args) {
        List<String> arrlist = new ArrayList<String>();
        arrlist.add("empno:100");
        arrlist.add("empname:Ramya");
        arrlist.add("salary:5000");
        arrlist.add("empno:200");
        arrlist.add("empname:Kavin");
        arrlist.add("salary:6000");
     //   arrlist.remove(2);
      //  arrlist.add("salary:5000");

    //    System.out.println("Array List:" + arrlist);
      //  for (int i = 0; i < arrlist.size(); i++) {
           // System.out.println("arrayList.get( "+i+" )  "+ arrlist.get(i));
       // }

        //Iterator
        Iterator itr = arrlist.iterator();
        while(itr.hasNext()) {
            System.out.println("  "+itr.next());
            //itr.remove();
//            arrlist.add(1,"300:Dhamo");
        }

     /*   //for each jdk1.5
        for(String element : arrlist) {
            System.out.println("element: "+element);
        }

        // stream jdk 8
        arrlist.stream().forEach(str -> {System.out.println("JAVA 8 :  "+str);});*/

    }
}