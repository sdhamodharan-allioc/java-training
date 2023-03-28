package com.training.day23.collections.exercise.treemap;

import java.util.Comparator;

public class SortKey implements Comparator<Integer> {
    @Override
    public int compare(Integer str1, Integer str2) {
        return (str1.compareTo(str2));
    }
}
