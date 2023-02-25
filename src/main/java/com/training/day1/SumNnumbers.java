package com.training.day1;

import java.util.Scanner;
public class SumNnumbers
{
    public static void main(String[] args)
    {
        int i,sum =0;
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Number");
        int  num  =  myObj.nextInt();
   //     System.out.println("Input:",system.in);
        for( i=1 ; i<=num; i++)
        {
            sum = sum + i;
        }
         System.out.println("sum:" +sum);

    }
}
