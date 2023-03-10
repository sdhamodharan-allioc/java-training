package com.training.day13;

public class StringMethodTest {

        public static void main(String[] args) {

            String s1 = "Hello World"; // String index starts from 0.
            // 012345678910
            System.out.println("s1.charAt(8) >>>>> "+s1.charAt(8));  // r

            System.out.println("s1.length() ::::: "+s1.length()); // 11

            //System.out.println("s1.concat( Example ) ::::: "+s1.concat(" Example "));

            //String s1 = "Hello World";
            s1 = s1.concat(" Example ");
            System.out.println(s1);

            //	System.out.println("s1.indexOf(4) ::::: "+s1.indexOf('x'));
            String str = "I am an Indian     ";

            String[] strArray = str.split(" ");

            System.out.println("strArray   >>>>   "+ strArray.length);

            for(int i =0; i< strArray.length; i++) {
                System.out.println(strArray[i]);
            }
            System.out.println("str.trim()"+str.trim());
        }

    }
