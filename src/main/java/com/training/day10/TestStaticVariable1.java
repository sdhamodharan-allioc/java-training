package com.training.day10;

 class StaticEmployee
  {
    int empno;//instance variable
    String empname;
    static String company = "Hyundai";//static variable

    //constructor
    StaticEmployee(int r, String n)
    {
        empno = r;
        empname = n;
    }
    // changing static variable thro static method
     static void Change()
  {
        company = "Maruti";
  }

    //method to display the values
    void display()
    {
        System.out.println(empno + " " + empname + " " + company);
     }
}
    //Test class to show the values of objects
    public class TestStaticVariable1{
        public static void main(String args[]){
            StaticEmployee.Change(); // calling change method
            StaticEmployee s1 = new StaticEmployee(100,"Meena");
            StaticEmployee s2 = new StaticEmployee(200,"Veena");
            StaticEmployee s3 = new StaticEmployee(300,"sona");
            // calling display method
            s1.display();
            s2.display();
            s3.display();
        }
    }

