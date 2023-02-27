package com.training.day4;

public class AbsExample {
    public static void main(String args[])
    {
        Tea t = new Tea();
        Coffee c = new Coffee();
        t.addmilk();;
        t.addIngredient();
        c.addmilk();
        c.addIngredient();
    }
}
