package com.training.day8;

public class MethodOverloading2 {

        static int add(int a, int b)
        {
            return a+b;
        }
        static double add(double a, double b)
        {
            return a+b;
        }
    }
    class TestOverloading2
    {
        public static void main(String[] args)
        {
            System.out.println(MethodOverloading2.add(17,13));
            System.out.println(MethodOverloading2.add(10.4,10.6));
        }
    }

