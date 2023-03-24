package com.training.day14.string;

import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
        String str = "Meena";
        String str1 = "Meena Manju";

        System.out.println("Input String: "  +str);
        String strnew = str.replace("M","V");
        System.out.println("Replaced String:" +strnew);
        System.out.println("Input String: "  +str1);
        String strnew1 = str1.replace(" ","");
        System.out.println("Replaced String:" +strnew1);
    }
}
