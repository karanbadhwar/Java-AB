import java.io.*;

public class SC_CopyAFile {
    public static void main(String[] args) throws Exception
    {
        try
        {
            FileWriter fw = new FileWriter("C:/users/kbb91/Desktop/A-B-Java/source1");
            String str = "MAYAOOOooo\nAYAMoooo\n";
            fw.write(str);

            fw.close();

            FileReader fr = new FileReader("C:/users/kbb91/Desktop/A-B-Java/source1");
            FileWriter  fos = new FileWriter("C:/users/kbb91/Desktop/A-B-Java/source2");
            int b;
            while((b=fr.read()) != -1)
            {
                if(b>=65 && b<= 90) fos.write(b+32);
                else fos.write(b);
            }
            fr.close();
            fos.close();
        }
        catch(IOException e)
        {
            System.out.println(e);
        }


            FileInputStream fis = new FileInputStream("C:/users/kbb91/Desktop/A-B-Java/source1");
            FileInputStream fis2 = new FileInputStream("C:/users/kbb91/Desktop/A-B-Java/source2");
            FileOutputStream fos = new FileOutputStream("C:/users/kbb91/Desktop/A-B-Java/Destination.txt");
            SequenceInputStream sis = new SequenceInputStream(fis, fis2);
            int x;

            while((x=sis.read()) != -1)
            {
                fos.write(x);
            }

            fos.close();
            fis.close();
            fis2.close();
            sis.close();

    }
}
