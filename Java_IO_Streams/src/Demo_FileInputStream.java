import java.io.*;

public class Demo_FileInputStream {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("c:/users/kbb91/Desktop/A-B-Java/Test.txt"))
        {
            int x;

            while((x=fr.read()) != -1)
            {
                System.out.print((char)x);
            }
        }
        catch(IOException e)
        {
            System.out.println(e);
        }

    }
}


//With FileInputStream
//        try(FileInputStream fis = new FileInputStream("C:/Users/kbb91/Desktop/A-B-Java/Test.txt");)
//        {
////Method 1
////            byte[] b = new byte[fis.available()];
////            fis.read(b);
////
//////            for(byte x:b)
//////                System.out.println(x); This will return ASCII code points for every Character
////
////            String str = new String(b);
////            System.out.println(str);
//
////Method2
//int x;
//
//            do {
//x = fis.read();
//                if(x!=-1)
//        System.out.print((char)x);
//        } while(x!=-1);
//        }
//        catch(IOException e)
//        {
//        System.out.println(e);
//        }