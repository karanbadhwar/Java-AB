class Outer
{
    int x = 10;
//    Inner i = new Inner(); // Now Inner class's obj is available to entire class

    class Inner
    {
        int y = 20;
        public void innerDisplay()
        {
            System.out.println(x+" "+y);
        }
    }
    public void outerDisplay()
    {
        Inner i = new Inner();
        i.innerDisplay();
        System.out.println(i.y); // Inner class's variable can only be accessed with Inner class's Object
    }
}

public class Demo_Nested_Inner_Class {
    public static void main (String[] args)
    {
//        Outer o = new Outer();
//        o.outerDisplay();

        Outer.Inner oi = new Outer().new Inner(); // Creating object of Inner Class in Main Class, it will only ref to inner class's variables and methods
//        oi.outerDisplay();  // Cannot Access
        oi.innerDisplay();
    }
}
