package com.sample.interfaces;

public class PetrolEngine extends Engine{

    public PetrolEngine(String name) {
        super(name);
    }

    public void move() {
        rotateWheels();
        System.out.println("Move petrol vehicle");
    }
}
