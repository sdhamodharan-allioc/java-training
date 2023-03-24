package com.training.day14.string;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.next() ;
        String str2 =  scanner.next();

        if(str1.length() == str2.length())
        {
            char[] charArray1 = str1.toUpperCase().toCharArray();
             char[] charArray2 = str2.toUpperCase().toCharArray();
             Arrays.sort(charArray1);
             Arrays.sort(charArray2);
             boolean result = Arrays.equals(charArray1,charArray2);
              if (result)
                  System.out.println("Anagram");
              else
                  System.out.println("Not an Anagram") ;


        }else{
            System.out.println("Not an Anagram");
        }
    }
}
