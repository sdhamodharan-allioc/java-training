package com.sample.interfaces;

public class DieselEngine extends Engine{

    public DieselEngine(String name) {
        super(name);
    }

    public void move()
    {
        rotateWheels();
        System.out.println("move the Diesel vehicle");
    }
}
