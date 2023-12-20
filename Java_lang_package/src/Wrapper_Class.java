public class Wrapper_Class {
    public static void main(String[] args) {
        //Primitives being an Object

        //Integer
        //----------------------------

//        Integer a = new Integer(10); // Deprecated Method
        Integer b = Integer.valueOf(10);
        Integer c = Integer.valueOf("10"); // Argument can be either Integer or String
        Integer i = 10;


        //Byte
        //------------------------------

        Byte d =15;
//        Byte e = Byte.valueOf(16);Cannot
        byte bb = 15;
        Byte e = Byte.valueOf(bb);

        Byte f = 15;
        Byte f1 = Byte.valueOf(f);


        //Short
        //------------------------------

        Short s = Short.valueOf("123");
        short s1 = 10; // This is not an Object


        //Float
        //------------------------------

        Float g = 12.3f;
        Float g1 = Float.valueOf("123.5");
        Float g2 = Float.valueOf(123.5f);


        //Double
        //------------------------------

        Double h = Double.valueOf(123.456);
        Double h1 = 1234.56;


        //Character
        //------------------------------

        Character k = Character.valueOf('k');
        Character k1 = 'k';


        //Boolean
        //------------------------------
        Boolean bool = Boolean.valueOf("true");
        Boolean bool1 = Boolean.valueOf(true);


        //Boxing / Wrapping / Auto-Boxing
        //-----------------------------
        byte bt = 15;
        Byte bt1 = Byte.valueOf(bt); //Boxing
        Byte bt2 = bt; // Auto-Boxing


        //Unboxing/ Auto-Unboxing
        //-------------------------------
        int m = 10;
        Integer n = m; // Auto-Boxing
        int z = n.intValue();// Unboxing
        int p = n; // Auto-Unboxing



    }
}
