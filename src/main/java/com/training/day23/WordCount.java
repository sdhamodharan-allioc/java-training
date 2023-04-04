package com.training.day23;

import org.checkerframework.checker.units.qual.C;

import java.util.HashMap;

public class WordCount {
    int count;
public void increment()
    {
        count++;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return ", WordCount{" +
                "count=" + count +
                '}';
    }
}
