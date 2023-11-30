import java.util.Scanner;

public class Student_Challenge_DisplayNumInWords {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();
        String reverse = "";
        //Display a number in String words even with tailing 0

        while(num > 0)
        {
            int r = num % 10;
            reverse = reverse + r;
            num = num/10;
        }
        for(int i = reverse.length()-1; i >= 0; i--)
        {
            char c = reverse.charAt(i);

            switch (c)
            {
                case '0': System.out.print("Zero");
                    break;

                case '1': System.out.print("One");
                    break;

                case '2': System.out.print("Two");
                    break;

                case '3': System.out.print("Three");
                break;

                case '4': System.out.print("Four");
                break;

                case '5': System.out.print("Five");
                break;

                case '6': System.out.print("Six");
                break;

                case '7': System.out.print("Seven");
                break;

                case '8': System.out.print("Eight");
                break;

                case '9': System.out.print("Nine");
                break;

                default: System.out.println("Invalid Digit");
                break;

            }
        }
    }
}
