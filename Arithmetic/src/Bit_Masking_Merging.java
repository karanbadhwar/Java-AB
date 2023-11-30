public class Bit_Masking_Merging {
    public static void main (String[] args)
    {
        //SWAPPING
//    int x = 10;
//    int y = 20;
//    System.out.println(x + " " + y);
//    x = x ^ y;
//    System.out.println(x + " " + y);
//    y = x ^ y;
//    System.out.println(x + " " + y);
//    x = x ^ y;
//    System.out.println(x + " " + y);

        // Storing 2 numbers inside one BYTE
//        byte a = 9, b = 12;
        byte c;
        c = (byte)(9<<4);
//        c = (byte)(a<<4);
        c = (byte)(c | 12);
//        c = (byte)(c | b);

        System.out.println((c&0b11110000)>>4);
        System.out.println((c&0b00001111));
    }
}
