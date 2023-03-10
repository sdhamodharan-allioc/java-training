package com.training.day11;

    public class Data1 {

        private String name;
        private int id;

        //no-args constructor
        public Data1()
        {
            this.name = "Default Name";
        }
        //one parameter constructor
        public Data1(String n)
        {

            this.name = n;
        }
        //two parameter constructor
        public Data1(String n, int i)
        {
            this.name = n;
            this.id = i;
        }

        public String getName()
        {
            return name;
        }

        public int getId()
        {
            return id;
        }

        @Override
        public String toString()
        {
            return "ID="+id+", Name="+name;
        }
        public static void main(String[] args)
        {
            Data1 d1=new Data1();
            System.out.println(d1);

            d1 = new Data1("Java");
            System.out.println(d1);

            d1 = new Data1("savi",5);
            System.out.println(d1);

        }

    }
