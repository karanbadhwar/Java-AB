import java.util.*;
import java.io.*;

public class StringTokenizerClass {
    public static void main(String[] args) throws Exception {
//        String data = "name=Karan address=ludhiana country=india dept=army";

//        FileInputStream fis = new FileInputStream("C:/users/kbb91/Desktop/A-B-Java/Propertyfile");
//        byte b[] = fis.readAllBytes();
//        String data = new String(b);
//
//
//        StringTokenizer stk = new StringTokenizer(data, "=");
//
//        String s;
//
//        while (stk.hasMoreTokens()) {
//            s = stk.nextToken();
//            System.out.println(s);
//
//        }


        FileInputStream fis = new FileInputStream("C:/users/kbb91/Desktop/A-B-Java/intData.txt");
        byte b[] = new byte[fis.available()];
//        ArrayList<Integer> al1 = new ArrayList<>();
//
//        al1.add(fis.read());
//
//        System.out.println(al1);
        fis.read(b);
//        int a = fis.read();
//        int c = fis.read();
//
//        System.out.println(a);
//        System.out.println(c);

        String data1 = new String(b);

        String s;
        ArrayList<Integer> al = new ArrayList<>();
        StringTokenizer stk1 = new StringTokenizer(data1, ",");

        while(stk1.hasMoreTokens())
        {
            s = stk1.nextToken();
//            al.add(Integer.parseInt(s));
            al.add(Integer.valueOf(s));
        }

        System.out.println(al);


    }
}
