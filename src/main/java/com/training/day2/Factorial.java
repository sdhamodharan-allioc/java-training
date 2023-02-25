package com.training.day2;

public class Factorial {
    public static void main(String[] args) {
            int  result;
            result = fact(5);
            System.out.println(result);
        }
            public static int fact ( int n)
            {
                if (n == 0 || n == 1) {
                    return 1;
                }
                else {
                    return n = n * fact(n - 1);
                }
            }
    }
