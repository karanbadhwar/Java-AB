public class StringMethods3 {
    public static void main (String[] args){
    String s1 = "java";
    String s2 = "java";
    String s3 = "JAVA";

    String s4 = new String("java");

    String s5 = "pyramid";
    String s6 = "Pyramid";

    //equals(String s) & equalsIgnoreCase(String s)
//      System.out.println(s1.equals(s4)); // True, as not checking reference, only literal
//      System.out.println(s1.equals(s2)); // True literal is same

//        System.out.println(s1.equalsIgnoreCase(s3)); //True as it ignores Case

        //equals() && == is not same one checks for Literals only and the other one checks for references

        //ComapreTo(String s)

//        System.out.println(s2.compareTo(s1)); //0 as both are same on dictionary level

//        System.out.println(s2.compareTo(s3)); //32 gives the result that is difference between the first character as per Unicode values
//          System.out.println(s2.compareTo(s3)); //32 means s2 is greater than s3

//        System.out.println(s2.compareTo(s5)); //-6 that means that means s2 is smaller and s5 is greater

        String str1 = "china wall";
        String str2 = "china tall";
        String str3 = "china all";
//        System.out.println(str1.compareTo(str2)); //3 as str1 is greater than str2 "china" is same but mismatch is "w" and "t", diff b/w "w" and "t" is 3
//        System.out.println(str1.compareTo(str3)); //22 ASCII code diff

        //contains(char c[])

        String containStr = "the great wall of china";

//        System.out.println(containStr.contains("wall")); //true


        //ValueOf(boolean b || char c || .....)

    }
}

