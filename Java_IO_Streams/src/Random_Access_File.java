import java.io.*;

public class Random_Access_File {
    public static void main(String[] args) throws Exception
    {
        RandomAccessFile rac = new RandomAccessFile("C:/users/kbb91/Desktop/A-B-Java/Data.txt", "rw");
        System.out.println((char)rac.read());
        System.out.println((char)rac.read());
        System.out.println((char)rac.read());
        rac.write('d');// will overwrite at the Pointer
        System.out.println((char)rac.read());

        rac.skipBytes(3); // will move to 'I'

        System.out.println((char)rac.read());

        rac.seek(3); // will move back to 'd'
        System.out.println((char)rac.read());

        System.out.println("File Pointer at: "+rac.getFilePointer()); // File Pointer position after performing tasks as mentioned previous

       rac.seek(rac.getFilePointer() + 2); // if we don't want to count inside seek method

        System.out.println((char)rac.read());

        rac.close();
    }
}
