package com.sample.savienum;
import java.util.ArrayList;
import java.util.Collections;

public class ArrList {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("crv");
        cars.set(0, "suburu");
        Collections.sort(cars);

        for (String i : cars) {
            System.out.println(i);
        }

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(49);
        numbers.add(34);
        numbers.add(56);
        numbers.add(10);
        numbers.add(78);
        Collections.sort(numbers);
      /*  for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }*/
        for (int j : numbers) {
             System.out.println(j);
           }
       }
    }