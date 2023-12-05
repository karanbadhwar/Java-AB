class TV
{
    public void switchON() { System.out.println("TV is Switched ON");}
    public void changeChannel() { System.out.println("TV's Channel Changed");}

    public void Box(){System.out.println("It is a Box TV");}
}

class SmartTV extends TV
{
    @Override
    public void switchON() { System.out.println("SmartTV is Switched ON");}

    @Override
    public void changeChannel() { System.out.println("SmartTV's Channel Changed");}

    public void browse() { System.out.println("SmartTV Browsing");}
}

public class Method_Overriding_EX1 {
    public static void main(String... args)
    {
//        TV t = new TV();
//        t.changeChannel();
//        t.switchON();

//        SmartTV st = new SmartTV();
//        st.browse();
//        st.changeChannel();
//        st.switchON();

        TV t = new SmartTV(); // This is Allowed
//        SmartTV st = new TV(); // This is not allowed, Child cannot be contained a ref to it's Parent Object

        t.switchON();
        t.Box();
        t.changeChannel();
//        t.browse();
    }
}
