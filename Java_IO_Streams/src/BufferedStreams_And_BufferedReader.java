import java.io.*;

public class BufferedStreams_And_BufferedReader {
    public static void main(String[] args) throws IOException
    {
        FileReader fr = new FileReader("C:/users/kbb91/Desktop/A-B-Java/Test.txt");
        BufferedReader br = new BufferedReader(fr);

//        System.out.println("FileReader "+(char)fr.read());

        //Proof that Buffered Reader is Working and holding data in temporary memory
        System.out.println((char)br.read());
        System.out.println((char)br.read());
        System.out.println((char)br.read());
        br.mark(1);
        System.out.println((char)br.read());
        System.out.println((char)br.read());
        System.out.println((char)br.read());
        System.out.println((char)br.read());
        br.reset();
        System.out.println((char)br.read());
        System.out.println((char)br.read());
        System.out.println((char)br.read());

        System.out.println(br.readLine());

        fr.close();
    }
}

//Buffered Stream Example
//public static void main(String[] args) throws IOException
//{
//    FileInputStream fis = new FileInputStream("C:/users/kbb91/Desktop/A-B-Java/Test.txt");
//    BufferedInputStream bis = new BufferedInputStream(fis);
//
////        System.out.println("FileInputStream "+fis.markSupported());// As File Streams cannot move read or move Backwards
////        System.out.println("BufferInputStream "+bis.markSupported()); // True
//
//    //Proof that Buffered Input Stream holds the data
//    System.out.println((char)bis.read());
//    System.out.println((char)bis.read());
//    System.out.println((char)bis.read());
//    bis.mark(10);
//    System.out.println((char)bis.read());
//    System.out.println((char)bis.read());
//    bis.reset();
//
//    System.out.println((char)bis.read());
//    System.out.println((char)bis.read());
//
////        int y;
////        while((y=bis.read()) != -1)
////        {
//////            System.out.format("%03d Byte value of %c", y, (char)y);
//////            System.out.println();
////            System.out.print((char)y);
////        }
//}