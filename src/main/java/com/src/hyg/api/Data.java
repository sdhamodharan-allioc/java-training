package com.src.hyg.api;

public class Data {
    public static void main(String[] args) {
        String str1 = "A";
        str1 = str1.concat("B");
        String str2 = "C";
        str1 = str1.concat(str2);
        str1.replace('C', 'D');
        str1 = str1.concat(str2);
        System.out.println(str1);
    }
}
