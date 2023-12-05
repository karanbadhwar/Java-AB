class CellPhone
{
    public String phoneNo;
    public long imie;

    //Constructors
    public CellPhone(long imie)
    {
        this.imie = imie;
    }

    public CellPhone(long imie, String phoneNo){ this.imie = imie; this.phoneNo = phoneNo; }

    //Getters

    public String getPhoneNo(){ return phoneNo; }

    public long getImie(){ return imie; }

    //Setters
    public void setPhoneNo(String phn) { this.phoneNo = phn;}

    //Methods

    public void call() { System.out.println("Call Outgoing");}
    public void Sms() { System.out.println("SMS Outgoing");}
    public void saveContact() { System.out.println("Contact Saved");}
    public void deleteContact() { System.out.println("Contact Deleted");}

}

class SmartPhone extends CellPhone
{
    private long macNo;

    //Constructor
    public SmartPhone(long imie, String phoneNo, long macNo)
    {
        super(imie, phoneNo);
        this.macNo = macNo;
    }

    //Getters
    public long getMacNo(){System.out.println(macNo); return macNo;}

    //Methods
    public void play(){ System.out.println("Music Playing");}
    public void click(){ System.out.println("Picture Clicking");}
}




public class Student_Challenge_CellPhone {
    public static void main (String ...args)
    {
        SmartPhone s = new SmartPhone(1234567l, "4379944830",398238238);
        s.getMacNo();

        System.out.println(s.getPhoneNo());
    }
}
