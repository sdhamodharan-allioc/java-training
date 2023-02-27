package com.sample.second;

import com.training.day5.DieselEngine;
import com.training.day5.IEngine;
import com.training.day5.PetrolEngine;

public class TestImport {

    public static void main(String args[]){
        IEngine petrolEngine = new PetrolEngine("Honda CRV");
        IEngine dieselEngine = new DieselEngine("Swift Dzire");
        petrolEngine.move();
        dieselEngine.move();
    }
}
