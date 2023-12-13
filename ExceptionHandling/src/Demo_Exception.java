public class Demo_Exception {
    public static void main(String[] args)
    {
        int a = 10, b = 0, c;

        c = a / b;

        System.out.println(c);
        //Error
        //Exception in thread "main" java.lang.ArithmeticException: / by zero at Demo_Try_Catch.main(Demo_Try_Catch.java:6)

        System.out.println("Bye"); // It will not run, as program will crash
    }
}
