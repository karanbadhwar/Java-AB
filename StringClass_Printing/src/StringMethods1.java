//import java.util.Scanner;
public class StringMethods1 {
    public static void main (String[] args)
    {
        // String Objects are Immutable!!

        // Memory allocation after alteration of String Value or Object
        String str = "Java";
        String str1 = new String("JAVA");

        int l = str.length();
//        System.out.println(l); Length of str
//        str = str.toUpperCase();
//        str1 = str1.toLowerCase();
//        System.out.println(str);
//        System.out.println(str1);


        // Trim
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please Enter String Value to Trim");
        String inputStr = "    karan   ";
//        System.out.println(inputStr);
        inputStr = inputStr.trim();
//        System.out.println(inputStr);

        //SubString
        String subStr = "welcome";
        subStr = subStr.substring(3);
//        System.out.println(subStr); //come

//        subStr = subStr.substring(3,6); // Not Including 6th position
//        System.out.println(subStr); // com

        //Replace
        String replaceStr = "welcome";

        replaceStr = replaceStr.replace('e', 'k');

//        System.out.println(replaceStr);

    }
}
