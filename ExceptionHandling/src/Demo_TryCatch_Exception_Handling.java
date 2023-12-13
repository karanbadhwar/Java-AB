import java.util.Scanner;

public class Demo_TryCatch_Exception_Handling {
    public static void main(String[] args) {
        int a , b , c;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 Numbers");
        a = scan.nextInt();
        b = scan.nextInt();
        try
        {
            c = a / b;
            System.out.println("Division is: "+c); // This will not run if there is an Error
        }
        catch(ArithmeticException error)
        {
            System.out.println("Denominator should not be 0, try again: "+ error);
        }

        System.out.println("Bye, Program End");


    }
}
