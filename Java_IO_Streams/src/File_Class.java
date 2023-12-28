import java.io.*;

public class File_Class {
    public static void main(String[] args) throws Exception
    {
        File f = new File("C:/users/kbb91/Desktop/A-B-Java");

        System.out.println(f.isDirectory());

       String[] list = f.list();

       File[] lists = f.listFiles();


//       for(File x: lists)
//       {
//           System.out.print(x.getName()+" : ");
//           System.out.println(x.getPath());
//
//           System.out.println(x.getParent());
//       }

        File f1 = new File("C:/users/kbb91/Desktop/A-B-Java/Data.txt");

//        f1.setReadOnly();
//        FileOutputStream fos = new FileOutputStream("C:/users/kbb91/Desktop/A-B-Java/Data.txt"); //It will give Error, as Output Stream is for Writing

        f1.setWritable(true);
        FileOutputStream fos = new FileOutputStream("C:/users/kbb91/Desktop/A-B-Java/Data.txt"); // it is fine



    }
}
