import java.io.*;

class Student_serial implements Serializable
{
    int rollNo;
    String name;
    String dept;
    float avg;
//    int abc; // cannot deserialize, if this added to the class  after Serialization

    public static int Data = 10;
    public transient int t = 100;

    public Student_serial()
    {

    }

    /**
     *
     * @param r RollNo
     * @param n Name
     * @param d Deptartment
     * @param a Average
     */
    public Student_serial(int r, String n, String d, float a)
    {
        rollNo = r;
        name = n;
        dept = d;
        avg = a;

        Data = 500;
        t = 500;
    }

    public String toString()
    {
        return "\nStudent Details\n"+
                "\nRoll "+rollNo+
                "\nName "+name+
                "\nAverage "+avg+
                "\nDept "+dept+
                "\nData "+Data+
                "\nTransient "+t+"\n";
    }
}

public class Object_Stream_And_Serialisation {
    public static void main(String[] args)  throws Exception
    {

        //Serialisation of Object
//        FileOutputStream fos = new FileOutputStream("C:/users/kbb91/Desktop/A-B-Java/Studetn3.txt");
//
//        ObjectOutputStream oos = new ObjectOutputStream(fos);
//
//        Student_serial s = new Student_serial(7, "KB", "Army", 9.5f);
//
//        oos.writeObject(s);

        //Deserialization of Object
        FileInputStream fis = new FileInputStream("C:/users/kbb91/Desktop/A-B-Java/Studetn3.txt");

        ObjectInputStream ois = new ObjectInputStream(fis);

        Student_serial s1;

        s1 = (Student_serial) ois.readObject();

        System.out.println(s1);


    }

}
