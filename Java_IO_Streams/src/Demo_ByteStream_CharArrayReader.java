import java.io.*;

public class Demo_ByteStream_CharArrayReader  {
    public static void main(String[] args) throws Exception
    {
        char c[] = {'a','b','c','d','e','f','g','h','i','j'};

        CharArrayReader cr = new CharArrayReader(c);

        int y;
        while((y=cr.read()) != -1)
        {
//            System.out.println((char)y);
        }

        cr.close();

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        bos.write('a');
        bos.write(123);
        bos.write(244);

        bos.writeTo(new FileOutputStream("C:/users/kbb91/Desktop/A-B-Java/Testing.txt"));

        byte b[] = bos.toByteArray();
        for (byte z: b)
            System.out.println("value: "+z);



        CharArrayWriter cw = new CharArrayWriter();

        cw.write(123); // writes ASCII encoded "{"

        char[] a  = cw.toCharArray();
        FileWriter fw  = new FileWriter("C:/users/kbb91/Desktop/A-B-Java/Testing1.txt");
        cw.writeTo(fw);
        fw.flush();
        fw.close();
        cw.close();

        for (char z: a)
            System.out.println(z);

    }

}


//ByteArrayInputStream
//    public static void main(String[] args) throws Exception
//    {
//        byte[] b = {'a','b','c','d','e','f','g','h','i','j'};
//
//        ByteArrayInputStream bis = new ByteArrayInputStream(b);
//
//        //Method 1
////        int x = bis.read();
////        while(x != -1)
////        {
////            System.out.format("%03d", x);
////            System.out.println(" "+(char)x);
////            x= bis.read();
////        }
//
//        //Method 2
//        byte bb[] = bis.readAllBytes();
//        String str = new String(bb);
//        System.out.println(bis.markSupported());
//
//        bis.close();
//    }

//----------------------------------------------------------------------------------------

//ByteArrayOutputStream
//public static void main(String[] args) throws Exception
//    {
//        ByteArrayOutputStream bos = new ByteArrayOutputStream(20);
//
//        bos.write('a');
//        bos.write('b');
//        bos.write('c');
//        bos.write('d');
//
//        //Method 1
////        byte b[] = bos.toByteArray(); // Flushing out array from Buffer
//
//        //Method 2
//        bos.writeTo(new FileOutputStream("C:/users/kbb91/Desktop/A-B-Java/Test2.txt"));
////        bos.writeTo(new ByteArrayOutputStream());
//
//
//        bos.close();
//    }