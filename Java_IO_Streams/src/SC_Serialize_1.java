import java.io.*;

public class SC_Serialize_1 {
    public static void main(String[] args) throws Exception
    {
//        float list[] = {10.3f, 2.9f, 6.4f,3.7f};
//
//        FileOutputStream fos = new FileOutputStream("C:/users/kbb91/Desktop/A-B-Java/SC-Data.txt");
//
//        DataOutputStream dos = new DataOutputStream(fos);
//
//        int size = list.length;
//
//        dos.writeInt(size);
//
//        for(Float f: list)
//            dos.writeFloat(f);
//
//        dos.close();
//        fos.close();

        FileInputStream fis = new FileInputStream("C:/users/kbb91/Desktop/A-B-Java/SC-Data.txt");

        DataInputStream dis = new DataInputStream(fis);

        int length = dis.readInt();

        float data[] = new float[length];

        for(int i = 0; i < length; i++)
        {
            data[i] = dis.readFloat();
        }

        for (float d: data)
            System.out.println(d);

        dis.close();
        fis.close();
    }
}
