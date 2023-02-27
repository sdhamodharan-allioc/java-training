package com.training.day5;

import java.util.ArrayList;
import java.util.List;

public class TestShape {
    public static void main(String args[]) {
        //Interface instanceName = new ClassName();
        Shape circle = new Circle();
        circle.draw();

        Shape rectangle = new Rectangle();
        rectangle.draw();

        Shape square = new Square();

        System.out.println("Call a method and draw");

        drawShape(circle);
        drawShape(rectangle);
        drawShape(square);
        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(circle);
        shapeList.add(rectangle);
        shapeList.add(square);

        System.out.println("Drawing using a loop.........");
        // Looping interfaces to draw a complex diagram
        for(Shape eachShape : shapeList){
            eachShape.draw();
        }
    }

    /**
     * Method parameter is Shape interface.
     * */
    public static void drawShape(Shape shapeObject){
        shapeObject.draw();
    }
}
