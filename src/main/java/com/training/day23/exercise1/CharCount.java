package com.training.day23.exercise1;

public class CharCount {
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
        return "CharCount{" +
                "count=" + count +
                '}';
    }
}
