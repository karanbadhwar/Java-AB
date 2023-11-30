import java.util.Scanner;
public class Student_Challenge_Radix {
    public static void main(String[] args) {
        // Find Radix/Base of a number give in a String
        String num;
        Scanner sc = new Scanner(System.in);
//        System.out.println("Please Enter a number in any form ");
//        num = sc.nextLine();
//
//            if(num.matches("[10]+")){
//                System.out.println("Number is Binary, Radix/Base is 2");
//            } else if(num.matches("[0-7]+")) {
//                System.out.println("Number is Octal, Radix/Base is 8");
//            } else if(num.matches("[0-9]+")){
//                System.out.println("Number is Decimal, Radix/Base is 10");
//            }else if(num.matches("[0-9A-F]+")){
//                System.out.println("Number is Hexa, Radix/Base is 16");
//            }  else {
//                System.out.println("Invalid Number");
//            }

        // Find a given year, is a Leap year or not
        int year;
        System.out.println("Enter a year to check if it is a Leap Year or not");
        year = sc.nextInt();
        if (year % 4 == 0) {
            if(year %100 == 0){
             if(year %400 == 0){
                 System.out.println("Leap Year");
             }else {
                 System.out.println("Not a leap year");
             }
            } else {
                System.out.println("Leap Year");
            }
        } else {
            System.out.println("Not a leap Year");
        }
    }
}



