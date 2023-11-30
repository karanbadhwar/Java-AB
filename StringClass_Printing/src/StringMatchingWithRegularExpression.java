public class StringMatchingWithRegularExpression {
    public static void main (String[] args){

        //Quantifier REGEX

        //.*

        String str1 = "abcd $098fed";

//        System.out.println(str1.matches(".*")); //True

        //[a-z]*


        String str2 = "abcdef";
        String str3  = "avc6def";
//        System.out.println(str2.matches("[a-z]*")); //True
//        System.out.println(str3.matches("[a-z]*")); //FAlse

        //[abc]* || [abc]+

        String str4 = "abcccbbaa";
//        System.out.println(str4.matches("[abc]*")); //True
//        System.out.println(str4.matches("[a-z]+")); //True + means One or More

        String str5= "";

//        System.out.println(str5.matches("[a-z]*")); //True 0 or More
//        System.out.println(str5.matches("[a-z]+")); //False 1 or more

        // {X}Times & {X,Y}

        String str6 = "abc";
//        System.out.println(str6.matches("[abc]{3}")); //True

        String str7 = "abcd";
//        System.out.println(str7.matches("[abc]{3}")); //dFalse

        String str8 = "abcf";
//        System.out.println(str8.matches("[a-z]{3,7}")); True

        String str9 = "asdsdasdas";
//        System.out.println(str9.matches("[a-z]{3,7}")); //False

        String strEmail = "john@gmail.com";
        String strEmail2 = "john-ny@gmail.com";
//        System.out.println(strEmail.matches(".*gmail.*")); //True
//        System.out.println(strEmail.matches("\\w*@gmail(.*)")); //True
//        System.out.println(strEmail2.matches("[\\w\\W]*@gmail(.*)")); // True if we want spl chaarcters
    }
}
