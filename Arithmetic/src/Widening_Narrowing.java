public class Widening_Narrowing {
    public static void main(String [] args)
    {
//        short s = 10;
//        int i = 20;
//        s = i; This is Error
//        i = s; // THis works fine

        byte b = 10;
        short s = 10;
        int i = 10;
        long l = 10;
        float f = 10;
        double d = 10;
        char c = 10;
        boolean bl = true;

        //Conversion done but loss of data
        byte bt = 10;
        short st = 9999;
        bt = (byte)st;
//        System.out.println(bt); // 15 is the output
        float ft = 10.5f;
        int it = (int)ft;

//        System.out.println(it); // 10 is the output loss of 0.5
    }

}
