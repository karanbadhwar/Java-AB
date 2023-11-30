import java.lang.*;
public class Printing {
    public static void main (String[] args){
        int x = 10, y = 20;
        int negInt = -10;
        float b = 12.55f;
        char c = 'A';
        String str = "Java Program";
        float f = 125.6f;
        float negF = 0.0012f;
        float longF = 12345678.45678f;
        //Below 2 methods are presented
        // System.out.print() && System.out.println()

//        System.out.println(str);
//        System.out.println(x+y);
//        System.out.println(x+y+" :Sum");
//        System.out.println("Sum: "+x+y); Output = sum: 1020
//        System.out.println("Sum: "+ (x+y));
//        System.out.println("Sum of "+x+" and "+y+" is "+(x+y));
//        System.out.print(x);
//        System.out.println(y);
//        System.out.println(str);

        //Below 2 Methods are presented
        //System.out.printf() & System.out.format()

//        System.out.printf("hello\n"); // \n is a format specifier and moves the cursor to next line
//        System.out.printf("Hello %d %f %c World\n", x,b,c);

//        System.out.printf("Hello %e \n", f);
//        System.out.printf("Hello %e \n", negF);
//          System.out.printf("Hello %s \n", str);

//        System.out.printf("%3$s %2$f %1$d", x,b, str);

        //Below [flags][width][.precision] is explained nad executed

//        System.out.printf("%5d",x); //Width


//        System.out.printf("%(5d", negInt); //Flag "("
//        System.out.printf("%+5d", negInt); //Flag "+"
//        System.out.printf("%6.2f", b); //Width for Float
//        System.out.printf("%6.2f", longF); //Width
//        System.out.printf("%07.2f", f); //Width + Flag

//        System.out.printf("%20s", str); // width
//        System.out.printf("%-20s", str); //Flag = "-" and Width
        System.out.printf("%-20d", x);
    }

}
