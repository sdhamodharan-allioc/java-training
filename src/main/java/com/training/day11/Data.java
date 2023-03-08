package com.training.day11;

public class Data {
    //no-args constructor
    public Data()
    {
        System.out.println("No-Args Constructor");
    }
    private String name;

    public Data(String n) {
        System.out.println("Parameterized Constructor");
        this.name = n;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args)
    {
            Data d = new Data();
            System.out.println(d.getName());
            Data d1 = new Data("Java");
            System.out.println(d1.getName());
     }
}