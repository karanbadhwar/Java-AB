public class RegularExpressions {
    public static void main (String[] args){

        //Regex

        String str1 = "f";
//        System.out.println(str1.matches(".")); //True
        String str2 = "abc";
//        System.out.println(str2.matches(".")); // False More than one Character
//        System.out.println(str2.matches("[abc]"));//False more than one character

        String str3 = "a";
//        System.out.println(str3.matches("[abc]")); //True Character that matches between a,b or c
//        System.out.println(str2.matches("[abc]")); //False more than one character

        String str4 = "p";
//        System.out.println(str4.matches("[^abc]")); //True value "p" is out of range a,b, or c

        String str5 = "g";
        String str6 = "7";
//        System.out.println(str5.matches("[a-z0-9]")); //True
//        System.out.println(str6.matches("[a-z0-9]")); //True

        //Multiple symbols
        String str7 = "a7";
        String str8 = "a";
        String str9 = "7a";
//        System.out.println(str7.matches("[a-z][0-9]")); //True It offers Accexptence for about 260 Patterns 26 Alphabets * 10 Digits
//        System.out.println(str8.matches("[a-z][0-9]")); //False
//        System.out.println(str9.matches("[a-z][0-9]")); //False

        String str10 = "abc";
//        System.out.println(str10.matches("abc")); //Exactly same characters and  number of characters

        //Meta Characters
        String str11 = "a";
//        System.out.println(str11.matches("\\w")); // True Meta chaarcters goes wit hextra slash \\w

        String str12 = "$";
//        System.out.println(str12.matches("\\d")); //False Only Number
//        System.out.println(str12.matches("\\W")); //True Spl. Characters

        String str13= " ";
//        System.out.println(str13.matches("\\s")); //True for space


    }
}
