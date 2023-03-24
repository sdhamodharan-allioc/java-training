package com.training.day19;
import java.util.*;
import java.util.Set;
import java.util.List;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        {
            Set<String> setElements = new HashSet<String>();

            setElements.add("Madhu");
            setElements.add("Aneetha");
            setElements.add("Bala");
            setElements.add("Veena");
            setElements.add("Sheela");
            setElements.add("Bala");
            setElements.add("Gaya");
            setElements.add("Menaka");
            setElements.add("Then");
            setElements.add("Krithika");
            setElements.add("Veena");

            System.out.println("setElements :: "+setElements);
            System.out.println("setElements  size(): "+setElements.size());
            for (String str : setElements)
            {
                System.out.print(" " + str);
            }
            Iterator itr = setElements.iterator();

            while (itr.hasNext()) {
                System.out.println(" " + itr.next());
            }
            System.out.println(" " +setElements.contains("Then"));

            System.out.println("setElements before sort: "+setElements);

            System.out.println("Sorting");
            List<String> listObj = new ArrayList<String>(setElements);
            System.out.println("List Before Sort : "+listObj);
            Collections.sort(listObj);
            System.out.println("List After Sort : "+listObj);
            System.out.println("setElements after sort :: "+setElements);

            System.out.println("TreeSet");
            Set<Integer> treeSetObj = new TreeSet(setElements);
            System.out.println("Treeset Object elements:: "+treeSetObj);

        }
    }
}
