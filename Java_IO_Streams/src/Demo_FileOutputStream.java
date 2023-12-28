import java.io.*;

public class Demo_FileOutputStream  {
    public static void main(String[] args)
    {
        try (FileOutputStream fos = new FileOutputStream("C:/Users/kbb91/Desktop/A-B-Java/Test.txt"))
        {

            String str = "Learn Java Programming";

            //Method 1
            fos.write(str.getBytes());


            //Method 2
//            byte b[] = str.getBytes();
//            for(byte x: b)
//                fos.write(x);

            //Method 3
//            byte b[] = str.getBytes();
//            fos.write(b, 6,str.length()-6);

        }
        catch(FileNotFoundException e)
        {
            System.out.println(e);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }

    }
}
