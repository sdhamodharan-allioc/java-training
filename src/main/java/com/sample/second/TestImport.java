package com.sample.second;

import com.sample.interfaces.DieselEngine;
import com.sample.interfaces.IEngine;
import com.sample.interfaces.PetrolEngine;

public class TestImport {

    public static void main(String args[]){
        IEngine petrolEngine = new PetrolEngine("Honda CRV");
        IEngine dieselEngine = new DieselEngine("Swift Dzire");
        petrolEngine.move();
        dieselEngine.move();
    }
}
