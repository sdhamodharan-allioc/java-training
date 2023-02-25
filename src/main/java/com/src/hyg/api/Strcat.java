package com.src.hyg.api;




public class Strcat{
    public static void main(String args[])
    {
        String name = "savi";
        String name1 = "Dhamo";
     //   System.out.println("name=" + name + name1);
        System.out.println("legth=" +name.length());
        System.out.println("string concadination=" +name.concat(name1));
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.indexOf("sav"));
        sum();
        aaf();
        cast();
        loop();
    }
    public static void sum()
    {
        int x, y, z;
        x = 10;
        y = 20;
        z = x + y;
        System.out.println("sum=" + z);
    }


    public static void  aaf() {
        char myvar = 65;
        float val = 2.33f;
        System.out.println(myvar);
        System.out.println(val);
    }

public static void cast()
{

    int myInt = 9;
    double myDouble = myInt;
    System.out.println(myInt);
    System.out.println(myDouble);

    double myDouble1 = 9.78d;
    int myInt1 = (int) myDouble1; // Manual casting: double to int
    System.out.println(myDouble1);   // Outputs 9.78
    myInt1 = (int) myDouble1; // Manual casting: double to int
    System.out.println(myInt1);

}

public static void loop()
{

    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    for (String i : cars) {
        System.out.println(i);
    }
}


}

