class ATM
{

        synchronized void checkBalance (String name,int balance)
        {
            System.out.println(name + ", Your Balance is: " + balance);
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }

        synchronized void withdraw (String name,int withdraw)
        {
            System.out.println(name + ", you have withdrawn: " + withdraw);
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }

}

class Customer extends Thread
{
    ATM atm;
    String name;
    int withdrawAmount;
    int balance = Integer.MAX_VALUE;
    public Customer(ATM atm,String name, int amount)
    {
        this.atm = atm;
        this.name = name;
        this.withdrawAmount = amount;
    }

    void useAtm()
    {
        atm.checkBalance(name,balance);
//        try // This Try will put a hold, and it would not been able to achieve Synchronized MultiThreading, as it holding current Thread
//        {
//            Thread.sleep(100);
//        }
//        catch (InterruptedException e)
//        {
//            System.out.println(e);
//        }
        atm.withdraw(name,withdrawAmount);
    }

    @Override
    public void run()
    {
        useAtm();
    }
}

public class Student_Challenge_ATM_Machine {
    public static void main(String[] args)
    {
        ATM atm = new ATM();
        Customer cus1 = new Customer(atm, "Karan", 20000);
        Customer cus2 = new Customer(atm, "Badhwar", 10000);

        cus1.start();
        cus2.start();
    }
}
