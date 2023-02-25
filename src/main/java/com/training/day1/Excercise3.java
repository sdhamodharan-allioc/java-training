package com.training.day1;

public class Excercise3 {
    public static void main(String[] args) {
        int i,j,n,k;
        n=5;
        for(i=1;i<=n;i++) {
            for (j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for(k=1;k<=i;k++) {
                System.out.print("* ");

               }
            System.out.println();
        }

        }

}
