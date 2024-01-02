import java.io.*;
import java.util.Scanner;

class Customer implements Serializable
{
    String custID;
    String name;
    String phoneNo;
    private static int count = 1;

    //Default Constructor
    public Customer() {}

    //Parameterized- Constructor
    public Customer(String n, String no)
    {
        this.name = n;
        this.phoneNo = no;
        custID = "Cus"+count;
        count++;
    }

    @Override
    public String toString()
    {
        return "Customer ID: "+custID+"\nName: "+name+"\nPhNo: "+phoneNo+"\n"+count;
    }


}

public class SC_Serialize_Customer {
    /* Serialization Done
    public static void main(String[] args) throws Exception
    {
        FileOutputStream fos = new FileOutputStream("C:/users/kbb91/Desktop/A-B-Java/SC-Customer.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        Customer[] customers = new Customer[3];
        customers[0] = new Customer("Karan", "007");
        customers[1] = new Customer("Badhwar", "009");
        customers[2] = new Customer("KB", "001");

        oos.writeInt(customers.length);

        for(Customer c: customers)
            oos.writeObject(c);

        oos.close();
        fos.close();
    }
    */

    public static void main(String[] args) throws Exception
    {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        FileInputStream fis = new FileInputStream("C:/users/kbb91/Desktop/A-B-Java/SC-Customer.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        int length = ois.readInt();

        Customer[] cus = new Customer[length];

        for(int i = 0; i < length; i++)
        {
            cus[i] = (Customer) ois.readObject();

        }

        System.out.println("Enter the name of the Customer");

        String name = sc.nextLine();

        for(int i = 0; i < length; i++)
        {
            if(name.equalsIgnoreCase(cus[i].name))
                System.out.println("Match Found" + "\n"+ cus[i].toString());

        }



        ois.close();
        fis.close();
    }

}
