
public class Method_Overloading
{
    double figure(double l, double b)
    {
        return (l*b);
    }
    int  figure(int b, int h)
    {
        return ((b*h)/2);
    }
    String figure(String s1,String s2)
    {
        return(s1 + s2);
    }
    public static void main(String[] args)
    {
        Method_Overloading obj = new Method_Overloading();
        System.out.println("Area of Rectangle: " +obj.figure(5.55, 6.78));
        System.out.println("Area of Right Triangle: " +obj.figure(3,5));
        System.out.println("Concadination of Strings: " +obj.figure("Yaazhini",  "Supraja"));
    }
}
