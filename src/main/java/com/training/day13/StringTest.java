package com.training.day13;

public class StringTest {
        public static void main(String aregs[]) {
            String s1 = "Welcome";
            String s2 = new String("Hello");
            String s3 = "Welcome";
            String s4 = new String("Hello");
            String s5 = new String("Hello").intern();
            String s6 = "Hello";

            System.out.println("s1 == s3  "+(s1 == s3)); // True
            System.out.println("s2 == s4  "+(s2 == s4)); // False
            System.out.println("s2 == s5  "+(s2 == s5)); // False
            System.out.println("s1.equals(s3) "+s1.equals(s3)); // True
            System.out.println("s2.equals(s4)  "+s2.equals(s4)); // True
            System.out.println("s4.equals(s5)  "+s4.equals(s5)); // True
            System.out.println("s6 == s5  "+(s6 == s5)); // True

            /**
             *
             *
             * Heap Memory ->
             *
             * String constant pool ->
             *
             * String s1 = "Welcome" "Welcome" -> stringconstantpool s1 -> reference
             * variable -> stack
             *
             * String s2 = new String("Hello"); "Hello" -> stringconstantpool String Object
             * -> created in Heap memory s2 -> reference variable -> store in stack and
             * refers to heap memory object
             *
             */
        }
    }
