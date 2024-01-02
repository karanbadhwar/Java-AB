import java.io.*;
import java.nio.Buffer;

class Student
{
    int rollNo;
    String name;
    String dept;

    public void abc(String name){}

}

public class Print_Stream_Class {
    public static void main(String[] args) throws Exception {
        //Writing an object to file
        FileOutputStream fos = new FileOutputStream("C:/users/kbb91/Desktop/A-B-Java/Student1.txt");
        PrintStream ps = new PrintStream(fos);

        Student s = new Student();

        s.rollNo = 7;
        s.name = "Karan";
        s.dept = "CSE";

        ps.println(s.rollNo);
        ps.println(s.name);
        ps.println(s.dept);

        ps.close();

        fos.close();

        //Reading an Object from File
        FileInputStream fis = new FileInputStream("C:/users/kbb91/Desktop/A-B-Java/Student1.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));

//        FileReader fr = new FileReader("C:/users/kbb91/Desktop/A-B-Java/Student1.txt");
//
//        BufferedReader br1 = new BufferedReader(fr);



        //int a = fis.read();
//        System.out.println(a);

//        BufferedInputStream bis = new BufferedInputStream(fis);
//        byte[] b = bis.readAllBytes();
//        String str = new String(b);
//        System.out.println(str);


        Student s1 = new Student();
        s1.rollNo = Integer.parseInt(br.readLine());
        s1.name = br.readLine();
        s1.dept = br.readLine();

        System.out.println("Roll no: "+s1.rollNo);
        System.out.println("Name: "+s1.name);
        System.out.println("Dept: "+s1.dept);






    }
}
