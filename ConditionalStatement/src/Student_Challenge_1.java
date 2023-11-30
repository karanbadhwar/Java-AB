import java.util.Scanner;
public class Student_Challenge_1 {
    public static void main(String[] args)
    {
        // Find if a number is Odd or Even
        int n;
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter an Integer Number to check if the number is Odd or Even");
//        n = sc.nextInt();
//
//        if(n % 2 == 0){
//            System.out.println("EVEN");
//        } else {
//            System.out.println("ODD");
//        }

        //Find if a person is Young or not through Age
        int age;

//        System.out.println("Enter your age");
//        age = sc.nextInt();
//        if( age >= 14 && age <= 55){
//            System.out.println("You are still Young");
//        }else if (age > 55) {
//            System.out.println("You are old");
//
//        } else {
//            System.out.println("You are still a baby");
//        }

        // Find Grades for Given Marks
        float m1,m2,m3;
        float avg;
        System.out.println("Enter marks for 3 subjects");
        m1 = sc.nextFloat();
        m2 =sc.nextFloat();
        m3 = sc.nextFloat();

       avg = (m1+m2+m3)/3;

        if(avg >= 70){
            System.out.println("A");
        } else if( avg < 70 && avg >=60){
            System.out.println("B");
        } else if(avg < 60 && avg >=50){
            System.out.println("C");
        } else if(avg < 50 && avg >= 40){
            System.out.println("D");
        } else {
            System.out.println("F");
        }

    }

    }

