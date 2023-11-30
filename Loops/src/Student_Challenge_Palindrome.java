import java.util.Scanner;

public class Student_Challenge_Palindrome {
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = scan.nextInt();


        //Reverse a Number
//        int reverse = 0;
//        while (n > 0){
//            int r = n % 10;
//            reverse = reverse * 10 + r;
//            n = n / 10;
//        }
//        System.out.println(reverse);

        //Check if the Number is Palindrome
        //[if the reverse of a number is same the number before revsering it is palindrome] Ex- 12321 == 12321(Reversed)

        int reverse = 0;
        int prevNum = n;
        while (n > 0)
        {
            int r = n % 10;
            reverse = reverse * 10 + r;
            n = n / 10;
        }
        if (reverse == prevNum)
        {
            System.out.println("Number is Palindrome");
        } else
        {
            System.out.println("Number is not palindrome");
        }


    }
}
