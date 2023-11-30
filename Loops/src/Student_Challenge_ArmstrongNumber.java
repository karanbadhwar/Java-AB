import java.util.Scanner;

public class Student_Challenge_ArmstrongNumber {
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = scan.nextInt();


        //Display Digits of a Number

//    while (n > 0){
//        int r = n % 10;
//        n = n / 10;
//
//        System.out.println(r);
//    }

        //Count Digits of a Number

//        int count = 0;
//        while(n>0)
//        {
//
//            count = count + 1;
//            n = n / 10;
//
//        }
//        System.out.println("Number of Digits: "+ count);

        //Finding if a Number is Armstrong or not
        //[Cubes of the digit added together, we get the total same as the Original Number ] = 153 = 1e3 + 5e3 + 3e3


//        int sum = 0;
//        int armCheck = n;
//        while (n >0)
//        {
//            int r = n % 10;
//            sum= sum + (r*r*r);
//            n = n /10;
//        }
//        if(sum == armCheck){
//            System.out.println("Number you have provided is Armstrong");
//        }else {
//            System.out.println("Number you have provided is not Armstrong ");
//        }

    }
}
