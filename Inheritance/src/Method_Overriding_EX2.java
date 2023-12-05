class Car
{
    public void start() { System.out.println("Car Started");}
    public void accelerate() { System.out.println("Car Accelerated");}
    public void changeGear() { System.out.println("Car Gear Changed");}
}

class LuxuryCar extends Car
{
    @Override
    public void changeGear() { System.out.println("Luxury Car Gear Changed Automatically");}
    public void openRoof() {System.out.println("Sunroof is Opened");}
}


public class Method_Overriding_EX2 {
    public static void main (String ...args)
    {
//        Car c = new Car();
//        c.start();
//        c.accelerate();
//        c.changeGear();

//        LuxuryCar lc = new LuxuryCar();
//        lc.start();
//        lc.accelerate();
//        lc.changeGear();
//        lc.openRoof();


        Car lc = new LuxuryCar();
        lc.start();
        lc.accelerate();
        lc.changeGear();
//        lc.openRoof(); // This is not accetable as the Ref Var is of Superclass and holding a ref for Sublcass
    }
}
