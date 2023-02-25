package com.sample.interfaces;

import java.util.ArrayList;
import java.util.List;

public class TestEngine {
    public static void main(String args[])
    {
        IEngine dieeng = new DieselEngine("Diesel");
                dieeng.move();

        IEngine peteng = new PetrolEngine("Petrol");
                peteng.move();

        System.out.println("call a method and move")  ;

        drawIEngine(dieeng);
        drawIEngine(peteng);

        List<IEngine> enginelist = new ArrayList<>();
        enginelist.add(dieeng);
        enginelist.add(peteng);

        System.out.println("using loop");
        for (IEngine eachengine:enginelist)
        {
            eachengine.move();

        }
    }

public static void drawIEngine(IEngine  engineobject)
{
    engineobject.move();
}
}


