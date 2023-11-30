import java.util.Scanner;

public class Student_Challenge_MenuDriven {
    public static void main(String[] args)
    {
        // Menu Driven Program for Arithmetic Operations
        Scanner scan = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("====");
        System.out.println("ADD");
        System.out.println("SUB");
        System.out.println("MUL");
        System.out.println("DIV");

        System.out.println("Enter 2 Numbers:");
        int x = scan.nextInt();
        int y = scan.nextInt();
        System.out.println("Enter option that you want to perform:");
        scan.nextLine();
        String options = scan.nextLine();
        options = options.toUpperCase();
        switch (options)
        {
            case "ADD": System.out.println("Sum is: " + (x+y));
            break;

            case "SUB": System.out.println("Diff is: "+(x-y));
            break;

            case "MUL": System.out.println("Product is: "+ (x*y));
            break;

            case "DIV":System.out.println("Ratios is: "+ (x/y));
            break;

            default:System.out.println("Invalid Operations");
            break;
        }
    }
}
