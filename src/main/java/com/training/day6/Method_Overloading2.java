
public class Method_Overloading2 {

        public static void main(String[] args)
        {
            System.out.println("Overloading from main 1");
        }
        public static void main(String arg1)
        {
            System.out.println("Hello, " + arg1 +" Overloading main 2");
        }
        public static void main(String arg1, String arg2)
        {
            System.out.println("Overloading main 3");
            System.out.println("Hi, " + arg1 + ", " + arg2);
        }
    }
