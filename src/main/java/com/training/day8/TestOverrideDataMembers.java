package com.training.day8;

public class TestOverrideDataMembers {
    public static void main(String[] args) {
        R r = new R();
        System.out.println("Value of R :"+r.i);
        r.display();

        S s = new S();
        System.out.println("Value of S:"+s.i);
        s.display();

        R o = new S();
        System.out.println("Value of R assigned by S :"+o.i);
        o.display();

    }
}

class R {
    public int i = 10;
    public void display() {
        System.out.println("R - Value of i : "+i);
    }
}

class S extends R {
    public int i = 100;

    @Override
    public void display() {
        System.out.println("S - Value of i :" + i);
    }
}
