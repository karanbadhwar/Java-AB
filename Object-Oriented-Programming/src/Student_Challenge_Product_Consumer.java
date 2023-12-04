class Product
{
    private String itemNo;
    private String name;
    private float price;
    private byte qty;

    //Getters
    public String getItemNo()
    {
        return itemNo;
    }

    public String getName()
    {
        return name;
    }

    public float getPrice()
    {
        return price;
    }

    public byte getQty()
    {
        return qty;
    }

    //Setters
    public void setPrice(float p)
    {
        if(price < 0)
            price = 0;
        else price = p;
    }

    public void setQty(byte q)
    {
        if(q < 0)
            qty = 0;
        else qty = q;
    }

    //Constructor
    public Product(String itemNo)
    {
        itemNo = itemNo;
    }

    public Product(String itemNo, String name)
    {
        itemNo = itemNo;
        name = name;
//        price = 0;
//        qty = 0;

    }

    public Product(String itemNo, String name, float price, byte qty)
    {
        itemNo = itemNo;
        name = name;
        setPrice(price);
        setQty(qty);
    }

}

class Consumer
{
    private String custId;
    private String name;
    private String address;
    private String phoneNo;

    //Constructors
    public Consumer(String custId, String name)
    {
        custId = custId;
        name = name;
    }

    public Consumer(String custId, String name, String address, String phoneNo)
    {
        custId = custId;
        name = name;
        setAddress(address);
        setPhoneNo(phoneNo);
    }


    //Getters
    public String getCustId()
    {
        return custId;
    }

    public String getName()
    {
        return name;
    }

    public String getAddress()
    {
        return address;
    }

    public String getPhoneNo()
    {
        return phoneNo;
    }


    //Setters
    public void setAddress(String add)
    {
        address = add;
    }

    public void setPhoneNo( String phn)
    {
        phoneNo = phn;
    }


}

public class Student_Challenge_Product_Consumer {

    public static void main (String[] args)
    {
        Product p = new Product("1Abc", "Rim");
        p.setPrice(10);
        p.setQty((byte) 20);

        System.out.println(p.getQty());

        Product p1 = new Product("2Abc", "Tirre");
        System.out.println(p1.getQty());

    }
}
