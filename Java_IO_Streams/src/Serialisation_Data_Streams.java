import java.io.*;

class Student_S
{
    int rollNo;
    String name;
    String dept;
    float avg;
}

public class Serialisation_Data_Streams {
    public static void main(String[] args) throws Exception
    {

        //Writing to the File
        //---------------------------------------
        FileOutputStream fos = new FileOutputStream("C:/users/kbb91/Desktop/A-B-Java/Student2.txt");

        DataOutputStream dos = new DataOutputStream(fos);

        Student_S s = new Student_S();
        s.rollNo = 007;

        s.name = "Badhwar";
        s.dept = "Army";
        s.avg = 12.5f;

        dos.writeInt(s.rollNo);
        dos.writeUTF(s.dept);
        dos.writeUTF(s.name);
        dos.writeFloat(s.avg);

        dos.close();
        fos.close();

        //Reading from File
        //---------------------------------------------------

        FileInputStream fis = new FileInputStream("C:/users/kbb91/Desktop/A-B-Java/Student2.txt");
        DataInputStream dis = new DataInputStream(fis);

        Student_S stu = new Student_S();

        //Data should be read in the order they were created otherwise we might not be able to read it
        stu.rollNo = dis.readInt();
        stu.name = dis.readUTF();
        stu.dept = dis.readUTF();
        stu.avg = dis.readFloat();

        System.out.println("Roll no: "+stu.rollNo);
    }
}
