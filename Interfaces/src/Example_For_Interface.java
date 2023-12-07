class Phone
{
    public void call() {System.out.println("Phone Call");}
    public void sms() {System.out.println("Phone SMS");}
}

interface ICamera
{
    void click();
    void record();
}

interface IMusicPlayer
{
    void play();
    void stop();
}

class SmartPhone extends Phone implements ICamera, IMusicPlayer
{
    public void videoCall() {System.out.println("Smart Phone Video Call");}

    //Overrided Methods of ICamera
    public void click() {System.out.println("Smart Phone Clicking Photo");}
    public void record() {System.out.println("Smart Phone recording Video");}

    //Overrided Methods of IMusic
    public void play() {System.out.println("Smart Phone Playing Music");}
    public void stop() {System.out.println("Smart Phone Stopped Playing Music");}
}

public class Example_For_Interface {
    public static void main (String[] args)
    {
//        SmartPhone sp = new SmartPhone();
//
//        sp.call();
//        sp.click();
//        sp.play();

//        Phone p = new SmartPhone();
//        p.call();
//        p.click(); // Not Accessible

//        ICamera sp = new SmartPhone();
//        sp.click();
//        sp.call(); // Not Accessible


//        IMusicPlayer sp = new SmartPhone();
//        sp.play();
//        sp.call(); // Not Accessible

    }
}
