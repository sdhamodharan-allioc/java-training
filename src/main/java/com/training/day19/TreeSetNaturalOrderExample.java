package com.training.day19;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetNaturalOrderExample {

    public static void main(String[] args) {

        /**
         * TreeSet() default constructor will consider Comparator as null.
         * and it follows natural order of the elements.
         */
        Set<Integer> setObj = new TreeSet<Integer>();
        setObj.add(10);
        setObj.add(5);
        setObj.add(1);
        setObj.add(4);
        setObj.add(8);
        setObj.add(6);
        setObj.add(10);

        System.out.println("Treeset elements ::  "+setObj);
        /** OUTPUT::
         * Treeset elements ::  [1, 4, 5, 6, 8, 10]
         *
         *  We can notice that,
         *  1. duplicate element 10 not added.
         *  2. Elements are sorted in ascending order.
         *  3. if elements are strings then it follows alphabetical order.
         *
         */

        Set<Integer> setCustomSortObj = new TreeSet<Integer>(new ReverseOrderComparator());
        setCustomSortObj.add(10);
        setCustomSortObj.add(5);
        setCustomSortObj.add(1);
        setCustomSortObj.add(4);
        setCustomSortObj.add(8);
        setCustomSortObj.add(6);
        setCustomSortObj.add(10);

        System.out.println("Treeset setCustomSortObj  elements ::  "+setCustomSortObj);


    }

}
