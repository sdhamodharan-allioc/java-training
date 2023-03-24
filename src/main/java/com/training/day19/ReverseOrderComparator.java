package com.training.day19;

import java.util.Comparator;

public class ReverseOrderComparator implements Comparator<Integer>{

    /**
     * override the compare(obj1, obj2) method of the Comparator interface.
     * return the different values on comparison.
     */
    @Override
    public int compare(Integer x, Integer y) {
        return (x > y) ? -1 : ((x == y) ? 0 : 1);
    }
}
