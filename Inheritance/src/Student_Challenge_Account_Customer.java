class Account
{
    public String accNo;
    public String name;
    public String address;
    public String phoneNo;
    public String DOB;
    public double balance;

    //Constructors
    public Account(String accNo, String name, String DOB)
    {
        this.accNo = accNo;
        this.name = name;
        this.DOB =DOB;
        this.balance = 0;
    }

    public Account(String accNo, String name, String DOB, double balance, String address, String phoneNo)
    {
        this.accNo = accNo;
        this.name = name;
        this.DOB =DOB;
        this.balance = balance;
        setAddress(address);
        setPhoneNo(phoneNo);
    }

    //Getters
    public String getAccNo()
    {
        return accNo;
    }

    public String getName()
    {
        return name;
    }

    public String getAddress()
    {
        return address;
    }

    public String getDOB()
    {
        return DOB;
    }

    public double getBalance()
    {
        return balance;
    }

    public String getPhoneNo()
    {
        return phoneNo;
    }

    //Setters
    public void setAddress(String add)
    {
        this.address = add;
    }

    public void setPhoneNo(String phn)
    {
        this.phoneNo = phn;
    }

    //Methods
    public void closeAccount()
    {
        System.out.println("Account has been closed & the funds have been transferred successfully.");
    }

}

class SavingsAccount extends Account
{
    public SavingsAccount(String accNo, String name, String DOB) {
        super(accNo, name, DOB);
    }

    public void deposit(double add)
    {
        if(add < 0) {


            balance = balance + 0;
            System.out.println(balance);
        }
        else
            balance = balance + add;

        System.out.println(balance);
    }

    public void withdraw(double minus)
    {
        if(minus < 0)
        {
            balance = balance - 0;
            System.out.println(balance);
        }
        else
            balance = balance - minus;

        System.out.println(balance);
    }

}



public class Student_Challenge_Account_Customer {
    public static void main (String ...args)
    {
        SavingsAccount s = new SavingsAccount("abc", "karan", "12-25-1994");
        s.deposit(30);
    }
}
