package com.training.day10;



class Calculate {
    static int cube(int x) {
        return x * x * x;
    }
}
    public class StaticCalc
    {
    public static void main(String[] args)
    {
        int result=Calculate.cube(5);
        System.out.println(result);
    }
}

