package com.training.day6;

public interface Polygon {
    public void getarea();
    default void getSizes()
    {
        System.out.println("sides of com.training.day6.Polygon");
    }
}
