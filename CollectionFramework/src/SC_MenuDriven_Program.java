import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

class Account implements Serializable
{
    String accNo;
    String name;
    double balance;

    Account() {}

    Account (String accNo, String name, double balance)
    {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }

    public String toString()
    {
        return "Account No: "+accNo+"\nName:"+name+"\nBalance: "+balance;
    }
}

public class SC_MenuDriven_Program {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        HashMap<String, Account> hm = new HashMap<>();
        Account acc = null;
        try
        {
            FileInputStream fis = new FileInputStream("C:/users/kbb91/Desktop/A-B-Java/Accounts.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            int count = ois.readInt();

            for(int i = 0; i < count; i++)
            {
                acc = (Account) ois.readObject();
                System.out.println(acc);
                hm.put(acc.accNo, acc);

            }

            ois.close();
            fis.close();

        }
        catch(Exception e)
        {
            System.out.println(e);
        }


        FileOutputStream fos = new FileOutputStream("C:/users/kbb91/Desktop/A-B-Java/Accounts.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        System.out.println("Menu");

        int choice;
        String name, accNo;
        double balance;

        do {
            System.out.println("1. Create Account");
            System.out.println("2. Delete Account");
            System.out.println("3. View Account");
            System.out.println("4. View  All Accounts");
            System.out.println("5. Save Accounts");
            System.out.println("6. Exit");
            System.out.println("Enter your choice ");
            choice = sc.nextInt();
            sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            switch(choice)
            {
                case 1:
                    System.out.println("Please enter your Details in the following manner Account Number, Name, Balance");
                    accNo = sc.nextLine();
                    name = sc.nextLine();
                    balance = sc.nextDouble();
                    acc = new Account(accNo, name, balance);
                    hm.put(accNo, acc);
                    System.out.println("Account created for: "+name);
                    break;

                case 2:
                    System.out.println("Enter the Account Number for the account you want to Delete");
                    accNo = sc.nextLine();
                    hm.remove(accNo);
                    System.out.println("Account Deleted!");
                    break;

                case 3:
                    System.out.println("Enter the Account Number");
                    accNo = sc.nextLine();
                    System.out.println(hm.get(accNo));
                    break;

                case 4:
                    System.out.println("Viewing All Accounts");
                    for(Account a: hm.values())
                        System.out.println(a);
                    break;

                case 5:
                case 6:
                    System.out.println("Exiting");
                    oos.writeInt(hm.size());
                    for(Account a: hm.values())
                        oos.writeObject(a);
                    break;
            }
        } while(choice != 6);
        oos.flush();
        oos.close();
        fos.close();
    }
}
