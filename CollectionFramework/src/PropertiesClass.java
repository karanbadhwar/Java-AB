import java.io.*;
import java.util.Properties;

public class PropertiesClass {
    public static void main(String[] args) throws Exception
    {
        Properties p = new Properties();

        /*p.setProperty("Brand", "Dell");
        p.setProperty("Processor", "i7");
        p.setProperty("OS", "Windows");
        p.setProperty("Model", "Latitude");*/

//        p.store(new FileOutputStream("C:/users/kbb91/Desktop/A-B-Java/Propertyfile"), "Laptop");

//        p.storeToXML(new FileOutputStream("C:/users/kbb91/Desktop/A-B-Java/Propertyfile1.xml"), "Laptop");

//        p.loadFromXML(new FileInputStream("C:/users/kbb91/Desktop/A-B-Java/Propertyfile1.xml"));
        p.load(new FileInputStream("C:/users/kbb91/Desktop/A-B-Java/Propertyfile"));

        System.out.println(p.getProperty("Brand"));
        System.out.println(p);

    }
}
