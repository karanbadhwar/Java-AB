import java.util.Scanner;

public class Student_Challenge_Find_PrimeNumber {
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);

        //Find if a Number is Prime Number
        //---------------------------------------
//        System.out.println("Please Enter a Number to check if it is Prime or not");
//        int x = scan.nextInt();
//
//        if(isPrime(x))
//            System.out.println(x +" is a Prime Number");
//        else
//            System.out.println(x +" is not a Prime Number");


        //Find GCD(Greater Common Divisor) of 2 Numbers
        //--------------------------------------

//        System.out.println("Please Enter Two Numbers to get There GCD");
//        System.out.println("Enter the First Number");
//        int x = scan.nextInt();
//        System.out.println("Enter the Second Number");
//        int y =scan.nextInt();
//
//        int gcd = GCD(x,y);
//        System.out.println("Greater Common Divisor (GCD): "+gcd);



        //Find the maximum/ Greatest element in an Array
        //--------------------------------------

//        int A[] = {3,5,7,9,11,99,13};
//
//        System.out.println("The Greatest Element from An Array A is: "+ max(A));




    }

    //Method for Finding if a number is Prime
    //-------------------------------------------
    static boolean isPrime(int x)
    {
        for (int i = 2; i <= x/2; i++)
        {
            if(x % i == 0)
                return false;

        }
        return true;
    }


    //Method The GCD(Greater Common Divisor) of 2 Numbers
    //-------------------------------------------
    static int GCD(int m, int n)
    {
        while (m != n)
        {
            if(m > n)
                m = m - n;
            else
                n = n - m;
        }
        return m;
    }


    //Method To Find the maximum/ Greatest element in an Array
    //-------------------------------------------

    static int max(int A[])
    {
        int maxNum = A[0];
        for(int i = 0; i < A.length; i++)
        {
            if (A[i] > maxNum)
                maxNum = A[i];
        }
        return maxNum;
    }



}
