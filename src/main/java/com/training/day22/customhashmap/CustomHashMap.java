package com.training.day22.customhashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class CustomHashMap {

    public static void main(String[] args) {
        Map<MyElement, String> mapObject = new HashMap<MyElement, String>();
        mapObject.put(new MyElement(12), "Rama");
        mapObject.put(new MyElement(25), "Krishna");
        mapObject.put(new MyElement(82), "Siva");
        mapObject.put(new MyElement(92), "Veena");
        mapObject.put(new MyElement(82), "Radha");

        System.out.println("mapObject ::"+mapObject);


        // iterate HashMap

        for( Map.Entry<MyElement, String>  entry: mapObject.entrySet()) {
            System.out.println("Key:   "+entry.getKey()+"    Value:    "+entry.getValue());
        }

        // traditional way of iteration
        /**
         * Step 1.  Get the all keys from HashMap as a Set using keySet();
         * Step 2.  iterate this keySet using JDK5 foreach-loop
         * Step 3.  On each iteration, pass the key to HashMap
         *          using get(key) method, which returns the value associated with that key.
         */

        Set<MyElement> keySetElements = mapObject.keySet();

        for (MyElement element : keySetElements) {

            String elementValue = mapObject.get(element);
            System.out.println("element:   " + element + "    elementValue:  " + elementValue);
        }

        System.out.println("mapObject.values()  :: "+mapObject.values() );

        if(mapObject.containsKey(new MyElement(25))) {
            mapObject.put(new MyElement(85), "new Born element");
        }
        System.out.println("mapObject  :: "+mapObject);

        /**
         * hshcode val : 5
         * equals method : comparing data : 25  : and other element data : 25
         * hshcode val : 5
         * equals method : comparing data : 85  : and other element data : 25
         * mapObject  :: {MyElement [data=12]=Rama, MyElement [data=82]=Radha, MyElement [data=92]=Veena, MyElement [data=25]=Krishna, MyElement [data=85]=new Born element}

         */

    }

}

class MyElement{

    private int data;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public MyElement(int data) {
        super();
        this.data = data;
    }

    @Override
    public String toString() {
        return "MyElement [data=" + data + "]";
    }

    @Override
    public int hashCode() {
        int val = data % 10;
        System.out.println("hshcode val : "+val);
        return val;   // 15 - hashval -5, 25 - 5
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        MyElement other = (MyElement) obj;
        System.out.println("equals method : comparing data : "+data+"  : and other element data : "+other.data);
        if (data != other.data)
            return false;
        return true;
    }



}
