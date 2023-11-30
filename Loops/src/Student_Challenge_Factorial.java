import java.util.Scanner;

public class Student_Challenge_Factorial {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        //Display Multiplication Table

//        System.out.format("Please Write a Number to get it's Table \n");
//        int n = scan.nextInt();
//
//        for(int i = 1; i <=10; i++)
//        {
//            System.out.format("%d * %d = %d\n", n, i, (n*i));
//        }

        //Find the Sum of n of Natural Numbers

//        System.out.println("Enter a Number to get its Sum");
//        int n = scan.nextInt();
//        int sum = 0;
//        for(int i = 1; i<=n; i++)
//        {
//            sum = sum + i;
//        }
//        System.out.format("Sum is: %d", sum);

        //Find the Factorial of a Number

        System.out.println("Enter a Number to get its Factorial");
        int n = scan.nextInt();
        long factorial = 1;
        if(n <= 0)
        {
             System.out.format("Please provide a number above Value 0");

        } else {
            for (int i = 1; i <= n; i++) {
                factorial = i * factorial;
            }
            System.out.format("Factorial of %d: %d\n", n, factorial);
        }
    }
}
