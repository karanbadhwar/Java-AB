class Store
{
    IMember mem[] = new IMember[100];
//    Customer mem[] = new Customer[100];
    int count = 0;

    public void register(IMember m)
    {
        mem[count++] = m;
    }

    public void inviteSale()
    {
        for (int i = 0; i < count; i++)
        {
            mem[i].callback();
        }
    }
}

interface IMember
{
    void callback();
}

class Customer implements IMember
{
    String name;
    Customer(String name)
    {
        this.name = name;
    }
    public void callback()
    {
        System.out.println("Please "+name+", visit our Store for Deals");
    }
}

public class Student_Challenge_CallBack_Method {
    public static void main (String[] args)
    {
        Store s = new Store();
        Customer cus1 = new Customer("karan");
        Customer cus2 = new Customer("badhwar");

        s.register(cus1);
        s.register(cus2);

        s.inviteSale();

    }
}
