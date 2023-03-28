package com.training.day23.collections.exercise.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class ColorsTreeSet {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add("Blue");
        treeSet.add("Red");
        treeSet.add("Orange");
        treeSet.add("Green");
        treeSet.add("Pink");
        System.out.println("Tree set:" + treeSet);
        System.out.println("Contains:" + treeSet.contains("Blue"));
        System.out.println("First Element:" +treeSet.first());
        System.out.println("Last Element:" +treeSet.last());
        System.out.println("Removing a Particular element:" +treeSet.remove("Orange"));

        Iterator itr = treeSet.iterator();
        while (itr.hasNext()) {
            System.out.println(" " + itr.next());

        }

        TreeSet<String> treeSet1 = new TreeSet<String>();
        treeSet1.add("violet");
        treeSet1.add("Rose");
        treeSet1.add("Black");
        treeSet1.add("Yellow");
        treeSet1.add("Brown");
        System.out.println("TreeSet1:"+treeSet1);
      //  System.out.println("Comparison:" +treeSet1.contains(treeSet));
        System.out.println("Removing Last Element:" +treeSet1.pollFirst());
        System.out.println("Removing Last Element:" +treeSet1.pollLast());

        TreeSet<String> treeSet2 = (TreeSet<String>)treeSet1.clone();
        System.out.println("Clone TreeSet:" +treeSet2);
        Iterator itr2 = treeSet1.descendingIterator();
        while (itr.hasNext()) {
            System.out.println("Reverse Order: " + itr2.next());
        }
    }
}