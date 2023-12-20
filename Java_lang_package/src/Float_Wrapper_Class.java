public class Float_Wrapper_Class {
    public static void main(String[] args)
    {
        float a = 12.5f;
        Float b = 12.5f;

//        System.out.println(b==Float.POSITIVE_INFINITY);

        Float c = -12.5f/0;
//        System.out.println(b== Float.NEGATIVE_INFINITY);

        Double d = Math.sqrt(-1);
//        System.out.println(d.isNaN());
//        System.out.println(d != Double.NaN); // Not use


        char k = '1';
        char l = 'A';
//        System.out.println(Character.isLetter(k));
//        System.out.println(Character.isLetter(l));


        Boolean bool = true;

//        System.out.println(Boolean.logicalAnd(bool, true));

//        System.out.println(Boolean.parseBoolean("false"));
    }
}
