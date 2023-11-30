import java.util.Scanner;

public class Student_Challenge_Fibonacci {
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);

        //Display AP Series (Arithmetic Progression Series)

//        System.out.println("Program to print Ap Series");
//        System.out.println("Enter the Starting Point");
//        int starting = scan.nextInt();
//        System.out.println("Enter the Difference");
//        int diff = scan.nextInt();
//        System.out.println("How many numbers do you want in the series?");
//        int n = scan.nextInt();
//        int term = starting;
//        for(int i = 0; i <= n; i++){
//            System.out.print(term+", ");
//            term = term + diff;
//        }


        //Display GP Series (Geometric Progression Series)

//        System.out.println("Program to print GP Series");
//        System.out.println("Enter the Starting Point");
//        int starting = scan.nextInt();
//        System.out.println("Enter the Common Ratio");
//        int cRatio = scan.nextInt();
//        System.out.println("How many numbers do you want in the series?");
//        int n = scan.nextInt();
//        int term = starting;
//
//        for(int i = 0; i <=n; i++)
//        {
//            System.out.print(term+", ");
//            term = term * cRatio;
//        }


        //Fibonacci Series

        System.out.println("Program to print Fibonacci Series");
        System.out.println("Enter the Starting Point");
        int starting = scan.nextInt();
        System.out.println("Enter the Second Point");
        int second = scan.nextInt();
        System.out.println("How many numbers do you want in the series?");
        int n = scan.nextInt();
        int temp = 0;
        System.out.print(starting+", "+second+", ");
        for(int i = 0; i<=n-2; i++)
        {
            temp = starting + second;
            starting = second;
            second = temp;
            System.out.print(temp+", ");

        }


    }
}
