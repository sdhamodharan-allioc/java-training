package com.training.day6;

public class Factorial {
    public static void main(String[] args) {
        int i,n,fact;
        fact=1;
        n=5;
        for(i=1;i<=n;i++)
        {
            fact = fact * i;
        }
        System.out.println("com.training.day6.Factorial of "+ n +" is :" + fact);
    }
}
