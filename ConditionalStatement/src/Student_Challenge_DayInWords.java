import java.util.Scanner;

public class Student_Challenge_DayInWords {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        //Display name of a day based on number

//        System.out.println("Please Enter Day Number");
//        int day = sc.nextInt();
//        switch (day)
//        {
//            case 1: System.out.println("Mon");
//            break;
//            case 2: System.out.println("Tue");
//                break;
//            case 3: System.out.println("Wed");
//                break;
//            case 4: System.out.println("Thu");
//                break;
//            case 5: System.out.println("Fri");
//                break;
//            case 6: System.out.println("Sat");
//                break;
//            case 7: System.out.println("Sun");
//                break;
//            default: System.out.println("Invalid Day");
//        }


        //Display name of the month based on Number
//        System.out.println("Please Enter Month Number");
//        int month = sc.nextInt();
//
//        switch (month)
//        {
//            case 1: System.out.println("Jan");
//            break;
//
//            case 2: System.out.println("Feb");
//            break;
//
//            case 3: System.out.println("Mar");
//            break;
//
//            case 4: System.out.println("Apr");
//            break;
//
//            case 5: System.out.println("May");
//            break;
//
//            case 6: System.out.println("Jun");
//            break;
//
//            case 7: System.out.println("Jul");
//            break;
//
//            case 8: System.out.println("Aug");
//            break;
//
//            case 9: System.out.println("Sep");
//            break;
//
//            case 10: System.out.println("Oct");
//            break;
//
//            case 11: System.out.println("Nov");
//            break;
//
//            case 12: System.out.println("Dec");
//            break;
//
//            default: System.out.println("Invalid Month");
//            break;
//        }


        //Display number of a String value of Number provided

//         System.out.println("Please provide a string value of any Number between 1-4");
//        String num = sc.nextLine();
//
//        switch(num)
//        {
//            case "one": System.out.println(1);
//            break;
//
//            case "two": System.out.println(2);
//            break;
//
//            case "three": System.out.println(3);
//            break;
//
//            case "four": System.out.println(4);
//            break;
//
//            default: System.out.println("Invalid Number");
//            break;
//        }


        //Display type of Website

        System.out.println("Please emter a website's name");
        String url = sc.nextLine();

        String ext = url.substring(url.lastIndexOf('.')+1);

        switch(ext)
        {
            case "com": System.out.println("Commercial");
            break;

            case "org": System.out.println("Organization");
            break;

            case "gov": System.out.println("Government");
            break;

            default: System.out.println("Invalid Website Name");
            break;
        }












    }
}
