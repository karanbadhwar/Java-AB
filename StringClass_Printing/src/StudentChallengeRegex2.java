import java.lang.*;
public class StudentChallengeRegex2 {
    public static void main (String[] args){

        //Remove Special Characters from a String

//        String str = "a!B@c#1$2 %3";
//        System.out.println(str.replaceAll("[\\W]", ""));

        //Remove Extra Spaces from String

//        String str = "     abc   d$ef   gh";
//        System.out.println(str.replaceAll("\\s+", " ").trim());
//        System.out.println(str);

        //Find Number of Words in String

        String str = "     abc   d$ef   gh  ";
        str = str.replaceAll("\\s+", " ").trim();
       String words[] = str.split("\\s");
        System.out.println(str);
        System.out.println(words.length);
    }
}
