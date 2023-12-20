public class Integer_Wrapper_Class {
    public static void main(String[] args)
    {
        int m1 = 15;

        Integer m2 = m1;

        //Static Methods of Integer Class
        Integer m3 = Integer.valueOf("123");
        Integer m4 = Integer.valueOf("A7", 16);
        Integer m5 = Integer.bitCount(10);
        Integer m6 = Integer.decode("0x876");


        System.out.println(Integer.parseInt("1222"));

        System.out.println(Integer.parseInt("A7", 16));

        System.out.println(Integer.reverse(2));

        System.out.println(Integer.parseInt("11000011111", 2));

        System.out.println(Integer.toBinaryString(1987));

        System.out.println(Integer.parseInt("00010010001101000101011001111000", 2));


    }
}
